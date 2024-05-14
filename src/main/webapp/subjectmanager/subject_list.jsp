<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@include file="../menu/menu.jsp" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.sql.DataSource" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>科目管理</h2>
<a href="../subjectmanager/subject_create.jsp">科目追加</a>

<table style="border-collapse: separated;border-spacing:10px;">
  <thead>
    <tr>
      <th>学校コード</th>
      <th>科目コード</th>
      <th>科目名</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="subject" items="${list}">
      <tr>
        <td>${subject.school_cd}</td>
        <td>${subject.cd}</td>
        <td>${subject.name}</td>
        <td><a href="SubjectUpdate.action?code=${subject.cd}&name=${subject.name}">変更</a></td>
      </tr>
    </c:forEach>
  </tbody>
</table>

<%@include file="../footer.html" %>
