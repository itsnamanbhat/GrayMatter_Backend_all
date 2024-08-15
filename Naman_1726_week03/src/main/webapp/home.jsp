<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
body, h1, h2, p, a {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
}

body {
    background-color: #f8f9fa;
    color: #333;
}

.customer_info {
            display: flex;
            align-items: flex-start;
            flex-direction: column;
            margin: 2rem 2rem 0 2rem;
            padding: 1rem 1rem 0.5rem 1rem;
            width:20rem;
            border-radius: 20px;
            color: white;
            background-color: #8AAAE5;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
 .customer_info h1{
 	font-size: 1.2rem;
 	
 }
 
 .customer_info p{
            font-size: 1.2rem;
        }
header {
    background-color: #007bff;
    color: white;
    text-align: center;
    padding: 20px 0;
}

.header {
    margin: 1rem;
    text-align:center;
   color:#8AAAE5;
    
}

main {
    text-align: center;
    padding: 20px;
}

.hero {
    background-color: #ffffff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.hero-image {
    max-width: 100%;
    height: auto;
    margin-bottom: 20px;
}

h2 {
    font-size: 24px;
    margin: 20px 0;
    
}

.actions {
    margin-top: 20px;
}

.button {
    display: inline-block;
    padding: 10px 20px;
    margin: 10px;
    font-size: 18px;
    color: white;
    background-color: #007bff;
    text-decoration: none;
    border-radius: 5px;
    transition: background-color 0.3s ease;
}

.button:hover {
    background-color: #0056b3;
}

footer {
    background-color: #007bff;
    color: white;
    text-align: center;
    padding: 10px 0;
    position: absolute;
    width: 100%;
    bottom: 0;
}
</style>
       <h1 class="header">Welcome to OurMart</h1>
       <div class="customer_info">
     <h1>Customer Info</h1>
    <p>Name: <%= request.getAttribute("name") %></h2>
    <p>Email: <%= request.getAttribute("email") %></p>
    <p>Mobile: <%= request.getAttribute("mobile") %></p>
    </div>
    </header>
    
    <main>
        <section class="hero">
            <img src="https://t4.ftcdn.net/jpg/02/86/05/43/240_F_286054327_3WkcLfTcDA8hQp0ph9ThNf7x3MSxwv0q.jpg" alt="Shopping Cart" class="hero-image">
            <h2>Your Shopping Paradise Awaits!</h2>
            <p>Discover a wide range of products and enjoy a seamless shopping experience.</p>
        </section>

        <section class="actions">
            <a href="order.jsp" class="button">Start Shopping</a>
            <a href="myorder.jsp" class="button">My Orders</a>
        </section>
    </main>

    
</body>
</html>