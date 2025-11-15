// register.js
function handleRegister(event) {
  event.preventDefault();

  const name = document.getElementById("username").value.trim();
  const email = document.getElementById("email").value.trim();
  const password = document.getElementById("password").value;

  // basic validation
  if (!name || !email || !password) {
    alert("Please fill in all fields.");
    return;
  }

  const user = {
    username: name,
    email: email,
    password: password
  };

  console.log("Register payload:", user);

  axios.post("http://localhost:9001/register", user)
    .then(res => {
      console.log("Register success:", res.data);
      alert("Registration Successful!");
      // optional redirect:
      // window.location.href = "/login";
    })
    .catch(err => {
      console.error("Register failed:", err);
      // if your backend returns structured error: show message
      const msg = err?.response?.data?.message || "Registration failed";
      alert(msg);
    });
}

const form = document.getElementById("registerFrom");
if (form) {
  form.addEventListener("submit", handleRegister);
} else {
  console.error("No element with id 'registerForm' found in DOM.");
}
