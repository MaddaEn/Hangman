<%@page import="mhotel.model.Room"%>
<%@page import="java.util.List"%>
<%@page import="mhotel.model.Hotel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
		<a href='<%=request.getContextPath() + "/"%>'>HOME</a>
	</div>
	Aceste camere sunt ocupate:
	<br>
	<%
		List<Room> roomList = (List<Room>) request.getAttribute("occupiedRooms");
	%>
	<ol>
		<%
			for (Room room : roomList) {
		%>
		<li>Hotel: <%=room.getHotel().getName()%>, oras: <%=room.getHotel().getAddress().getCity()%>, numar: <%=room.getNumber()%>, etaj: <%=room.getFloor()%>, paturi: <%=room.getNumberOfBeds()%> </li>
			<%
 	         }
            %>
	</ol>

</body>
</html>