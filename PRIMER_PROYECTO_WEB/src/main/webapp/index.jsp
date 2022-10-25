<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inicio de sesión</title>

<style type="text/css">
form{
    display: flex;
    flex-flow: column;
    margin-top: 3em;
}
</style>
</head>
<body>
    <%if (request.getAttribute("entrar") == null){%>
		<form action="<%=request.getContextPath()%>/Formulario" method="get">
	        Usuario:<input type="text" name="Usuario" placeholder="Escribe tu usuario."></input>
	        Contraseña:<input type="password" name="pass"></input>
	        <input type="submit" name="BotonEnviar" value="Enviar por Get"></input>
	    </form>
	    
	    <form action="<%=request.getContextPath()%>/Formulario" method="post">
	        Usuario:<input type="text" name="Usuario" placeholder="Escribe tu usuario."></input>
	        Contraseña:<input type="password" name="pass"></input>
	        <input type="submit" name="BotonEnviar" value="Enviar por Post"></input>
	    </form>
	    <%if (request.getAttribute("error") != null){%><span>Ha ocurrido un error, vuelve a intentarlo.</span><%}%>
     <%}else{%>
        Hola <%=request.getAttribute("Usuario")%>!!!
     <%}%>
</body>
</html>