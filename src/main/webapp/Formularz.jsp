<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form</title>
</head>
<body>
<form action="FirstServlet" method="get">
First name :<input type="text" name="firstName" value="${person.firstName}" /><br />
Last name :<input type="text" name="lastName" value="${person.lastName}" /><br />
Email: <input type="text" name="email" value="${person.email}" /><br />
Repeat email: <input type="text" name="repeatEmail" value="${person.repeatEmail}" /><br />
Company : <input type="text" name="company" value="${person.company}" /><br />
Where did you get information: <br />
<input type="radio" name="info" value="work"/> From work <br />
<input type="radio" name="info" value="university"/> From university <br />
<input type="radio" name="info" value="facebook"/> Facebook <br />
<input type="radio" name="info" value="friends"/> Friends <br />
<input type="radio" name="info" value="other"/> Others <input type="text" name="other" value="${person.inne}"/><br />
What do You do: <input type="text" name="job" value="${person.job}"/><br />
<input type="submit" value="wyślij">


</form>
</body>
</html>