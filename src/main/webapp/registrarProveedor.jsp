<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
</body>
</html>