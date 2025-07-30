<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Registration Form</title>
  <script src="https://cdn.tailwindcss.com"></script>
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
  <style>
    body {
      font-family: 'Poppins', sans-serif;
    }
    .glass {
      backdrop-filter: blur(15px);
      background: rgba(255, 255, 255, 0.15);
      border: 1px solid rgba(255, 255, 255, 0.25);
    }
    input::placeholder {
      color: #ffffff;
    }
  </style>
</head>
<body class="bg-gradient-to-br from-blue-400 via-purple-500 to-pink-400 min-h-screen flex items-center justify-center p-4">

  <div class="glass rounded-3xl shadow-2xl p-8 w-full max-w-md text-white">
    <h2 class="text-4xl font-bold text-center mb-6">Create Account</h2>

    <form:form action="/submit" method="POST" modelAttribute="student" class="space-y-6">

      <div>
        <label for="name" class="block text-sm font-semibold mb-1">Name</label>
        <div class="relative">
          <form:input path="name" id="name" cssClass="w-full px-10 py-3 rounded-lg bg-white bg-opacity-20 text-white placeholder-white focus:outline-none focus:ring-2 focus:ring-white transition" placeholder="Enter your name"/>
          <span class="absolute left-3 top-3.5 text-white">
            <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none"
                 viewBox="0 0 24 24" stroke="currentColor"><path stroke-linecap="round"
                 stroke-linejoin="round" stroke-width="2" d="M5.121 17.804A13.937 13.937 0 0112 15c2.21 0 4.288.535 6.121 1.48M15 11a3 3 0 10-6 0 3 3 0 006 0z" /></svg>
          </span>
        </div>
      </div>

      <div>
        <label for="email" class="block text-sm font-semibold mb-1">Email</label>
        <div class="relative">
          <form:input path="email" type="email" id="email" cssClass="w-full px-10 py-3 rounded-lg bg-white bg-opacity-20 text-white placeholder-white focus:outline-none focus:ring-2 focus:ring-white transition" placeholder="Enter your email"/>
          <span class="absolute left-3 top-3.5 text-white">
            <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none"
                 viewBox="0 0 24 24" stroke="currentColor"><path stroke-linecap="round"
                 stroke-linejoin="round" stroke-width="2" d="M16 12l-4-4-4 4m8 0l-4 4-4-4" /></svg>
          </span>
        </div>
      </div>

      <div>
        <label for="password" class="block text-sm font-semibold mb-1">Password</label>
        <div class="relative">
          <form:password path="password" id="password" cssClass="w-full px-10 py-3 rounded-lg bg-white bg-opacity-20 text-white placeholder-white focus:outline-none focus:ring-2 focus:ring-white transition" placeholder="Enter your password"/>
          <span class="absolute left-3 top-3.5 text-white">
            <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none"
                 viewBox="0 0 24 24" stroke="currentColor"><path stroke-linecap="round"
                 stroke-linejoin="round" stroke-width="2" d="M12 11c0-1.1.9-2 2-2h0a2 2 0 012 2v0a2 2 0 01-2 2h0a2 2 0 01-2-2zm6 5H6a2 2 0 01-2-2V9a2 2 0 012-2h12a2 2 0 012 2v5a2 2 0 01-2 2z" /></svg>
          </span>
        </div>
      </div>

      <button type="submit"
              class="w-full bg-white bg-opacity-30 hover:bg-opacity-50 text-white font-semibold py-3 rounded-lg shadow-lg transition duration-300">
        Register
      </button>
    </form:form>

    <p class="text-center text-sm text-white mt-6">
      Already registered?
      <a href="#" class="underline font-semibold hover:text-gray-200">Login here</a>
    </p>
  </div>

</body>
</html>
