import Dashboard from "./components/Dashboard"
import Navbar from "./components/Navbar"
import axios from "axios"

import { useEffect, useState } from "react"
import SearchProduct from "./components/SearchProduct"
import DeleteProduct from "./components/DeleteProduct"
import UpdateProduct from "./components/UpdateProduct"
import {Routes, Route} from "react-router-dom"
import Login from "./components/Login"
import Register from "./components/Register"

function App() {

  const [products, setProducts] = useState([])
  const [searchTerm, setSearchTerm] = useState("")   
  const [loginStatus, setLoginStatus] = useState(false)


  const filteredProducts = products.filter((product) => {

        return product.pName
            .toLowerCase()
            .includes(searchTerm.toLowerCase())

  })

  function fetchProducts(){

    axios("http://localhost:8080/ProductAPI/products")
    .then(products => (
      setProducts(products.data)
    ))
    .catch(err => console.log(err))

  }

  useEffect(()=>{
    fetchProducts();
  }, [])
 

  return (
   <>
      {
        loginStatus
        ?
        <>
        <Navbar setSearchTerm={setSearchTerm} setLoginStatus = {setLoginStatus} />

          <Routes>
            <Route path="/" element={<Dashboard products = {filteredProducts}/>} />
            <Route path="/search" element={<SearchProduct products = {filteredProducts} /> } />
            <Route path="/update" element={<UpdateProduct products = {filteredProducts} fetchProducts={fetchProducts} />} />
            <Route path="/delete" element={<DeleteProduct products = {filteredProducts} fetchProducts={fetchProducts} />} />
          </Routes> 
        </>
        : 
        <>
          <Routes>
              <Route path="/" element={<Login setLoginStatus = {setLoginStatus} />} />
              <Route path="/register" element={<Register /> } />
          </Routes> 
        </>
      }
   </>
  )
}

export default App
