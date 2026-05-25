import { useState, useEffect } from "react";
import "./SearchProduct.css";
import Dashboard from "./Dashboard";
import axios from "axios"

function SearchProduct(prop) {

    const [filteredProduct, setFilteredProduct] = useState(prop.products)
    const [searched, setSearched] = useState(false)
    const [toSearch, setToSearch] = useState("")

    useEffect(() => {
        setFilteredProduct(prop.products)
    }, [prop.products])

    function onChangeFunction(event){
        if(event.target.value === ""){
            setSearched(false)
            setFilteredProduct(prop.products)
        }
        else{
            setToSearch(event.target.value)
            setSearched(true)
        }
    }

    function searchProduct(){

        if(toSearch === ""){
            return alert("Please Enter a valid input")
        }

        axios.get("http://localhost:8080/ProductAPI/products/" + toSearch)
        .then(response => (
            setFilteredProduct(response.data)
        ))
        .catch(err => console.log(err))

        console.log(filteredProduct)

    }

    return (
        <>

            <div className="search-container">

                <h1>Search Product</h1>

                <div className="search-box">

                    <input
                        id="searchInput"
                        type="text"
                        placeholder="Search Product"
                        onChange={onChangeFunction}
                    />

                    <button onClick={searchProduct}>
                        Search
                    </button>

                </div>

            </div>

            {
                searched ? (

                    filteredProduct.length == 0

                    ?

                    <div className="no-product-wrapper">
                    
                        <div className="no-product-found">

                            <img
                                src="https://cdn-icons-png.flaticon.com/512/6134/6134065.png"
                                alt="No Product"
                                className="no-product-img"
                            />

                            <h1>
                                Oops!
                            </h1>

                            <h3>
                                We couldn't find that product
                            </h3>

                            <p>
                                Try searching with another keyword
                            </p>

                        </div>
                    </div>
                    
                    :

                    (
                    <Dashboard products={filteredProduct}/>  
                    )

                )

                :

                (
                    <Dashboard products={filteredProduct}/>
                )
            }
            
        </>
    )
}

export default SearchProduct;