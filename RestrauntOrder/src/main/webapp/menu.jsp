<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "dao.MenuDAO" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MENU - 맛나분식</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons+Round" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons+Outlined" rel="stylesheet">

    <link rel="stylesheet" href="./resources/css/default.css">
    <link rel="stylesheet" href="./resources/css/menu.css">
    <script src="./resources/js/common.js"></script>
    
    <script>
        const menu_list = <%= MenuDAO.getListAsJson() %>;
        console.log(menu_list[0].name);
    </script>
    <script src="./resources/js/menu.js"></script>
</head>
<body>
    <div id="wrap">

        <header id="header">
            <div id="title">
                <h1>🍜 맛나분식</h1>
                <p>메뉴 선택하기</p>
            </div>
            <nav id="nav">
                <ul class="menu">
                    <li class="menuItem">
                        <a href="./index.html">
                            <span class="material-icons-outlined">
                                home
                            </span>
                        </a>
                    </li>
                    <li class="menuItem">
                        <a href="./menu.jsp">
                            <span class="material-icons-outlined">
                                menu
                            </span>
                        </a>
                    </li>
                    <li class="menuItem">
                        <a href="./order.html">
                            <span class="material-icons-outlined">
                                shopping_cart
                            </span>
                        </a>
                    </li>
                    <li class="menuItem">
                        <a href="./payment.html">
                            <span class="material-icons-outlined">
                                credit_card
                            </span>
                        </a>
                    </li>
                    <li class="menuItem">
                        <a href="./admin.html">
                            <span class="material-icons-outlined">
                                view_list
                            </span>
                        </a>
                    </li>
                </ul>
            </nav>
        </header>

        <main id="main">
            <div class="categoryWrap">
                <ul class="categoryList">
                    <li class="category"><p>분&nbsp;&nbsp;&nbsp;&nbsp;식</p></li>
                    <li class="category"><p>식&nbsp;&nbsp;&nbsp;&nbsp;사</p></li>
                    <li class="category"><p>면&nbsp;&nbsp;&nbsp;&nbsp;류</p></li>
                </ul>
            </div>
            <div class="menuWrap">
                <ul class="menuList">
                    <li class="menu">
                        <div class="info">
                            <img src="./resources/img/dduk_01.jpg">
                            <p><strong>떡볶이</strong><br>3000원</p>
                        </div>
                    </li>
                    <li class="menu">
                        <div class="info">
                            <img src="./resources/img/dduk_02.jpg">
                            <p><strong>로제떡볶이</strong><br>4000원</p>
                        </div>
                    </li>
                    <li class="menu">
                        <div class="info">
                            <img src="./resources/img/fried_01.jpg">
                            <p><strong>모듬튀김</strong><br>3000원</p>
                        </div>
                    </li>
                </ul>
                
            </div>


        </main>

    </div>
    
    <footer id="footer">
        <div class="footerBox">
            <div class="footerText"><p>대표이사 : 김맛나    </p></div>
            <div class="footerText"><p>matnasnack@matna.com</p></div>
            <div class="footerText"><p>Matna Company ⓒ All right Reserved.</p></div>
        </div>
    </footer>
</body>
</html>