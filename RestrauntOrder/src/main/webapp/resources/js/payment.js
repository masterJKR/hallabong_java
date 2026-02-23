// 장바구니 데이터 가져오기
    // let cart = JSON.parse(localStorage.getItem("cart")) || [];
    
    // let orderList = document.getElementById("orderList");
    // 주문 목록을 출력할 div 선택

    // let total = 0;
    // 총 금액을 저장할 변수

    // 주문 목록 출력 + 총합 계산
    // cart.forEach(item => {
    //   let itemTotal = item.price * item.amount;
    //   // 가격 × 수량 계산

    //   total += itemTotal;
    //   // 전체 합계에 추가

    // //   orderList.innerHTML += ` <p>${item.menuName} - ${item.price}원 × ${item.amount}개 = ${itemTotal}원</p> `;
    //   // 화면에 한 줄씩 추가
    // });

    // 총 금액 화면에 표시
    

    // 임시 결제 버튼 기능
    function pay() {
      alert("결제가 완료되었습니다.");
      // 실제 결제는 아니고 알림만 표시

      localStorage.removeItem("cart");
      // 결제 후 장바구니 비우기

      location.href = "index.html";
      // 메인 페이지로 이동 (원하는 페이지로 수정 가능)
    }

    window.onload = function() {
        showCartList();
    }

    function showCartList() {
        let ul = document.querySelector(".order-list");
        let total = 0;
        let listHtml = "";
        cart.forEach(item =>{
            listHtml += `
                <li class="order-item">
                    <span class="menu-name">${item.menuName}</span>
                    <div class="menu-control">
                        <span class="count">${item.amount}개</span>
                    </div>
                    <span class="price">${(item.price*item.amount).toLocaleString()}원</span>
                </li>`;
            total += item.price*item.amount;
        });
        console.log("카트불러오기");
        ul.innerHTML = listHtml;
        document.getElementById("final-total").innerText = `${total.toLocaleString()}원`;
        document.getElementById("order-total").innerText = `${total.toLocaleString()}원`;
    }