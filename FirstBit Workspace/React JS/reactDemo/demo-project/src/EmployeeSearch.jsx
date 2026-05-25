import { useEffect, useState } from "react"
import axios from "axios"
import "./employeeSearch.css"

function EmployeeSearch(prop){

    let emp = prop.employees

    const [empToSearch, setEmpSearch] = useState("")

    const filteredEmployee = emp.filter(emp=>(
        emp.firstName.toLowerCase().includes(empToSearch.toLowerCase()) ||
        emp.lastName.toLowerCase().includes(empToSearch.toLowerCase())
    ))

    return(
       <div className="container mt-5">
        <h2 className="text-center mb-4">Employee Search</h2>

        <div className="search-wrapper">
            <div className="search-box">
                <input type="text" className="form-control search-input" placeholder="Search Employee..." onChange={(e) => setEmpSearch(e.target.value)}/>
            </div>
        </div>

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

                filteredEmployee.length!==0 
                ?
                
                    filteredEmployee.map(e => (

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
               
                :
               
                <tr>
                    <td colSpan="9">
                        Employee Not Found
                    </td>
                </tr>
               
            }

        </tbody> 
        </table>
        </div>
    )


}

export default EmployeeSearch