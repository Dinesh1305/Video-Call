function handleLogin(event) {
    event.preventDefault();

    const name = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    const user = {
        username: name,
        password: password
    };
console.log(user);
    axios.post("http://localhost:9001/login", user)
        .then(res => {
            console.log("Login success:", res.data);
            alert("Login Successful!");
			window.location.href = "home";  
        })
        .catch(err => {
            console.error("Login failed:", err);
            alert("Invalid username or password");
        });
}

const login = document.getElementById("LoginForm");
login.addEventListener("submit", handleLogin);
