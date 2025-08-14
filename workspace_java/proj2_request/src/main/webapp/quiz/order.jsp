<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>피자 주문</title>
    <style>
        .block {
            display: flex;
            width: 95%;
            gap: 30px;
            margin: 1%;
        }
        .text {
            width: 10%;
            font-weight: bold;
        }
        textarea {
            resize: none;
            width: 50%;
        }
        form {
        	border: 1px dotted;
        	border-radius: 10px;
        }
    </style>
</head>
<body>
    <form method = "post" action = "../oq">
        <div class = "block">
            <div class = "text">메뉴 선택</div>
            <select name = "menu" value = "menu">
                <option value = "멜로우 콘크림">멜로우 콘크림</option>
                <option value = "스타라이트 바질">스타라이트 바질</option>
                <option value = "존스 페이버릿">존스 페이버릿</option>
                <option value = "햄 머쉬룸 식스 치즈">햄 머쉬룸 식스 치즈</option>
                <option value = "위스콘신 치즈 포테이토">위스콘신 치즈 포테이토</option>
            </select>            
        </div>
        <div class = "block">
            <div class = "text">사이즈 선택</div>
            <div class = "option">
                <label><input type = "radio" name = "size" value = "Large" checked>Large</label>
                <label><input type = "radio" name = "size" value = "Family">Family</label>
                <label><input type = "radio" name = "size" value = "Party">Party</label>                     
            </div>
        </div>
        <div class = "block">
            <div class = "text">도우 선택</div>
            <div class = "option">
                <label><input type = "radio" name = "dough" value = "오리지널" checked>오리지널</label>
                <label><input type = "radio" name = "dough" value = "씬">씬</label>
                <label><input type = "radio" name = "dough" value = "치즈">치즈</label>롤                
                <label><input type = "radio" name = "dough" value = "골드링">골드링</label>                
                <label><input type = "radio" name = "dough" value = "스파이시 갈릭 치즈롤">스파이시 갈릭 치즈롤</label>                 
            </div>
        </div>
        <div class = "block">
            <div class = "text">토핑 선택</div>
            <div class = "option">
                <label><input type = "checkbox" name = "topping" value = "치즈">치즈</label>            
                <label><input type = "checkbox" name = "topping" value = "베이컨">베이컨</label>            
                <label><input type = "checkbox" name = "topping" value = "페퍼로니">페퍼로니</label>            
                <label><input type = "checkbox" name = "topping" value = "양송이 버섯">양송이 버섯</label>                       
                <label><input type = "checkbox" name = "topping" value = "올리브">올리브</label>            
                <label><input type = "checkbox" name = "topping" value = "콘">콘</label>            
                <label><input type = "checkbox" name = "topping" value = "감자">감자</label>                  
            </div>
        </div>
        <div class = "block">
            <div class = "text">요청사항 입력</div>
            <textarea name = "request" placeholder="요청사항을 입력해주세요."></textarea>            
        </div>
        <div class = "block">
            <input type = "submit" value = "주문 진행" style = "width: 30%;">
            <input type = "reset" value = "초기화" style = "width: 30%;">           
        </div>
    </form>
</body>
</html>