<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<form action="Login.action" method="post">
<h2>ログイン</h2>
<p>ID<input type="id" name="id" placeholder="半角でご入力ください" required/></p>
<body>

<p>パスワード<input type="password" id="passwordField" placeholder="20文字以内の半角英数字でご入力ください" required/></p>
<input type="checkbox" id="showPasswordCheckbox"> パスワードを表示

<script>
const passwordField = document.getElementById('passwordField');
const showPasswordCheckbox = document.getElementById('showPasswordCheckbox');

showPasswordCheckbox.addEventListener('change', function() {
    const fieldType = this.checked ? 'text' : 'password';
    passwordField.type = fieldType;
});
</script>

</body>
<p><input type="submit" value="ログイン"></p>
</form>

<%@include file="../footer.html" %>