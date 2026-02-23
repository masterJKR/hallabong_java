
// 스크립트의 위치가  body태그 위 에 있는경우에
//  태그를 가져와서 사용해야 한다면
//  반드시 window가 load 한다음에 
// 태그 가져오기를 해야 한다.

window.onload=function(){
    // 가입 버튼 클릭시 
    // 필수 정보가 모두 입력되었는가 확인하기
    // 비밀번호와 비밀번호확인이 일치하는가
    // let id = document.getElementById("userId");
    // let pw = document.getElementById("userPw");
    // let pw2 = document.getElementById("userPwRe");
    // let name = document.getElementById("name");
    // let tel = document.getElementById("tel");

    // id.addEventListener("keyup", joinCheck);
    // pw.addEventListener("keyup", joinCheck);
    // pw2.addEventListener("keyup", joinCheck);
    // name.addEventListener("keyup", joinCheck);
    // tel.addEventListener("keyup", joinCheck);

    // 클래스명으로 태그 가져와서 이벤트 등록하기
    const 필수입력 = document.getElementsByClassName("essential");

    for(var input of 필수입력){
        input.addEventListener("keyup", joinCheck);
    }

    // querySelector -  자바스크립트로 태그를가져오는방벙 ( 동적)
    /*let id = document.querySelector("input");*/
    // 여러 태그가져오려면
   // const input = document.querySelectorAll(".essential");

    // for( var i =0 ; i<5; i++ )
    // for( var i in 필수입력 ) 배열의 인덱스값이 i에 저장
    // for( var data of 필수입력) 



}

// 만약에  이름을 입력안했을경우에  사용자에게 
// 알려주고 싶다면  지금과 같은 방식은 어렵다(불가능은 아님)
// 지금의 방식은 누구를 입력안했다라고 표현하는게 아니고
//  모두 입력했냐 안했냐만 확인하기  
function joinCheck(){
    let id = document.getElementById("userId");
    let pw = document.getElementById("userPw");
    let pw2 = document.getElementById("userPwRe");
    let name = document.getElementById("name");
    let tel = document.getElementById("tel");

    var count=0;
    if( id.value != '' ) count++;
    if( pw.value != '') count++;
    if( pw2.value != '' ) count++;
    if( name.value != '') count++;
    if( tel.value != '') count++;

    if( count == 5){// 필수 입력 모두 했다.
        if(pw.value != pw2.value){// 비밀번호와 비밀번호 확인이 다른값
            alert("비밀번호를 다시 확인해주세요");
            pw.value=''; // 비밀번호 input값 비우기
            pw2.value='';// 비밀번호 확인 input값 비우기
            return;
        }

        document.getElementById("joinBt").disabled = false;
    }else{// 필수입력중에 하나이상 입력안함
        document.getElementById("joinBt").disabled = true;
    }
    
}

