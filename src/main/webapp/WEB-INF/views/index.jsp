<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>

</head>
<body>
    <h1>회원 정보 조회(아이디 검색)</h1>
    <form action="/selectUser">
        <input type="text" name="userId" placeholder="회원 아이디 입력">
        <button>조회</button>
    </form>
    <!-- input에서 사용하는 name 속성은
        action에 해당하는 페이지에 전달할 수 있는 파라미터로 사용한다. -->

</body>
</html>