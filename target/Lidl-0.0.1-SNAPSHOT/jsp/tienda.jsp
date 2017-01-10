<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/estilo.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript" src="js/miscript.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="perfil">
		<h5>
			<img alt="" width="30"
				src="http://logos-download.com/wp-content/uploads/2016/03/Lidl_logo.png">Enhorabuena
			<s:property value="usuario" />
			ha accedido a su cuenta
		</h5>
	</div>

	<div class="text-center">
		<img alt="" width="700"
			src="https://onamaconsultora.files.wordpress.com/2014/04/lidl_banner_logo.jpg">
	</div>
	<br>
	<br>

	<div class="row">
		<div class="container">

			<p id=mitienda class="text-center">
				Mi tienda <br>
				<span class="glyphicon glyphicon-home"></span>
			</p>

		</div>
	</div>
	<div class="container-fluid"></div>

	<div class="container-fluid">
		<div class="row">
			<s:iterator status="stat" value="productos">
				<s:if test="(#stat.index % 3==0)">
					<div class="row"></div>
				</s:if>
				<div class="col-md-4 text-center">
					<img class="col-md-12 text-center" alt=""
						src="<s:property value="img" />"><br> <b>PRODUCTO:</b>
					<s:property value="nombre" />
					<br> <b>PRECIO: </b>
					<s:property value="precio" />
					<br> <b>DESCRIPCION: </b>
					<s:property value="descripcion" />
					<br> <b>PESO: </b>
					<s:property value="peso" />
					<br>


				</div>
			</s:iterator>
		</div>
	</div>


	<br>
	<br>
	<footer>
	<div class="text-center">Mercadona, S.L. Marca Registrada ®</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	</footer>


</body>
</html>