// index.js

// .startButton 버튼태그를 클릭하면 menu.jsp로 이동하는 함수
window.onload = function () {
    let orderBtn = document.querySelector(".startButton");

    orderBtn.addEventListener('click', () => {location.href = "./menu.html";})
}