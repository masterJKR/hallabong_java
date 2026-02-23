/* admin_ui.js */
/* HTML 태그들을 그리는 데 사용하는 함수들을 모아둠 */

// 메뉴 등록하는 폼을 모달 속에 생성
function showAddForm() {
    let modal = document.getElementById("modalWrap");
    modal.classList.remove("hidden");

    let contentField = modal.querySelector(".content");
    contentField.classList.add("add");
    let contentHtml = `
        <div class="modalTitleBox">
            <p>등 록 하 기</p><br>
            <span>등록할 메뉴를 입력해주세요</span>
        </div>
        <div class="resultBox">
            <form id="addForm">
                <div class="inputBox">
                    <label>이름</label>
                    <input type="text" name="menuName" required>
                </div>
                <div class="inputBox">
                    <label>가격</label>
                    <input type="number" name="price" step="100" min="0" required>
                </div>
                <div class="inputBox">
                    <label>분류</label>
                    <input type="text" name="category" required>
                </div>
                <div class="inputBox">
                    <label>사진</label>
                    <input type="file" name="menuImg" accept="image/*" required>
                </div>
            </form>
        </div>
        <div class="addBtnBox">
            <button class="send" onclick="sendAddMenu()">등 록</button>
        </div>`;
    contentField.innerHTML = contentHtml;
}

// 메뉴 수정하는 폼을 모달 속에 생성
function showRepForm() {
    let modal = document.getElementById("modalWrap");
    modal.classList.remove("hidden");

    let contentField = modal.querySelector(".content");
    contentField.classList.add("modify");
    let contentHtml = `
        <div class="modalTitleBox">
            <p>수 정 하 기</p><br>
            <span>수정할 메뉴를 선택해주세요</span>
            <select id="selList">${makeSelectBox()}</select>
        </div>
        <div class="resultBox hidden"></div>
        <div class="modBtnBox hidden">
            <button class="send" onclick="sendModMenu()">수 정</button>
        </div>`;

    contentField.innerHTML = contentHtml;

    // 드롭다운 목록의 선택된 항목 이벤트 등록
    const selectedMenu = document.querySelector("#selList");
    selectedMenu.addEventListener('change', (event) => {
        const menuId = Number(event.target.value);
        let menu = menu_list.find(m => m.id === menuId);
        let resBox = document.querySelector(".resultBox")

        resBox.innerHTML = `
            <form id="modifyForm">
                <input type="hidden" name="id" value="${menu.id}">
                <div class="inputBox">
                    <label>이름</label>
                    <input type="text" name="menuName" value="${menu.menuName}">
                </div>
                <div class="inputBox">
                    <label>가격</label>
                    <input type="number" name="price" value="${menu.price}" step="100" min="0">
                </div>
                <div class="inputBox">
                    <label>분류</label>
                    <input type="text" name="category" value="${menu.category}">
                </div>
            </form>`;

        resBox.classList.remove("hidden");
        document.querySelector(".modBtnBox").classList.remove("hidden");
    });
}

// 메뉴 삭제하는 기능을 모달 안에 생성
function showDelForm() {
    let modal = document.getElementById("modalWrap");
    modal.classList.remove("hidden");

    let contentField = modal.querySelector(".content");
    contentField.classList.add("delete");
    let contentHtml = `
        <div class="modalTitleBox">
            <p>삭 제 하 기</p><br>
            <span>삭제할 메뉴를 선택해주세요</span>
            <select id="selList">${makeSelectBox()}</select>
        </div>
        <div class="resultBox hidden"></div>
        <div class="delBtnBox hidden">
            <button class="send" onclick="sendDelMenu()">삭 제</button>
        </div>`;

    contentField.innerHTML = contentHtml;

    // 드롭다운 목록의 선택된 항목 이벤트 등록
    const selectedMenu = document.querySelector("#selList");
    selectedMenu.addEventListener('change', (event) => {
        const menuId = Number(event.target.value);
        let menu = menu_list.find(m => m.id === menuId);

        let resBox = document.querySelector(".resultBox")
        resBox.innerHTML = `
            <form id="deleteform">
                <input type="hidden" name="id" value="${menu.id}">
            </form>
            <span>${menu.menuName}</span>를 정말 삭제하시겠습니까?`;
        resBox.classList.remove("hidden");
        document.querySelector(".delBtnBox").classList.remove("hidden");
    });
}

// 수정, 삭제용으로 쓰일 드롭다운 목록을 생성
function makeSelectBox() {
    let result = `<option value="" disabled selected>메뉴를 선택하세요</option>`;
    menu_list.forEach(menu => {
        result += `<option value="${menu.id}">${menu.menuName}</option>`;
    });
    return result;
}

// 메뉴관리 버튼을 눌렀을 때 메뉴 목록 테이블을 생성
function makeTableShowMenus() {
    let tableHtml = `
        <table class = "admin-table menus">
            <thead>
                <tr>
                    <th>메뉴번호</th>
                    <th>메뉴이름</th>
                    <th>가격</th>
                    <th>분류</th>
                    <th>사진</th>
                </tr>
            </thead>
            <tbody>`;
    menu_list.forEach(menu => {
        tableHtml += `
                <tr>
                    <td>${menu.id}</td>
                    <td>${menu.menuName}</td>
                    <td>${menu.price.toLocaleString()}원</td>
                    <td>${menu.category}</td>
                    <td><img src="${menu.menuImg}"></td>
                </tr>`;
        // console.log(tableHtml);
        });
    tableHtml += `</tbody></table>`;
    return tableHtml;
}

// 주문조회 버튼을 눌렀을 때 주문 및 결제 테이블을 생성
function makeTableShowOrders() {
    let tableHtml = `
        <table class="admin-table orders">
            <thead>
                <tr>
                    <th>주문번호</th>
                    <th>주문내역</th>
                    <th>총 금액</th>
                    <th>상태</th>
                    <th>주문시간</th>
                </tr>
            </thead>
            <tbody>`;
        
    let sum = 0;
    order_list.forEach(order => {
        sum += (order.status === "결제완료") ? order.price_total : 0;
        const orderList = Object.values(order.orderMap)
            .map(item => `
                ${item.orderedName}
                (${item.amount}개):
                ${item.orderedPrice*item.amount}원`).join("<br> ");
        
        tableHtml += `<tr>
            <td>${order.id}</td>
            <td class="text-left">${orderList}</td>
            <td>${order.price_total.toLocaleString()}원</td>
            <td><span class="status-${order.status}">${order.status}<br>${order.pay_option}</span></td>
            <td>${order.created_at.replace("T", " ")}</td></tr>`;});
    tableHtml += `<tr>
        <td colspan=2><strong>합 계</strong></td>
        <td>${sum.toLocaleString()}원</td>
        <td colspan=2></td>
    </tbody></table>`;
    
    return tableHtml;
}

