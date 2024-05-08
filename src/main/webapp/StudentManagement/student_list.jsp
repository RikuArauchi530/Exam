<%@page contentType="text.html ; charset=UTF-8" %>
<%@include file="../header.html"%>
<%@include file="../menu/menu.jsp" %>


<h2>学生管理</h2>

<label>入学年度</label>
	<select name="f1">
		<option value="0">---------------------</option>
		<option value="1">2021</option>
		<option value="2">2022</option>
		<option value="3">2023</option>
	</select>
	
<label>クラス</label>
	<select name="f2">
		<option value="4">---------------------</option>
		<option value="5">101</option>
		<option value="6">131</option>
		<option value="7">201</option>
	</select>
	
<input type="checkbox" value="f3"> 

<input type="button" value="絞込み">

<a href="../StudentManagement/student_create.jsp">新規登録</a>

<%@include file="../footer.html" %> 