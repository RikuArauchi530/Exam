<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@include file="../menu/menu.jsp" %>

<form action="SubjectUpdateExecute.action" method="post">
<h2>科目情報変更</h2>
<label>科目コード</label><br>
<input type="text" value="${code}" readonly/><br>

<label>科目名</label><br>
<input type="text" value="${name}" placeholder="科目名を入力してください" required/><br>

<p><input type="submit" value="変更"></p>

<script>
const passwordField = document.getElementById('passwordField');
const showPasswordCheckbox = document.getElementById('showPasswordCheckbox');

showPasswordCheckbox.addEventListener('change', function() {
    const fieldType = this.checked ? 'text' : 'password';
    passwordField.type = fieldType;
});
</script>

<%@include file="../footer.html" %>