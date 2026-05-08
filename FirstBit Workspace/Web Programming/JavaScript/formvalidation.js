function updatePasswordRules() {
    var password = document.getElementById("password").value;
    var rules = [
        {id: "ruleLength", valid: password.length >= 8, text: "At least 8 characters"},
        {id: "ruleUpper", valid: /[A-Z]/.test(password), text: "At least one uppercase letter"},
        {id: "ruleLower", valid: /[a-z]/.test(password), text: "At least one lowercase letter"},
        {id: "ruleNumber", valid: /[0-9]/.test(password), text: "At least one number"},
        {id: "ruleSpecial", valid: /[!@#$%^&*(),.?\":{}|<>]/.test(password), text: "At least one special character"}
    ];
    var allValid = true;

    for (var i = 0; i < rules.length; i++) {
        var rule = rules[i];
        var element = document.getElementById(rule.id);
        if (rule.valid) {
            element.innerHTML = "✅ " + rule.text;
            element.style.color = "green";
        } else {
            element.innerHTML = "❌ " + rule.text;
            element.style.color = "red";
            allValid = false;
        }
    }

    var strengthText = document.getElementById("passwordStrength");
    if (password.length === 0) {
        strengthText.innerHTML = "";
    } else if (allValid) {
        strengthText.innerHTML = "Password is strong";
        strengthText.style.color = "green";
    } else {
        strengthText.innerHTML = "Password is weak";
        strengthText.style.color = "red";
    }

    return allValid;
}

function showPasswordRules() {
    document.getElementById("passwordRules").style.display = "block";
    updatePasswordRules();
}

function hidePasswordRules() {
    var password = document.getElementById("password").value;
    if (password.length === 0) {
        document.getElementById("passwordRules").style.display = "none";
    }
}

function validateUsername() {
    var username = document.getElementById("username").value.trim();
    if (username.length === 0) {
        document.getElementById("usernameError").innerHTML = "Username cannot be empty";
    } else {
        document.getElementById("usernameError").innerHTML = "";
    }
}

function submitform() {

    // username = document.getElementById("username").value;
    // if(username.trim().length==0){
    //     document.getElementById("usernameError").innerHTML = "Username cannot be empty";
    //     return;
    // }else{
    //     document.getElementById("usernameError").innerHTML = "";
    // }

    // password = document.getElementById("password").value;

    // if(password.length<15){
    //     document.getElementById("passwordError").innerHTML = "Password must be at least 15 characters long";
    //     return;
    // }
    // else{
    //     document.getElementById("passwordError").innerHTML = "";
    // }

    // document.getElementById("regform").submit();

    var username = document.getElementById("username").value.trim();
    var email = document.getElementsByName("email")[0].value.trim();
    var mobile = document.getElementsByName("mobile")[0].value.trim();
    var gender = document.getElementsByName("gender");
    var subjects = document.getElementsByName("subject");
    var state = document.getElementsByName("state")[0].value;
    var isGenderSelected = false;
    var selectedSubjects = 0;
    var isFormValid = true;

    document.getElementById("usernameError").innerHTML = "";
    document.getElementById("emailError").innerHTML = "";
    document.getElementById("mobileError").innerHTML = "";
    document.getElementById("passwordError").innerHTML = "";
    document.getElementById("genderError").innerHTML = "";
    document.getElementById("subjectError").innerHTML = "";
    document.getElementById("stateError").innerHTML = "";

    if (username.length === 0) {
        document.getElementById("usernameError").innerHTML = "Username cannot be empty";
        isFormValid = false;
    }

    if (email.length === 0) {
        document.getElementById("emailError").innerHTML = "Email cannot be empty";
        isFormValid = false;
    } else if (!email.includes("@") || !email.includes(".")) {
        document.getElementById("emailError").innerHTML = "Enter a valid email address";
        isFormValid = false;
    }

    if (mobile.length === 0) {
        document.getElementById("mobileError").innerHTML = "Mobile number cannot be empty";
        isFormValid = false;
    } else if (mobile.length < 10 || mobile.length > 10 || isNaN(mobile)) {
        document.getElementById("mobileError").innerHTML = "Enter a valid 10-digit mobile number";
        isFormValid = false;
    }

    var passwordRulesValid = updatePasswordRules();
    if (!passwordRulesValid) {
        document.getElementById("passwordError").innerHTML = "Password must satisfy all rules below";
        isFormValid = false;
    }

    for (var i = 0; i < gender.length; i++) {
        if (gender[i].checked) {
            isGenderSelected = true;
            break;
        }
    }
    if (!isGenderSelected) {
        document.getElementById("genderError").innerHTML = "Please select a gender";
        isFormValid = false;
    }

    for (var j = 0; j < subjects.length; j++) {
        if (subjects[j].checked) {
            selectedSubjects++;
        }
    }
    if (selectedSubjects < 2) {
        document.getElementById("subjectError").innerHTML = "Select at least 2 subjects";
        isFormValid = false;
    }

    if (state === "") {
        document.getElementById("stateError").innerHTML = "Please choose a state";
        isFormValid = false;
    }

    if (isFormValid) {
        document.getElementById("regform").submit();
    }
}