import "./navbar.css"

function Navbar() {
  return (
    <nav className="navbar navbar-expand-lg navbar-dark bg-dark px-3">
      <a className="navbar-brand fw-bold" href="/">
        MyApp
      </a>
      
      <a className="navbar-brand fw-bold" href="/">
        Search Employee
      </a>

      <a className="navbar-brand fw-bold" href="/">
        Delete Employee
      </a>

      <a className="navbar-brand fw-bold" href="/">
        Update Employee
      </a>
    </nav>
  );
}

export default Navbar;