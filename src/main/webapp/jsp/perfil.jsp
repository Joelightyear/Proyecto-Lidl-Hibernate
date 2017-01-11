<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h5><img alt="" width="30" src="http://logos-download.com/wp-content/uploads/2016/03/Lidl_logo.png">Enhorabuena <s:property value="usuario"/>
ha accedido a su cuenta</h5></div>
			
<div class="text-center"><img alt="" width="700" src="https://onamaconsultora.files.wordpress.com/2014/04/lidl_banner_logo.jpg"></div>
<br><br>
<div class="container">

    <br><br>
    
    <div class="row text-center">
           <s:a action="listado"><button type="button" class="btn btn-circle">Ver productos <span class="glyphicon glyphicon-th-list"></span></button></s:a> 
           <s:a><button type="button" class="btn btn-circle">Ir a la Cesta <br>  <span class="glyphicon glyphicon-shopping-cart"></span></button></s:a>    
           <a href="index.jsp"><button id="botoncerrarsesion" type="button" class="btn btn-circle">Cerrar Sesión <br><span class="glyphicon glyphicon-log-in"></span></button></a>
           <s:a action="borrarusuario"><button type="button" class="btn btn-circle">Borrar Usuario <br><span class="glyphicon glyphicon-user"></span><span class="glyphicon glyphicon-remove"></span></button></s:a> 
    </div>
    
</div>
 <br><br><br><br><br><br><br>
<footer>
<div class="text-center">
Mercadona, S.L. Marca Registrada ®</div>
<br><br><br><br><br><br><br><br><br><br><br>
</footer>

</body>
</html>