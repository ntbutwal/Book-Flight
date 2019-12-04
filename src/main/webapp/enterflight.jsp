<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <title>
<meta charset="UTF-8">
<meta name="Flight Booking" Context="Cheap and Convenient Flight"/>
    </title>
<body>
    <form:form id="loginForm" modelAttribute="flight" action="showflight" method="post">     
     
    <body style="background-image: url(https://media.shermanstravel.com/Categories/Flights_1.jpg)";></body>
        <hr/>
    
<table align="center">
<tr>
<h1><big><bold><p style ="color:rgb(2, 68, 85); background-color:lightsalmon";> Cheap Flight</p></bold></big></h1>
<hr/>
<td><img width="800" height="300" src="https://blog.flightradar24.com/blog/wp-content/uploads/2016/04/TATLTraffic.gif" alt="Cheap Flight"/></td>
</tr>
</table>

    <table align="center">

<tr>
        
      <td>Trip: One-Way<form:radiobutton path ="trip" value="oneway"></form:radiobutton>
            Round-Trip<form:radiobutton path ="trip" value="round"></form:radiobutton>
    </td>
    
</tr>

<tr>
    <td><h2>From: </h2></td>
    <td> <form:select path="from">
        <form:option value ="virginia"> Virginia</form:option>
        <form:option value ="newyork"> New York</form:option>
        <form:option value ="california">California</form:option>
        <form:option value ="texas"> Texas</form:option>
        <form:option value ="colorado"> Colorado</form:option>
    </form:select></td>
    
</tr>
<tr>
    <td><h2>To: </h2></td>
        <td> <form:select path="to">
            <form:option value ="virginia"> Virginia</form:option>
            <form:option value ="newyork"> New York</form:option>
            <form:option value ="california">California</form:option>
            <form:option value ="texas"> Texas</form:option>
            <form:option value ="colorado">Colorado</form:option>
        </form:select></td>
        
</tr>
<tr>
    <td><h2>Airlines: </h2></td>
    <td><form:select path="dtoairlines">
        <form:option value="united">United</form:option>
        <form:option value="american">American</form:option>
        <form:option value="alaska">Alaska</form:option>
        <form:option value="delta">Delta Air</form:option>
        <form:option value="frontier">Frontier</form:option>
        <form:option value="spirit">Spirit</form:option>
    </form:select></td>
    
    </td>
</tr>
<tr>
        <td></td>
        <td align="left"><form:button id="save" name="save">Save</form:button>
        </td>
    
    </table>

</form:form>
</body>

</html>
