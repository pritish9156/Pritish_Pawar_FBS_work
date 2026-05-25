import { useEffect, useState } from "react"
import "./employeeSearch.css"
import axios from "axios"

function EmployeeDelete(prop){

    const [employees, setEmployees] = useState(prop.employees)
    const [empToDelete, setEmpDelete] = useState("")

    useEffect(()=>(
        setEmployees(prop.employees)
    ), [prop.employees])

//     function deleteEmployee(){
//         const checkEmployee = employees.filter(emp=>(
//             emp.empId === empToDelete
//         ))

//         if(checkEmployee.length===0){
//             alert("Invalid Employee ID")
//             return
//         }

//         let res = confirm("Are You Sure")
 
//         if(res){
//             const filteredEmployee = employees.filter(emp=>(
//                 emp.empId !== empToDelete
//             ))

//             setEmployees(filteredEmployee)
//        }
//    }

   function deleteEmployee(){
        const checkEmployee = employees.filter(emp=>(
            emp.empId === empToDelete
        ))

        if(checkEmployee.length===0){
            alert("Invalid Employee ID")
            return
        }

        let res = confirm("Are You Sure")
 
        if(res){
            axios.delete(`https://6a0def77769682b8ee770cc9.mockapi.io/employees/${checkEmployee[0].id}`)
            .then(res => console.log(res))
            .catch(err=>console.log(err))

            setEmployees(
                employees.filter(
                    emp => emp.id !== checkEmployee[0].id
                )
            )

            alert("Deleted Successfully")
       }
   }

    return(
       <div className="container mt-5">
        <h2 className="text-center mb-4">Employee Delete</h2>

        <div className="search-wrapper">
            <div className="search-box">
                <input type="text" className="form-control search-input" placeholder="Enter Employee Id..." onChange={(e) => setEmpDelete(e.target.value)} />
            </div>
            <div>
                <button className="btn btn-danger" onClick={deleteEmployee}>Delete</button>
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

                employees.map(e => (

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
    )


}

export default EmployeeDelete