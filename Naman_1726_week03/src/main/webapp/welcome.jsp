<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to ourMart</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f7f7f7;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .welcome-container {
            text-align: center;
            background-color: #fff;
            padding: 2rem;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            width: 100%;
        }
        h1 {
            font-size: 2.5rem;
            color: #333;
            margin-bottom: 1rem;
        }
        p {
            font-size: 1.2rem;
            color: #666;
            margin-bottom: 2rem;
        }
        .btn-shop-now {
            display: inline-block;
            padding: 0.8rem 1.5rem;
            font-size: 1rem;
            color: #fff;
            background-color: #007bff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s;
        }
        .btn-shop-now:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="welcome-container">
        <h1>Welcome to OurMart</h1>
        <p>Your one-stop shop for all your needs!</p>
        <a href="login.jsp" class="btn-shop-now">Login</a>
         <a href="signup.jsp" class="btn-shop-now">Sign up</a>
    </div>
</body>
</html>
