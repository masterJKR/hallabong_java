document.addEventListener('DOMContentLoaded', () => {
    const menuListUl = document.querySelector('.menuList');
    const categoryBtns = document.querySelectorAll('.category');
    const modalWrap = document.getElementById('modalWrap');
    const quantityInput = document.getElementById('menuQuantity');
    const totalPriceText = document.querySelector('.totalPriceText');
    const addToCartBtn = document.getElementById('addToCartBtn');
    
    let selectedItem = null;

    // 1. 메뉴 렌더링
    const renderMenu = (category) => {
        menuListUl.innerHTML = '';
        menu_list.filter(item => item.category === category).forEach(item => {
            const li = document.createElement('li');
            li.className = 'menu';
            li.innerHTML = `<div class="info"><img src="${item.menuImg}"><p><strong>${item.menuName}</strong><br>${item.price.toLocaleString()}원</p></div>`;
            li.addEventListener('click', () => openModal(item));
            menuListUl.appendChild(li);
        });
    };

    // 2. 카테고리 클릭
    categoryBtns.forEach(btn => {
        btn.addEventListener('click', () => {
            categoryBtns.forEach(b => b.classList.remove('highlighted'));
            btn.classList.add('highlighted');
            renderMenu(btn.dataset.category);
        });
    });

    // 3. 모달 열기/닫기
    const openModal = (item) => {
        selectedItem = item;
        quantityInput.value = 1;
        modalWrap.querySelector('.menuName').textContent = item.menuName;
        modalWrap.querySelector('.modalImg').src = item.menuImg;
        modalWrap.classList.remove('hide');
        updateTotalPrice();
    };

    document.querySelector('.close').addEventListener('click', () => modalWrap.classList.add('hide'));

    // 4. 수량 조절
    document.querySelector('.btn-plus').addEventListener('click', () => { quantityInput.value++; updateTotalPrice(); });
    document.querySelector('.btn-minus').addEventListener('click', () => { if(quantityInput.value > 1) { quantityInput.value--; updateTotalPrice(); } });

    function updateTotalPrice() {
        totalPriceText.textContent = `총 금액: ${(selectedItem.price * quantityInput.value).toLocaleString()}원`;
    }

    // 5. 장바구니 담기 (폭죽 & 토스트)
    addToCartBtn.addEventListener('click', (e) => {
        // 폭죽 효과!
        for (let i = 0; i < 30; i++) createConfetti(e.clientX, e.clientY);
        
        // 버튼 하트비트 효과
        addToCartBtn.classList.add('heart-beat');
        setTimeout(() => addToCartBtn.classList.remove('heart-beat'), 300);

        // 데이터 저장
        let cart = JSON.parse(localStorage.getItem('cart')) || [];
        const index = cart.findIndex(i => i.id === selectedItem.id);
        if(index > -1) cart[index].qty += parseInt(quantityInput.value);
        else cart.push({ ...selectedItem, qty: parseInt(quantityInput.value) });
        localStorage.setItem('cart', JSON.stringify(cart));

        // 알림 표시 및 모달 닫기
        showToast(`🥳 ${selectedItem.menuName} ${quantityInput.value}개가 담겼습니다!`);
        setTimeout(() => modalWrap.classList.add('hide'), 800);
    });

    function createConfetti(x, y) {
        const colors = ['#ff5252', '#ffeb3b', '#4caf50', '#2196f3', '#e040fb'];
        const confetti = document.createElement('div');
        confetti.className = 'confetti';
        document.body.appendChild(confetti);
        confetti.style.background = colors[Math.floor(Math.random() * colors.length)];
        confetti.style.setProperty('--x', `${(Math.random() - 0.5) * 400}px`);
        confetti.style.setProperty('--y', `${(Math.random() - 0.5) * 400}px`);
        confetti.style.left = `${x}px`; confetti.style.top = `${y}px`;
        confetti.addEventListener('animationend', () => confetti.remove());
    }

    function showToast(message) {
        const toast = document.getElementById('toast');
        document.getElementById('toastMsg').textContent = message;
        toast.classList.add('show');
        setTimeout(() => toast.classList.remove('show'), 2500);
    }

    renderMenu('분식');
});