
window.addEventListener("categorySelected", (e) => {
    const selected = e.detail.target;

    if(typeof showAdminMenu === "function") {
        showAdminMenu(selected);
    }
});


function closeModal() {
    let modal = document.getElementById("modalWrap");
    modal.classList.add("hidden");
    highlight(document.getElementById("manage"));
}



function hideMenuBth() {
    let add = document.getElementById("addMenu");
    let upd = document.getElementById("updateMenu");
    let del = document.getElementById("deleteMenu");

    add.classList.add("hidden");
    upd.classList.add("hidden");
    del.classList.add("hidden");
}

function showMenuBtn() {
    let add = document.getElementById("addMenu");
    let upd = document.getElementById("updateMenu");
    let del = document.getElementById("deleteMenu");

    add.classList.remove("hidden");
    upd.classList.remove("hidden");
    del.classList.remove("hidden");

}

function showAdminMenu(selected) {
    const contentArea = document.querySelector(".adminContent");
    if (selected.id === "viewOrder") {
        hideMenuBth();

        if(order_list.length === 0) {
            contentArea.innerHTML = `<p> 주문 내역이 없습니다 ! </p>`;
            return;
        }
        contentArea.innerHTML = makeTableShowOrders();
    }
    if(selected.id === "manage") {
        showMenuBtn();
        contentArea.innerHTML = makeTableShowMenus();
    }
    if(selected.id === "deleteMenu") {
        showDelForm();
    }
    if(selected.id === "addMenu") {
        showAddForm();
    }
    if(selected.id === "updateMenu") {
        showRepForm();
    }

    // modal 내부 close 버튼 클릭하면 modal 닫는 함수
    document.querySelector(".close").addEventListener('click',() => {
        let modal = document.getElementById("modalWrap");
        modal.classList.add("hidden");
        highlight(document.getElementById("manage"));
    });

}