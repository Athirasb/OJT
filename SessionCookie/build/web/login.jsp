<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                background-color: #ffe5e5; /* light red background */
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }
            .container {
                background-color: #fff;
                padding: 30px;
                border-radius: 15px;
                box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
                text-align: center;
                width: 400px;
            }
            h1 {
                color: black; /* red color */
                margin-bottom: 20px;
            }
            a {
                display: inline-block;
                padding: 10px 20px;
                margin-top: 20px;
                background-color: #ff0000; /* red color */
                color: white;
                text-decoration: none;
                border-radius: 5px;
                font-size: 16px;
            }
            a:hover {
                background-color: #cc0000; /* darker red color */
            }
            .message {
                color: #ff0000; /* red color */
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Hello World!</h1>
            
            <% 
                String uname = request.getParameter("username");
                String pwd = request.getParameter("password");
                
                // authenticate
                if ("athira".equals(uname) && "aadhi".equals(pwd)) {
                    // create a session and set the username attribute
                    session.setAttribute("username", uname);
                    
                    // create a cookie to store the username
                    Cookie userCookie = new Cookie("username", uname);
                    userCookie.setMaxAge(60 * 60 * 24); // 1 day
                    response.addCookie(userCookie);
                    
                    response.sendRedirect("home.jsp");
                } else { 
            %>
                <div class="message">
                    <h1>Login Failed/Invalid Data</h1>
                    <a href="login.html">Try Again</a>
                </div>
            <% 
                }
            %>
        </div>
    </body>
</html>
