<%@page contentType="text.html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@include file="../menu/menu.jsp" %>

<h2>学生情報登録</h2>

<form action="student_create_done.jsp" method="post" >
<p>入学年度<select name="ent_year"></select></p>

<p>学生番号<input type="text" name="no" value="${no}" placeholder="学生番号を入力してください。" maxlength="10" required></p>

<p>氏名<input type="text" name="name" value="${name}" placeholder="氏名を入力してください。" maxlength="30" required></p>

<p>クラス<select name="class_num"></select></p>

<input type="button" name-"end" value="登録して終了">
</form>

<a href="../StudentMansgement/student_list.jsp" >

<%@include file="../footer.html" %>