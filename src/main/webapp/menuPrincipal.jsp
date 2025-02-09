<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.*" %>    
 <%@ page import="model.TblProveedorcl2" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menú Principal</title>
</head>
<body bgcolor="#b9867b">
<h1 align="center" style="color: white;">Menú Principal</h1>
<h2 align="center">
<a href="ControladorProveedor?accion=Registrar" style="text-decoration: none; color: white;">Registrar Proveedor</a>
</h2>
<table align="center" border="2">
<tr>
<td style="color: white;">Código</td>
<td style="color: white;">Nombre</td>
<td style="color: white;">Ruc</td>
<td style="color: white;">Razón Social</td>
<td style="color: white;">Email</td> 
<td style="color: white;">Fecha Ing.</td> 
<td colspan="2" style="color: white;">Acciones</td>
</tr>
<%
	List<TblProveedorcl2> listadoproveedor=(List<TblProveedorcl2>)request.getAttribute("listar");

if(listadoproveedor != null){

	for(TblProveedorcl2 prov:listadoproveedor){
		%>
		<tr>
		<td style="color: white;"><%=prov.getIdProveedor()%></td>
		<td style="color: white;"><%=prov.getNomProvecl2()%></td>
		<td style="color: white;"><%=prov.getRucProvecl2()%></td>
		<td style="color: white;"><%=prov.getRsocialProvecl2()%></td>
		<td style="color: white;"><%=prov.getEmailProvecl2()%></td>
		<td style="color: white;"><%=prov.getFeingProvecl2()%></td>
		<td><a href="ControladorProveedor?accion=Actualizar&cod=<%=prov.getIdProveedor() %>"  style="text-decoration: none">Actualizar</a></td>
		<td><a href="ControladorProveedor?accion=Eliminar&cod=<%=prov.getIdProveedor() %>"  style="text-decoration: none">Eliminar</a></td>
		</tr>
		<% 
	}
	%>
	<%
}
%>
</table>
</body>
</html>