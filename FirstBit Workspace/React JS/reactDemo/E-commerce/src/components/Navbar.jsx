import "./Navbar.css";
import { Link } from "react-router-dom";
import { useState } from "react";

function Navbar(prop) {

  let setSearchTerm = prop.setSearchTerm;

  const [showProfile, setShowProfile] = useState(false);

  return (

    <>

      <nav className="navbar">

        <div className="profile-container">

            <div
              className="profile-icon"

              onClick={() =>
                setShowProfile(!showProfile)
              }
            >

              A

            </div>

            {

              showProfile &&

              <div className="profile-dropdown">

                <div className="profile-info">

                  <div className="profile-avatar">
                    A
                  </div>

                  <h3>
                    Admin
                  </h3>

                  <p>
                    admin@gmail.com
                  </p>

                </div>



                <button className="logout-btn" onClick={()=>prop.setLoginStatus(false)} >

                  Logout

                </button>

              </div>

            }

          </div>

        <div className="logo">
          ProductManager
        </div>



        <ul className="nav-links">

          <li>
            <Link to="/">
              Dashboard
            </Link>
          </li>

          <li>
            <Link to="/search">
              Search Product
            </Link>
          </li>

          <li>
            <Link to="/update">
              Update Product
            </Link>
          </li>

          <li>
            <Link to="/delete">
              Delete Product
            </Link>
          </li>

        </ul>



        <div className="navbar-right">

          <div className="search-box">

            <input
              type="text"
              placeholder="Search Product..."
              onChange={(e) =>
                setSearchTerm(e.target.value)
              }
            />

          </div>

        </div>

      </nav>

    </>

  );
}

export default Navbar;