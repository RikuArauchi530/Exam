<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@include file="../menu/menu.jsp" %>

<h2>科目追加</h2>

<form action="subject_create_done.jsp" method="post">
<p>科目コード<input type="cd" name="cd" placeholder="科目コードを入力してください。" maxlength="3" required></p>

<p>科目名<input type="name" name="name" placeholder="科目名を入力してください。" maxlength="20" required></p>

<input type="submit" value="登録"></a>
</form>

<%@include file="../footer.html" %>