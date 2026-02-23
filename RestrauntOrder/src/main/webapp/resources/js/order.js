<<<<<<< feat/order

=======
>>>>>>> dev
let cart = [];
let total = 0;

function addItem(name, price) {

<<<<<<< feat/order
    const existingItem = cart.find(item => item.name === name);

    if (existingItem) {
        existingItem.quantity += 1;
=======
    // 이미 장바구니에 있는지 확인
    const existingItem = cart.find(item => item.name === name);

    if (existingItem) {
        existingItem.quantity += 1;   // 수량 증가
>>>>>>> dev
    } else {
        cart.push({
            name: name,
            price: price,
            quantity: 1
        });
    }

    total += price;
    renderCart();
}

function renderCart() {
    const cartList = document.getElementById("cartList");
    cartList.innerHTML = "";

    cart.forEach(item => {
        const div = document.createElement("div");
        div.className = "cart-item";

        div.innerText =
            `${item.name} ${item.quantity}개 - ${(item.price * item.quantity).toLocaleString()}원`;

        cartList.appendChild(div);
    });

    document.getElementById("totalPrice").innerText =
        `총 금액: ${total.toLocaleString()}원`;
}
<<<<<<< feat/order

function goToPayment() {
    if (cart.length === 0) {
        alert("장바구니가 비어 있습니다.");
        return;
    }

    localStorage.setItem("cart", JSON.stringify(cart));
    localStorage.setItem("total", total);

    window.location.href = "payment.html";
   
}
=======
>>>>>>> dev
