<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MYFavourite Bank</title>
</head>

<body>
    <style>
        body{
            font-family: 'Times New Roman', Times, serif;
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        .main_head {
            
            text-align: center;
            color: #180161;
            height: 3rem;
        }

        .user_choice {
            display: flex;
            justify-content: center;
            height: 80vh;
            padding: 2rem;
        }

        a {
            width: 10rem;
            height: 5rem;
            border-radius: 20px;
            margin: 2rem;
            background-color: #3FA2F6;
            color: white;
            font-size: 1.3rem;
            border: none;
             display: flex;
            justify-content: center;
            align-items: center;
            text-decoration: none;
        }

        a :hover {
            color: #3FA2F6;
            background-color: white;
            border: 0.8px solid black;
        }
        .intro{
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            width: 80%;
        }
        .intro h1{
            color: #4535C1;
            text-align: center;
        }
        .intro p{
            font-size: 1.2rem;
            text-align: center;
        }
    </style>
    <h1 class="main_head">Welcome User</h1>
    <div class="intro">
        <h1>YOU THINK. WE WILL BRING TO REALITYYY</h1>
        <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Hic doloribus facere fuga, architecto non natus
            dolores? Tempora voluptatem sapiente architecto nemo culpa consequatur libero iusto incidunt quibusdam natus
            aut quisquam quasi ex dignissimos debitis odio dicta aliquid esse, eligendi assumenda quis amet ea aliquam
            sint. Soluta laborum excepturi est commodi.</p>
    </div>
    <div class="user_choice">
        <a href="signup.jsp" >signup</a >
        <a href="login.jsp" >login</a >
    </div>
</body>

</html>