<%-- 
    Document   : RegistroMatricula
    Created on : 05/09/2016, 11:26:47 AM
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
        <h1>REGISTRAR MATRICULA </h1> 
             <p>MARICIELO</p>
        
        <p>Ingrese datos de los cursos a matricularte.</p>
        
        <form action="RegistroMatricula.jsp">
            
           <table>
      
      <thead>
        <tr>
            <th scope="col">Nombre</th><br>
          <th scope="col">Ciclo</th><br>
          <th scope="col">Creditos</th><br>
          </tr><br>
          <th scope="row">Matematica I </th>
          <td> I   </td>
          <td> 4   </td>
        </tr>
        <tr>
          <th scope="row">Ofimatica II</th>
          <td> II  </td>
          <td> 3   </td>
        </tr>
        <tr>
          <th scope="row">Historia del Arte</th>
          <td>  II  </td>
          <td>  2   </td>
        </tr>
        <tr>
          <th scope="row">Ingles III</th>
          <td>  III  </td>
          <td>  2  </td>
        </tr>
      </tbody>
    </table>
            <label>&nbsp;</label><br>      
                <input type="submit" value="Registrar Matricula" class="margin_left">  
    </body>
</html>
