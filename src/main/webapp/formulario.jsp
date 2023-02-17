<!-- Para cabeceras necesarias para el uso de c: -->
<%@ include file="/cabeceras.jsp" %>

<!-- Cabecera para usar la etiqueta form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FORMULARIO</title>
</head>
<body>
<h1>FORMULARIO NUEVO USUARIO</h1>
<!-- Formulario donde creamos el nuevo usuario y presentamos una lista de ellos mediante metodo post -->
	<h3>FORMULARIO POST PARA AGREGAR NUEVOS USUARIOS</h3>
	<form:form action="pruebaPost" method="POST" modelAttribute="UsuarioNuevo">
 		<ul>
  			<li>
    			<form:label path="nombre">NOMBRE:</form:label>
    			<form:input type="text"  path="nombre"/>
  			</li>
  			<br>
  			<li>
    			<form:label path="apellidos">APELLIDOS:</form:label>
    			<form:input type="text"  path="apellidos"/>
  			</li>
  			<br>
  			<li class="button">
  				<button type="Submit">GUARDAR</button>
			</li>
 		</ul>

		<br>
	</form:form>
</body>
</html>