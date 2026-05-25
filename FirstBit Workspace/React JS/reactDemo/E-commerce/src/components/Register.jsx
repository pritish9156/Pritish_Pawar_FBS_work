import "./style.css";
import { Link } from "react-router-dom";
import axios from "axios";
import { useState } from "react";

function Register() {

    const [user, setUser] = useState({
        username: "",
        email: "",
        password: "",
        securityQuestion: "",
        answer: "",
        isActive: true
    });

    function handleChange(e){
        setUser({
            ...user,
            [e.target.name]: e.target.value
        });
    }

    async function handleRegister(e){
        e.preventDefault();

        try{
            let response = await axios.post("http://localhost:8080/LoginProject/registerForm", user);

            console.log(response.data);
            alert("Registered Successfully");

        }
        catch(error){
            console.log(error);
        }
    }

    return (

        <>

            <div className="auth-page">

                <div className="auth-container">

                    <div className="auth-card">

                        <h2 className="text-center mb-2">
                            Create Account ✨
                        </h2>

                        <p className="text-center text-muted mb-4">
                            Register your new account
                        </p>

                        <form onSubmit={handleRegister}>

                            <div className="mb-3">

                                <label className="form-label">
                                    Username
                                </label>

                                <input
                                    type="text"
                                    className="form-control"
                                    placeholder="Enter username"
                                    name="username"
                                    value={user.username}
                                    onChange={handleChange}
                                    required
                                />

                            </div>



                            <div className="mb-3">

                                <label className="form-label">
                                    Email
                                </label>

                                <input
                                    type="email"
                                    className="form-control"
                                    placeholder="Enter email"
                                    name="email"
                                    value={user.email}
                                    onChange={handleChange}
                                    required
                                />

                            </div>



                            <div className="mb-3">

                                <label className="form-label">
                                    Password
                                </label>

                                <input
                                    type="password"
                                    className="form-control"
                                    placeholder="Enter password"
                                    name="password"
                                    value={user.password}
                                    onChange={handleChange}
                                    required
                                />

                            </div>



                            <div className="mb-3">

                                <label className="form-label">
                                    Security Question
                                </label>

                                <select
                                    className="form-select"
                                    name="securityQuestion"
                                    value={user.securityQuestion}
                                    onChange={handleChange}
                                    required
                                >

                                    <option value="">
                                        Select Question
                                    </option>

                                    <option>
                                        Your first school name?
                                    </option>

                                    <option>
                                        Your pet name?
                                    </option>

                                    <option>
                                        Your favorite teacher?
                                    </option>

                                </select>

                            </div>



                            <div className="mb-3">

                                <label className="form-label">
                                    Security Answer
                                </label>

                                <input
                                    type="text"
                                    className="form-control"
                                    name="answer"
                                    value={user.answer}
                                    onChange={handleChange}
                                    placeholder="Enter answer"
                                    required
                                />

                            </div>



                            <button
                                type="submit"
                                className="btn btn-primary w-100 auth-btn"
                            >

                                Register

                            </button>



                            <p className="text-center mt-4">

                                Already have an account?

                                {" "}

                                <Link
                                    to="/"
                                    className="link-text"
                                >

                                    Login

                                </Link>

                            </p>

                        </form>

                    </div>

                </div>

            </div>

        </>

    );
}

export default Register;