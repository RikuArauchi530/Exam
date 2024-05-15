<%@page contentType="text.html ; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.html"%>
<%@include file="../menu/menu.jsp" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.sql.DataSource" %>

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
	
<input type="checkbox" value="f3">在学中

<input type="button" value="絞込み">

<a href="../StudentManagement/student_create.jsp">新規登録</a>

<table style="border-collapse:separate;border-spacing:10px;">
	<thead>
	<tr>
	<th>入学年度</th>
	<th>学生番号</th>
	<th>氏名</th>
	<th>クラス</th>
	</tr>
	</thead>
<c:forEach var="student" items="${list}">
	<tbody>
	<tr>
	<td>${student.entYear}</td>
	<td>${student.no}</td>
	<td>${student.name}</td>
	<td>${student.classNum}</td>
	</tr>
	</tbody>
</c:forEach>
</table>

<%@include file="../footer.html" %> 