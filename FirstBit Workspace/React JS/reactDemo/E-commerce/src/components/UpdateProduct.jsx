import "./UpdateProduct.css";
import { useEffect, useState } from "react";
import axios from "axios";

function UpdateProduct(prop) {

    const [products, setProducts] = useState(prop.products);

    const [selectedProduct, setSelectedProduct] = useState(null);


    useEffect(() => {
        setProducts(prop.products)
    }, [prop.products])



    function handleEdit(product) {

        setSelectedProduct({
            ...product
        });

    }


    function handleChange(event) {

        setSelectedProduct({

            ...selectedProduct,

            [event.target.name]: event.target.value

        });

    }


    function updateProduct(event) {

        event.preventDefault();

        axios.put(

            "http://localhost:8080/ProductAPI/products/" + selectedProduct.productId,

            selectedProduct

        )

            .then(response => {

                alert("Product Updated Successfully");

                prop.fetchProducts()

                setSelectedProduct(null);

            })

            .catch(err => console.log(err));

    }


    return (

        <>

            <div className="update-page">

                <h1 className="update-page-title">
                    Update Products
                </h1>



                <div className="update-products-container">

                    {

                        products.length > 0

                        ?

                        products.map(product => (

                            <div
                                className="update-product-card"
                                key={product.productId}
                            >

                                <img
                                    src={product.image[0]}
                                    alt=""
                                    className="update-product-image"
                                />



                                <div className="update-card-body">

                                    <h2>
                                        {product.pName}
                                    </h2>

                                    <p className="update-brand">
                                        {product.brand}
                                    </p>

                                    <p className="update-category">
                                        {product.category}
                                    </p>

                                    <h3>
                                        ₹ {product.price}
                                    </h3>

                                    <p className="update-stock">
                                        Stock : {product.stock}
                                    </p>



                                    <button

                                        className="update-edit-btn"

                                        onClick={() => handleEdit(product)}

                                    >
                                        Update Product
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




            {/* UPDATE MODAL */}


            {
                selectedProduct &&

                <div className="update-modal-overlay">

                    <div className="update-modal">

                        <div className="update-modal-header">

                            <h2>Update Product</h2>

                            <button
                                className="close-btn"
                                onClick={() => setSelectedProduct(null)}
                            >
                                ✖
                            </button>

                        </div>



                        <form
                            className="update-form"
                            onSubmit={updateProduct}
                        >

                            {/* PRODUCT NAME */}

                            <div className="form-group">

                                <label>
                                    Product Name
                                </label>

                                <input
                                    type="text"
                                    name="pName"
                                    value={selectedProduct.pName}
                                    onChange={handleChange}
                                />

                            </div>



                            {/* BRAND */}

                            <div className="form-group">

                                <label>
                                    Brand
                                </label>

                                <input
                                    type="text"
                                    name="brand"
                                    value={selectedProduct.brand}
                                    onChange={handleChange}
                                />

                            </div>



                            {/* CATEGORY */}

                            <div className="form-group">

                                <label>
                                    Category
                                </label>

                                <input
                                    type="text"
                                    name="category"
                                    value={selectedProduct.category}
                                    onChange={handleChange}
                                />

                            </div>



                            {/* PRICE */}

                            <div className="form-group">

                                <label>
                                    Price
                                </label>

                                <input
                                    type="number"
                                    name="price"
                                    value={selectedProduct.price}
                                    onChange={handleChange}
                                />

                            </div>



                            {/* STOCK */}

                            <div className="form-group">

                                <label>
                                    Stock
                                </label>

                                <input
                                    type="number"
                                    name="stock"
                                    value={selectedProduct.stock}
                                    onChange={handleChange}
                                />

                            </div>



                            {/* RATING */}

                            <div className="form-group">

                                <label>
                                    Rating
                                </label>

                                <input
                                    type="number"
                                    step="0.1"
                                    name="rating"
                                    value={selectedProduct.rating}
                                    onChange={handleChange}
                                />

                            </div>



                            {/* DISCOUNT */}

                            <div className="form-group">

                                <label>
                                    Discount %
                                </label>

                                <input
                                    type="number"
                                    name="discountPercentage"
                                    value={selectedProduct.discountPercentage}
                                    onChange={handleChange}
                                />

                            </div>



                            {/* TAGS */}

                            <div className="form-group">

                                <label>
                                    Tags
                                </label>

                                <input
                                    type="text"
                                    value={selectedProduct.tags.join(", ")}
                                    onChange={(e) =>
                                        setSelectedProduct({
                                            ...selectedProduct,
                                            tags: e.target.value.split(",")
                                        })
                                    }
                                />

                            </div>



                            {/* DESCRIPTION */}

                            <div className="form-group full-width">

                                <label>
                                    Description
                                </label>

                                <textarea
                                    name="description"
                                    value={selectedProduct.description}
                                    onChange={handleChange}
                                />

                            </div>



                            {/* IMAGE URL 1 */}

                            <div className="form-group">

                                <label>
                                    Image URL 1
                                </label>

                                <input
                                    type="text"
                                    value={selectedProduct.image[0]}
                                    onChange={(e) => {

                                        const updatedImages = [...selectedProduct.image];

                                        updatedImages[0] = e.target.value;

                                        setSelectedProduct({
                                            ...selectedProduct,
                                            image: updatedImages
                                        });

                                    }}
                                />

                            </div>



                            {/* IMAGE URL 2 */}

                            <div className="form-group">

                                <label>
                                    Image URL 2
                                </label>

                                <input
                                    type="text"
                                    value={selectedProduct.image[1]}
                                    onChange={(e) => {

                                        const updatedImages = [...selectedProduct.image];

                                        updatedImages[1] = e.target.value;

                                        setSelectedProduct({
                                            ...selectedProduct,
                                            image: updatedImages
                                        });

                                    }}
                                />

                            </div>


                            {/* IMAGE PREVIEW */}

                            <div className="preview-images full-width">

                                {
                                    selectedProduct.image.map((img, index) => (

                                        <img
                                            key={index}
                                            src={img}
                                            alt=""
                                            className="preview-img"
                                        />

                                    ))
                                }

                            </div>



                            {/* BUTTONS */}

                            <div className="update-modal-buttons full-width">

                                <button
                                    type="submit"
                                    className="update-save-btn"
                                >
                                    Save Changes
                                </button>



                                <button
                                    type="button"
                                    className="update-cancel-btn"
                                    onClick={() => setSelectedProduct(null)}
                                >
                                    Cancel
                                </button>

                            </div>

                        </form>

                    </div>

                </div>
            }
        </>
    );
}

export default UpdateProduct;