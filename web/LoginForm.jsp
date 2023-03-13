<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Action Form Page</title>
    </head>
    <body>
        <form action="LoginAction.do" method="post">
            <table>
            <tr><td>isim:</td><td>
            <input type="text" name="username"><br></td></tr>
            <tr><td>password:</td><td>
            <input type="text" name="password"><br></td></tr>
            <tr><td align="center">
            <input type="submit" value="OK"</td></tr></table>
        </form>
    </body>
</html>
