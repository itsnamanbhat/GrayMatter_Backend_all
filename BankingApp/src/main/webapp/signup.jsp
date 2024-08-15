<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signup Page</title>
    <link rel="stylesheet" href="signup.css">
</head>
<body>
	<style>
	.submit {
    padding: 10px;
    font-size: 16px;
    color: #fff;
    background-color: #007bff;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    text-decoration: none;
    text-align:center;
}

.submit:hover {
    background-color: #0056b3;
}
	</style>
    <div class="signup-container">
        <form class="signup-form" action="SignupServlet">
            <h1>Sign Up</h1>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            
            <label for="mobile">Mobile Number:</label>
            <input type="text" id="mobile" name="mobile" required>
            
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            
            <label for="aadhar">Aadhar Card:</label>
            <input type="text" id="aadhar" name="aadhar" required>
            
            
            <label for="accountType">Account Type:</label>
             <select id="accountType" name="accountType">
            <option value="current">Current</option>
            <option value="savings">Savings</option>
        	</select>
            
            <button type="submit" class="submit">Sign Up</button>
        </form>
    </div>
</body>
</html>
