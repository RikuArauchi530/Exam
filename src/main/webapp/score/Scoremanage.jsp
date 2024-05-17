<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@include file="../menu/menu.jsp" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>成績管理</h2>
<table style="border-collapse: separated;border-spacing:10px;">
<thead>
<tr>
<th>入学年度</th>
<th>クラス</th>
<th>科目</th>
<th>回数</th>
</tr>
</thead>
<tbody>
<c:forEach var="test" items="${list}">
<tr>
<td><SELECT>${test.studentno}</SELECT></td>
<td><SELECT>${test.classnum}</SELECT></td>
<td><SELECT>${test.subjectcd}</SELECT></td>
<td><SELECT>${test.no}</SELECT></td>
</tr>
</c:forEach>
</tbody>
</table>
<button type="button" onclick="location.href=''">検査</button>

<%@include file="../footer.html" %>




