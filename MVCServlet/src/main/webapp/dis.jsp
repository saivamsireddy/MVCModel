<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f2f2f2;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .card {
        background: white;
        padding: 30px 40px;
        border-radius: 10px;
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        width: 400px;
    }
    h2 {
        text-align: center;
        color: #333;
        margin-bottom: 20px;
    }
    table {
        width: 100%;
        border-collapse: collapse;
    }
    td {
        padding: 10px;
        border-bottom: 1px solid #ddd;
    }
    td.label {
        font-weight: bold;
        color: #555;
    }
</style>
</head>
<body>
<%
    session = request.getSession();
    String name = (String) session.getAttribute("name");
    String admission = (String) session.getAttribute("addmission");
    String password = (String) session.getAttribute("password");
    int marks = (session.getAttribute("marks") != null) ? (int) session.getAttribute("marks") : 0;
%>

<div class="card">
    <h2>Student Details</h2>
    <table>
        <tr>
            <td class="label">Name</td>
            <td><%= name %></td>
        </tr>
        <tr>
            <td class="label">Admission No</td>
            <td><%= admission %></td>
        </tr>
        
        <tr>
            <td class="label">Marks</td>
            <td><%= marks %></td>
        </tr>
    </table>
</div>

</body>
</html>
