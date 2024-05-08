<%@page contentType="text.html;charset=UTF-8" %>
<%@include file="../header.html" %>

<h2>学生情報変更</h2>

<form action="student_update_done.jsp" method="post" >
<p>入学年度<input type="text" value="${ent_year}" redonly></p>

<p>学生番号<input type="text" value="${no}" redonly></p>

<p>氏名<input type="text" name="nmae" value="${name}" maxlength="30" required ></p>

<p>クラス<select name="class_num" value="${num}"></select></p>

<p>在学中<input type="checkbox" name="si_attend"></p>

<p><input="button" class="submit" value="変更"></p>
</form>

<a href="../StudentManagement/student_list.jsp">戻る</a>

<%@include file="../footer.html" %>