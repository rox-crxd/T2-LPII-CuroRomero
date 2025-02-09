<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Proveedor</title>
</head>
<body bgcolor="#b9867b">
	<h1 align="center" style="color: white;">Actualizar Proveedor</h1>

	<form method="post" action="ControladorProveedor">
		<table align="center" border="2">
		
		<% 
		String codigo=request.getAttribute("codigo").toString();
		String nombre=(request.getAttribute("nombre")!=null)?request.getAttribute("nombre").toString():"";
		String ruc=(request.getAttribute("ruc")!=null)?request.getAttribute("ruc").toString():"";
		String razon=(request.getAttribute("razon")!=null)?request.getAttribute("razon").toString():"";
		String email=(request.getAttribute("email")!=null)?request.getAttribute("email").toString():"";
		String fechaing=(request.getAttribute("fechaing")!=null)?request.getAttribute("fechaing").toString():"";
		%>
			<input type="hidden" name="codigo" value="<%=codigo%>">
			<tr>
				<td>Nombre</td>
				<td><input type="text" name="nombre" value="<%=nombre%>"></td>
			</tr>
			<tr>
				<td>Ruc</td>
				<td><input type="text" name="ruc" value="<%=ruc%>"></td>
			</tr>
			<tr>
				<td>Razón Social</td>
				<td><input type="text" name="razon" value="<%=razon%>"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="<%=email%>"></td>
			</tr>
			<tr>
				<td>Fecha Ing.</td>
				<td><input type="text" name="fechaing" value="<%=fechaing%>"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Actualizar"></td>
			</tr>
		</table>
	</form>
	
</body>
</html>