// signIn.js

// 로그인 버튼 클릭할때  아이디 입력 안되어있으면?
// 로그인 버튼 클릭시  아이디는 입력했고 비밀번호 입력 안되어 있으면?
//  로그인 페이지 열렸을때(로드)  처음에 무엇을 할꺼냐?


window.onload = function(){
    // 아이디 입력하는 input태그에  커서를 두겠다.
    let id = document.getElementById("userId");
    id.focus();  //커서 표시

    // 로그인버튼 클릭시 아이디 또는 비밀번호가 비어 있다면 
    // 입력하라고 메시지 띄워라!!

    let bt = document.getElementById("loginBt");
    bt.addEventListener("click", 로그인처리);
}

function 로그인처리(){
    // 아이디 또는 비밀번호가 비어 있는지 확인하고 처리
    // 1. 아이디와 비밀번호 input 태그 가져오기 - document.getElementById
    let id = document.getElementById("userId");
    let pw = document.getElementById("userPw");
    
    // 2. 아이디와 비밀번호가 비어있는가? - if문
    if( id.value == '' ){//아이디 입력안함
        alert("아이디를 입력하세요");
        id.focus();
    }else if( pw.value == '' ){// 비밀번호 입력안함
        alert("비밀번호를 입력하세요");
        pw.focus();
    }else{// 아이디와 비밀번호 모두 입력했다.
        // 서버(자바)에 전달되게 하기 
        
    }

}
