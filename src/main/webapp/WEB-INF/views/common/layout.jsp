<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html>
<html>
<head>
    <title><tiles:insertAttribute name="title" ignore="true" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<tiles:insertAttribute name="top" />
<tiles:insertAttribute name="body" />
</body>
</html>