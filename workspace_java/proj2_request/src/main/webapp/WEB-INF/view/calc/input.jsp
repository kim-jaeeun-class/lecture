<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>CalcJSP</title>
    </head>
    <body>
        <h1>계산기</h1>

        <form method="get" action="/proj2_request/calc/in2">
            <input type="text" name="num1">
            <input type="text" name="num2">
            <input type="submit" name="SEND">
        </form>
    </body>
</html>