/* admin_data.js */
/* 주석 내용 : tomcat 서버 연결이 없을 때 화면에 표시하기 위한 예시용 데이터 */
// const order_list = [{"id":1, "price_total":9000, "status":"결제완료", "created_at":"2024-02-10T12:00:00", "orderMap":[{"id":1, "orderId":1, "menuId":1, "orderedName":"원조 매콤 떡볶이", "orderedPrice":4500, "amount":2}],"pay_option":"신용카드"},{"id":2, "price_total":16800, "status":"결제완료", "created_at":"2024-02-10T12:15:00", "orderMap":[{"id":3, "orderId":2, "menuId":2, "orderedName":"로제 크림 떡볶이", "orderedPrice":6500, "amount":1},{"id":4, "orderId":2, "menuId":3, "orderedName":"바삭 모둠 튀김", "orderedPrice":5500, "amount":1},{"id":2, "orderId":2, "menuId":5, "orderedName":"치즈 듬뿍 김밥", "orderedPrice":4800, "amount":1}],"pay_option":"카카오페이"},{"id":3, "price_total":16000, "status":"주문취소", "created_at":"2024-02-10T12:30:00", "orderMap":[{"id":5, "orderId":3, "menuId":7, "orderedName":"직화 제육 덮밥", "orderedPrice":8000, "amount":2}],"pay_option":""}]
// const menu_list = [
//     {"id":1,"menuName":"원조 매콤 떡볶이","menuImg":"./resources/img/dduk_01.jpg","price":4500,"category":"분식"},
//     {"id":2,"menuName":"로제 크림 떡볶이","menuImg":"./resources/img/dduk_02.jpg","price":6500,"category":"분식"},
//     {"id":3,"menuName":"바삭 모둠 튀김","menuImg":"./resources/img/fried_01.jpg","price":5500,"category":"분식"},
//     {"id":4,"menuName":"찰순대 (내장포함)","menuImg":"./resources/img/sundae_01.jpg","price":4500,"category":"분식"},
//     {"id":5,"menuName":"치즈 듬뿍 김밥","menuImg":"./resources/img/kimbap_01.jpg","price":4800,"category":"분식"},
//     {"id":6,"menuName":"스팸 마요 덮밥","menuImg":"./resources/img/rice_01.jpg","price":7500,"category":"식사"},
//     {"id":7,"menuName":"직화 제육 덮밥","menuImg":"./resources/img/rice_02.jpg","price":8000,"category":"식사"},
//     {"id":8,"menuName":"우삼겹 비빔국수","menuImg":"./resources/img/noodle_01.jpg","price":8500,"category":"면류"}
// ];

let menu_list = [];
let order_list = [];

window.addEventListener('load', function() {
    fetch("getAdminData.do")
        .then(res => res.json())
        .then(data => {
            console.log(data);
            menu_list = data.menuList;
            order_list = data.orderList;
            clickFirstCategory();
        }).catch(err => console.error("데이터 로딩 실패: " , err))
});

function sendAddMenu() {
    const form = document.querySelector("#addForm");
    const formData = new FormData(form);

    fetch("addMenu.do", {
        method: "POST",
        body: formData
    })
    .then(res => res.text())
    .then(data => {
        if(data === "success") {
            alert("메뉴 등록 완료");
            location.reload();
        }
    });
}

function sendModMenu() {
    const form = document.querySelector("#modifyForm");
    const formData = new FormData(form);

    fetch("modifyMenu.do", {
        method: "POST",
        body: formData
    })
    .then(res => res.text())
    .then(data => {
        if(data === "success") {
            alert("메뉴 수정 완료");
            location.reload();
        }
    });
}

function sendDelMenu() {
    const form = document.querySelector("#deleteform");
    const formData = new FormData(form);

    if(!confirm("정말로 삭제하시겠습니까?")) return;

    fetch("deleteMenu.do", {
        method: "POST",
        body: formData
    })
    .then(res => res.text())
    .then(data => {
        if(data === "success") {
            alert("삭제 완료");
            location.reload();
        }
    });
}
