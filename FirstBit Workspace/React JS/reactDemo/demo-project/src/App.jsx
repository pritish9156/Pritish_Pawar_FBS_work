import Navbar from "./Navbar";
import EmployeeDetails from "./EmployeeDetails";
import { useEffect, useState } from "react";
import axios from "axios"
import EmployeeSearch from "./EmployeeSearch";
import EmployeeUpdate from "./EmployeeUpdate";
import EmployeeDelete from "./EmployeeDelete";


function App() {

  const [employees, setEmployee] = useState([])

  useEffect(()=>{

    axios.get("https://6a0def77769682b8ee770cc9.mockapi.io/employees")
    .then(response => (
      setEmployee(response.data)
    ))
    .catch(err => (console.log(err)))

  }, [])

  return (
    <>
      <Navbar />
      <EmployeeDetails employees = {employees}/>
      <EmployeeSearch employees = {employees}/>
      <EmployeeUpdate employees = {employees}/>
      <EmployeeDelete employees = {employees}/>
    </>
  )
}

export default App
