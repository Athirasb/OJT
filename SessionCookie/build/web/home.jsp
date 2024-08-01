<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="jakarta.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f2f2f2;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }
            .container {
                background-color: #fff;
                padding: 20px;
                border-radius: 10px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                width: 300px;
                text-align: center;
            }
            h1 {
                margin-bottom: 20px;
                color: #333;
            }
            a {
                display: inline-block;
                padding: 10px 20px;
                margin-top: 20px;
                background-color: #007BFF;
                color: white;
                text-decoration: none;
                border-radius: 5px;
                font-size: 16px;
            }
            a:hover {
                background-color: #0056b3;
            }
        </style>
    </head>
    <body>
       <div class="container">
       <% 
         // Retrieve the session attribute
         String uname = (String) session.getAttribute("username");
         
         if (uname == null) {
              Cookie[] cookies = request.getCookies();
              if (cookies != null) {
                  for (Cookie cookie : cookies) {
                      if (cookie.getName().equals("uname")) {
                          uname = cookie.getValue();
                          session.setAttribute("username", uname);
                          break;
                      }
                  }
              }
           }
           
           if (uname != null) {
       %>
       <h1> Welcome, <%= uname %> </h1>
       <a href="logout.jsp">Logout</a>
       <% 
           } else {
       %>
       <h1> You are not logged in!</h1>
       <a href="login.html">Login</a>
       <% 
           }
       %>
       </div>
    </body>
</html>
