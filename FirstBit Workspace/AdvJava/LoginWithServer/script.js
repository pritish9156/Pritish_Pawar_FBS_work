document.getElementById("loginForm").addEventListener("submit", function(event){

    event.preventDefault();

    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;

    if(email === "admin@gmail.com" && password === "admin123"){

        alert("Login Successful");

        window.location.href = "dashboard.html";

    }
    else{

        alert("Invalid Email or Password");

    }

});

function logout(){

    let confirmLogout = confirm("Are you sure you want to logout?");

    if(confirmLogout){

        alert("Logout Successful");

        window.location.href = "login.html";
    }

}