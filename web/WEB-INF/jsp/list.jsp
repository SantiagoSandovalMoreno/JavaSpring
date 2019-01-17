<%-- 
    Document   : departamentoList
    Created on : 16/01/2019, 08:48:31 PM
    Author     : Santiago
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Departamento List</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
        
    </head>
    <body>
        <h1>Departamentos</h1>
        
        <p>
            <a href="<c:url value="add.htm"/>"class="btn btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true" ></span>Agregar</a>
        </p>
        
        <table class="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>DEPARTAMNTO</th>
                    <th>OPCIONES</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${datos}" var="dato">
                    <tr>
                         <td><c:out value="${dato.id}" /></td>
                         <td><c:out value="${dato.nombre}" /></td>
                         
                         <td>
                             <a ><span class="glyphicon glyphicon-pencil" aria-hidden="true" ></span></a>
                             <a ><span class="glyphicon glyphicon-trash" aria-hidden="true" ></span></a>
                             <a class="btn btn-success">VerMunicipios</a>
                         </td>
                    </tr>
                    
                </c:forEach>
            </tbody>
           
            
           
        </table>
                         
        <script src="https://code.jquery.com/jquery-3.3.1.slim.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
    </body>
</html>
