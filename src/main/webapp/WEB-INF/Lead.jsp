<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead</title>
</head>
<body>
<h2>Lead</h2>
FirstName:${lead.getFirstName()}
LastName:${lead.getLastName()}
LeadSource:${lead.getLeadSource()}
Email:${lead.getEmail() }
Mobile:${lead.getMobile()}
</body>
</html>