<%-- 
    Document   : RegistroAlumno
    Created on : 05/09/2016, 11:26:26 AM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>REGISTRAR ALUMMNO </h1> 
        <h1>USUARIO : user</h1>
        
        <p>Introduce datos del alumno.</p>
        
        <form action="RegistroAlumno.jsp">
            <input type="hidden" name="action" value="add"> 
            <label class="pad_top">Codigo:</label>
            <input type="text" name="txtCodigo" required><br>
            <label class="pad_top">Nombre:</label>
            <input type="text" name="Nombre"    required><br>  
            <label class="pad_top">Apellidos:</label>
            <input type="text" name="Apellidos" required><br>
            <label class="pad_top">Email:</label>
            <input type="text" name="Email"     required><br>
            <label>&nbsp;</label><br>
                    <input type="submit" value="Registrar Alumno">
    </form>
    </body>
</html>