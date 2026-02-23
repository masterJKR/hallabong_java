/*  common.js 
    category 라는 클래스를 가지고 있는 여러개의 선택지가 있는 태그면,
    눌렀을 때 .highlight 속성을 부여하여 이벤트를 처리하는 함수
*/

window.addEventListener('load', function() {
    const categoryList = document.querySelectorAll(".category");

    for (let category of categoryList) {
        // console.log("Adding click listener to category:", category);
        category.addEventListener('click', function(){
            highlight(this);
        });
    }
});

function highlight(selected) {
    // console.log("Selected category:", selected);

    const categoryList = document.querySelectorAll(".category");

    for (let category of categoryList) {
        category.classList.remove("highlighted");
    }
    selected.classList.add("highlighted");

	const event = new CustomEvent(
        "categorySelected", { detail : { target : selected } } );
    window.dispatchEvent(event);
}

function clickFirstCategory() {
    const firstCategory = document.querySelector(".category");

    if(firstCategory) {
        firstCategory.click();
    }
}