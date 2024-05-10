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
<tr>
<th>入学年度</th>
<th>クラス</th>
<th>科目</th>
<th>回数</th>
</tr>
<tr>
<td><SELECT>${year}</SELECT></td>
<td><SELECT>${num}</SELECT></td>
<td><SELECT>${subject.cd}</SELECT></td>
<td><SELECT>${num}</SELECT></td>
</tr>

<button type="button" onclick="location.href=''">検査</button>
</p>

<%@include file="../footer.html" %>




