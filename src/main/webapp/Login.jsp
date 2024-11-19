<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="login" method="post">
    Username: <input type="text" name="user_name" id="user_name" placeholder="Username">
    <br>
    Password: <input type="password" name="password" id="password" placeholder="Password">
    <br>
    <input type="submit" value="Login">
    <a href="Register.jsp">Register</a>
</form>
<a href="${pageContext.request.contextPath}/RegisterServlet">Register</a>
${msg}
<!-- Hiển thị thông báo lỗi nếu có -->
<c:if test="${not empty error}">
    <p style="color: red;">${error}</p>
</c:if>
