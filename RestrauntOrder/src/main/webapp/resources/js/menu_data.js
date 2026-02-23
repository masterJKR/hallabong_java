/* menu_data.js */
/* fetch 를 이용하여 java 에서 menu_list 를 가져오는 기능 */ 

// window.addEventListener("categorySelected", (e) => {
//     const selected = e.datail.target;

// 	if(typeof showMenuListByCategory === "function") {
//         showMenuListByCategory(selected);
// 	}
// });


const menu_list = [
    {"id":1,"menuName":"원조 매콤 떡볶이","menuImg":"./resources/img/dduk_01.jpg","price":4500,"category":"분식"},
    {"id":2,"menuName":"로제 크림 떡볶이","menuImg":"./resources/img/dduk_02.jpg","price":6500,"category":"분식"},
    {"id":3,"menuName":"바삭 모둠 튀김","menuImg":"./resources/img/fried_01.jpg","price":5500,"category":"분식"},
    {"id":4,"menuName":"찰순대 (내장포함)","menuImg":"./resources/img/sundae_01.jpg","price":4500,"category":"분식"},
    {"id":5,"menuName":"치즈 듬뿍 김밥","menuImg":"./resources/img/kimbap_01.jpg","price":4800,"category":"분식"},
    {"id":6,"menuName":"스팸 마요 덮밥","menuImg":"./resources/img/rice_01.jpg","price":7500,"category":"식사"},
    {"id":7,"menuName":"직화 제육 덮밥","menuImg":"./resources/img/rice_02.jpg","price":8000,"category":"식사"},
    {"id":8,"menuName":"우삼겹 비빔국수","menuImg":"./resources/img/noodle_01.jpg","price":8500,"category":"면류"}
];

// window.addEventListener('DOMContentLoaded', function() {
//     fetch("getMenuData.do")
//         .then(res => res.json())
//         .then(data => {
//             menu_list = data.menuList;
//         }).catch(err => console.error("데이터 로딩 실패 : ", err))
// });