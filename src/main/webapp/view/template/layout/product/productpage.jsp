<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
          <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
           <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
	<title><tiles:getAsString name="title" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Phone Market</title>
	<link href="resource/css/bootstrap.min.css" rel="stylesheet">
    <link href="resource/css/prettyPhoto.css" rel="stylesheet">
    <link href="resource/css/responsive.css" rel="stylesheet">
    <link rel="stylesheet" href="resource/css/font-awesome.min.css">
	<link href="resource/stylecss/css.css" rel="stylesheet">
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

</head>
<body>
<header>
	<tiles:insertAttribute name="header">
	</tiles:insertAttribute>
</header>
<div class="container-fluid">
    <div class="row">
        <div class="container content">
           <%-- <div class="col-md-2 col-left">
           	<tiles:insertAttribute name="nav"></tiles:insertAttribute>
           </div> --%>
           <!--  <div class="col-md-10 content-right"> -->
             	<tiles:insertAttribute name="body"></tiles:insertAttribute>
           <!--  </div> -->
          
</div>
</div>
</div>

	<div class="col-sm-1"></div>
<footer>
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
</footer>
</body>
	<script src="resource/jquerry/jquery-3.1.1.js"></script>
	<script src="resource/jquerry/jquery-3.1.1.min.js"></script>
	<script src="resource/js/bootstrap.min.js"></script>
	<script src="resource/js/product.js"></script>
</html>