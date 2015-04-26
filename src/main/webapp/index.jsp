<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java 4 US</title>
    </head>
    <body>
        <form action="Serv" method="get">
            <table>
                <tr>
                    <td>Imię: </td>
                    <td><input type="text" name="firstName" /></td>
                </tr>
                
                <tr>
                    <td>Nazwisko: </td>
                    <td><input type="text" name="lastName" /></td>
                </tr>
                
                <tr>
                    <td>Email: </td>
                    <td><input type="text" name="email" /></td>
                </tr>
                
                <tr>
                    <td>Powtórz email: </td>
                    <td><input type="text" name="repeatEmail" /></td>
                </tr>
                
                <tr>
                    <td>Firma: </td>
                    <td><input type="text" name="company" /></td>
                </tr>
                
                <tr>
                    <td>Czym się zajmujesz?</td>
                    <td><input type="text" name="job" /></td>
                </tr>
                
                <tr>
                    <td>Skąd dowiedziałeś się o szkoleniu?</td>
                </tr>
                <tr>
                    <td>Praca</td>
                    <td><input type="radio" name="info" value="work"/><br /></td>
                </tr>
                <tr>
                    <td>Szkoła</td>
                    <td><input type="radio" name="info" value="university"/></td>
                </tr>
                <tr>
                    <td>Facebook</td>
                    <td><input type="radio" name="info" value="facebook"/></td>
                </tr>
                <tr>
                    <td>Znajomi</td>
                    <td><input type="radio" name="info" value="friends"/></td>
                </tr>
                <tr>
                    <td>Inne (jak?)</td>
                    <td><input type="radio" name="info"/> <input type="text" name="other"/></td>
                </tr>

                   
               
            </table>
<input type="submit" value="wyślij">
</form>

    </body>
</html>