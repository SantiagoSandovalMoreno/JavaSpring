
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form:form method="POST" commandName="departamento">
            <p>
                <form:label path="nombre">Nombre</form:label>
                <form:input path="nombre"/>
            </p>
            
            <p>
                <form:label path="estado">Estado</form:label>
                <form:select path="estado" items="${estado}"/>
            </p>
            
            <p>
                 <input type = "submit" value = "Guardar" class="btn" />
            </p>
        </form:form>
        
        
    </body>
</html>
