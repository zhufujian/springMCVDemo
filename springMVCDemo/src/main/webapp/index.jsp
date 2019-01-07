<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<body>
<h2>Hello World!</h2>
<shiro:guest> 
Hi there!  Please <a href="login.jsp">Login</a> or <a href="signup.jsp">Signup</a> today! (验证当前用户是否为“访客”，即未认证（包含未记住）的用户)
</shiro:guest>
<shiro:user> 
    Welcome back John!  Not John? Click <a href="login.jsp">here<a> to login. (认证通过或已记住的用户)
</shiro:user>

<shiro:authenticated> 
    <a href="updateAccount.jsp">Update your contact information(已认证通过的用户。不包含已记住的用户，这是与user标签的区别所在。)</a>. 
</shiro:authenticated>

<shiro:notAuthenticated> 
    Please <a href="login.jsp">login</a> in order to update your credit card information. 
</shiro:notAuthenticated>
</body>
</html>
