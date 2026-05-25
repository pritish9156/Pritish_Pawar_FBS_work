
function EmployeeDetails(prop) {

  let emp = prop.employees

  console.log(emp)

  return (
    <div className="container mt-5">
      <h2 className="text-center mb-4">Employee Details</h2>

      <table className="table table-bordered table-hover text-center">
        <thead className="table-dark">
          <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Role</th>
            <th>Email</th>
            <th>Mobile Number</th>
            <th>Date of Birth</th>
            <th>Address</th>
            <th>Salary</th>
          </tr>
        </thead>

        <tbody>

          {
            emp.map(e => (

              <tr>
                <td>{e.empId}</td>
                <td>{e.firstName}</td>
                <td>{e.lastName}</td>
                <td>{e.role}</td>
                <td>{e.email}</td>
                <td>{e.mobileNo}</td>
                <td>{e.DOB}</td>
                <td>{e.address}</td>
                <td>${e.salary}</td>
              </tr>

            ))
          }

        </tbody>
      </table>
    </div>
  );
}

export default EmployeeDetails;