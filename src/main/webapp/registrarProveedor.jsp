<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*" %>   
      <%@ page import="model.TblProveedorcl2" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Proveedor</title>
</head>
<body bgcolor="#b9867b">
	<h1 align="center" style="color: white;">Registrar Proveedor</h1>

	<form method="post" action="ControladorProveedor" >
		<table align="center" border="2">
		<tr>
			<td>Nombre</td>
			<td><input type="text" name="nombre"></td>
		</tr>
		<tr>
			<td>Ruc</td>
			<td><input type="text" name="ruc"></td>
		</tr>
		<tr>
			<td>Razón Social</td>
			<td><input type="text" name="razon"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td>Fecha Ing.</td>
			<td><input type="text" name="fechaing"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="Registrar"></td>
		</tr>
		
		</table>
	</form>
	
		<!-- Listado de proveedores -->
	<h2 align="center" style="color: white;">Listado de Proveedores</h2>
	<table align="center" border="2">
		<tr>
			<td style="color: white;">Código</td>
			<td style="color: white;">Nombre</td>
			<td style="color: white;">Ruc</td>
			<td style="color: white;">Razón Social</td>
			<td style="color: white;">Email</td>
			<td style="color: white;">Fecha Ing.</td>
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