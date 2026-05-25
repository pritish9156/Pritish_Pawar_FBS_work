import { useState } from "react";
import "./style.css";
import { Link } from "react-router-dom";
import axios from "axios";

function Login(prop) {

    const [userName, setUserName] = useState("")
    const [password, setPassword] = useState("")

    function LoginAuth(e){
        e.preventDefault()

        axios.get(`http://localhost:8080/LoginProject/loginForm?email=${userName}&password=${password}`)
        .then(Response=>{

            if(Response.data === "valid user"){
                prop.setLoginStatus(true)
                alert("Login Succssess")
            }  
            else{
                alert("Invalid Credentials...")
            }
        })
    }


    return (

        <>

            <div className="auth-page">

                <div className="auth-container">

                    <div className="auth-card">

                        <h2 className="text-center mb-2">
                            Welcome Back 👋
                        </h2>

                        <p className="text-center text-muted mb-4">
                            Login to your account
                        </p>

                        <form>

                            <div className="mb-3">

                                <label className="form-label">
                                    Email
                                </label>

                                <input
                                    type="email"
                                    className="form-control"
                                    placeholder="Enter email"
                                    name="email"
                                    onChange={e=>setUserName(e.target.value)}
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
                                    onChange={e=>setPassword(e.target.value)}
                                    required
                                />

                            </div>



                            <div className="d-flex justify-content-between mb-3">

                                <div>

                                    <input type="checkbox" />

                                    {" "}Remember me

                                </div>



                                <Link to="/forgotPassword" className="link-text">
                                    Forgot Password?
                                </Link>

                            </div>



                            <button
                                type="submit"
                                className="btn btn-primary w-100 auth-btn"
                                onClick={LoginAuth}
                            >

                                Login

                            </button>



                            <p className="text-center mt-4">

                                Don't have an account?

                                {" "}

                                <Link
                                    to="/register"
                                    className="link-text"
                                >

                                    Register

                                </Link>

                            </p>

                        </form>

                    </div>

                </div>

            </div>

        </>

    );
}

export default Login;