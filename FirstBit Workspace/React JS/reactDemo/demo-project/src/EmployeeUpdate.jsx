import { useEffect, useState } from "react";
import axios from "axios"

function EmployeeUpdate(props) {

    const [employees, setEmployees] = useState(props.employees);
    const [empToUpdate, setEmpToUpdate] = useState("");
    const [editEmployee, setEditEmployee] = useState(null);

    useEffect(()=>(
        setEmployees(props.employees)
    ), [props.employees])

    function UpdateEmployee() {
        const checkEmployee = employees.filter(
            emp => emp.empId === empToUpdate
        );

        if (checkEmployee.length === 0) {
            alert("Invalid Employee ID");
            return;
        }

        let res = confirm("Are You Sure");

        if (!res) return;

        setEditEmployee(checkEmployee[0]);
    }

    async function saveEmployee() {

        await axios.put(
            `https://6a0def77769682b8ee770cc9.mockapi.io/employees/${editEmployee.id}`, editEmployee
        )

        const updatedEmployee = employees.map(emp => {

            if (emp.empId === editEmployee.empId) {
                return editEmployee
            }

            return emp
        })

        setEmployees(updatedEmployee)

        alert("Employee Updated Successfully")

        setEditEmployee(null)
    }

    return (
        <div className="container mt-5">
            <h2 className="text-center mb-4">
                Employee Update
            </h2>
            <div className="d-flex gap-3 mb-4">
                <input
                    type="text"
                    className="form-control"
                    placeholder="Enter Employee ID"
                    value={empToUpdate}
                    onChange={(e) => setEmpToUpdate(e.target.value)}
                />

                <button
                    className="btn btn-danger"
                    onClick={UpdateEmployee}
                >
                    Update
                </button>
            </div>

            {
                editEmployee && (
                    <div className="card p-4 mb-4">

                        <h3 className="mb-3">
                            Update Employee
                        </h3>

                        <input
                            type="text"
                            className="form-control mb-3"
                            placeholder="First Name"
                            value={editEmployee.firstName}
                            onChange={(e) =>
                                setEditEmployee({
                                    ...editEmployee,
                                    firstName: e.target.value
                                })
                            }
                        />

                        <input
                            type="text"
                            className="form-control mb-3"
                            placeholder="Last Name"
                            value={editEmployee.lastName}
                            onChange={(e) =>
                                setEditEmployee({
                                    ...editEmployee,
                                    lastName: e.target.value
                                })
                            }
                        />

                        <input
                            type="text"
                            className="form-control mb-3"
                            placeholder="Role"
                            value={editEmployee.role}
                            onChange={(e) =>
                                setEditEmployee({
                                    ...editEmployee,
                                    role: e.target.value
                                })
                            }
                        />

                        <input
                            type="text"
                            className="form-control mb-3"
                            placeholder="Salary"
                            value={editEmployee.salary}
                            onChange={(e) =>
                                setEditEmployee({
                                    ...editEmployee,
                                    salary: e.target.value
                                })
                            }
                        />

                        <button
                            className="btn btn-success"
                            onClick={saveEmployee}
                        >
                            Save Changes
                        </button>

                    </div>
                )
            }

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
                        employees.map(emp => (

                            <tr>
                                <td>{emp.empId}</td>
                                <td>{emp.firstName}</td>
                                <td>{emp.lastName}</td>
                                <td>{emp.role}</td>
                                <td>{emp.email}</td>
                                <td>{emp.mobileNo}</td>
                                <td>{emp.DOB}</td>
                                <td>{emp.address}</td>
                                <td>${emp.salary}</td>
                            </tr>
                        ))
                    }

                </tbody>

            </table>

        </div>
    );
}

export default EmployeeUpdate;