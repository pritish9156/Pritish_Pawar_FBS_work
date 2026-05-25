import "./DeleteProduct.css";
import { useEffect, useState } from "react";
import axios from "axios";

function DeleteProduct(prop) {

    const [products, setProducts] = useState(prop.products);
    const [selectedProduct, setSelectedProduct] = useState(null);

    useEffect(() => {
        setProducts(prop.products)
    }, [prop.products])

    function deleteProduct() {

        axios.delete("http://localhost:8080/ProductAPI/products/" + selectedProduct.productId)
        .then(() => {

            alert("Product Deleted Successfully");

            prop.fetchProducts()
            setSelectedProduct(null);

        })
        .catch(err => console.log(err));

    }


    return (

        <>
            <div className="delete-page">
                <h1 className="delete-page-title">
                    Delete Products
                </h1>

                <div className="delete-products-container">
                    {

                        products.length > 0
                        ?
                        products.map(product => (
                            <div className="delete-product-card" key={product.productId}>

                                <img
                                    src={product.image[0]}
                                    alt=""
                                    className="delete-product-image"
                                />

                                <div className="delete-card-body">
                                    <h2>
                                        {product.pName}
                                    </h2>

                                    <p className="delete-brand">
                                        {product.brand}
                                    </p>

                                    <h3>
                                        ₹ {product.price}
                                    </h3>


                                    <button
                                        className="delete-btn"
                                        onClick={() =>
                                            setSelectedProduct(product)
                                        }
                                    >
                                        Delete Product
                                    </button>
                                </div>
                            </div>
                        ))

                        :

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
                    }
                </div>
            </div>


            {
                selectedProduct &&
                <div className="delete-modal-overlay">
                    <div className="delete-modal">
                        <h2>
                            Delete Product
                        </h2>

                        <img
                            src={selectedProduct.image[0]}
                            alt=""
                            className="delete-modal-image"
                        />


                        <h3>
                            {selectedProduct.pName}
                        </h3>


                        <p>
                            Are you sure you want to
                            delete this product?
                        </p>


                        <div className="delete-modal-buttons">
                            <button
                                className="confirm-delete-btn"
                                onClick={deleteProduct}
                            >
                                Yes Delete
                           </button>

                            <button
                                className="cancel-delete-btn"
                                onClick={() =>
                                    setSelectedProduct(null)
                                }

                            >
                                Cancel
                            </button>
                        </div>
                    </div>
                </div>
            }
        </>
    );
}

export default DeleteProduct;