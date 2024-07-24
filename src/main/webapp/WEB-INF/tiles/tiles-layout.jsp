<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles"  prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sports News</title>
    <link rel="stylesheet" type="text/css" href='<c:url value='/css/styles.css'/>'>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src='<c:url value='/js/script.js'/>'></script>
</head>
<body>
<%--     <tiles:insertAttribute name="header"/> --%>
    <tiles:insertAttribute name="body"/>
    <tiles:insertAttribute name="footer"/>
</body>
</html>
