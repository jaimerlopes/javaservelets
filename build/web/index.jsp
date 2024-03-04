<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Login Page</title>
</head>
<body>
     
    <div class="container mt-5">
    <h2 class="mb-4">Login Form</h2>

    <!-- Bootstrap Login Form -->
    <form action="LoginServlet" method="post">
        <!-- Username (or Email) Input -->
        <div class="mb-3">
            <label for="inputUsername" class="form-label">Username or Email</label>
            <input type="text" class="form-control" id="username" name="username" value ="user123" placeholder="Enter your username or email" required>
        </div>

        <!-- Password Input -->
        <div class="mb-3">
            <label for="inputPassword" class="form-label">Password</label>
            <input type="password" class="form-control" id="password"  name="password"  placeholder="Enter your password" required>
        </div>

        <!-- Remember Me Checkbox -->
        <div class="mb-3 form-check">
            <input type="checkbox" class="form-check-input" id="rememberMe">
            <label class="form-check-label" for="rememberMe">Remember me</label>
        </div>

        <!-- Submit Button -->
        <button type="submit" class="btn btn-primary">Login</button>
    </form>
</div>
</body>
</html>