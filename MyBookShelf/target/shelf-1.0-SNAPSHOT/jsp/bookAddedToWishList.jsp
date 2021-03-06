<%--
  Created by IntelliJ IDEA.
  User: Lora
  Date: 5/8/16
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <c:import url="head-tag.jsp" />
</head>
<body>

<c:import url="header.jsp" />

<c:import url="image.jsp" />

<br />

<h1>Your reading list has been updated</h1>

<c:if test="${onWishList == 'yes'}">
  to add ${book} to your list. <br />
</c:if>
<c:if test="${onWishList == 'no'}">
  to remove ${book} from your list <br />
</c:if>

<a href="/index.jsp">Search again</a>

</body>
</html>
