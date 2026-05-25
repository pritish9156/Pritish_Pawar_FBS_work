import "./Dashboard.css";
import { useEffect, useState } from "react";

function Dashboard(prop) {

    const [products, setProduct] = useState(prop.products);

    const [selectedProduct, setSelectedProduct] = useState(null);

    const [currentImage, setCurrentImage] = useState(0);

    useEffect(() => {

        setProduct(prop.products);

    }, [prop.products]);

    console.log(products)

    return (

        <>
        

            <div className="dashboard-container">

                {

                    products.length > 0

                    ?

                    products.map((product) => (

                        <div
                            className="product-card"
                            key={product.productId}
                        >

                            <div className="image-container">

                                <img
                                    src={product.image[0]}
                                    alt=""
                                    className="product-image"
                                />

                                <span className="discount-badge">
                                    {product.discountPercentage}% OFF
                                </span>

                            </div>

                            <div className="card-body">

                                <h2>
                                    {product.pName}
                                </h2>

                                <p className="brand">
                                    {product.brand}
                                </p>

                                <p className="category">
                                    {product.category}
                                </p>

                                <div className="price-rating">

                                    <h3>
                                        ₹ {product.price}
                                    </h3>

                                    <span className="rating-badge">
                                        ⭐ {product.rating}
                                    </span>

                                </div>

                                <p className="stock">
                                    Stock : {product.stock}
                                </p>

                                <div className="tags">

                                    {

                                        product.tags.map((tag, index) => (

                                            <span key={index}>
                                                {tag}
                                            </span>

                                        ))

                                    }

                                </div>

                                <p className="description">

                                    {
                                        product.description.substring(0, 100)
                                    }...

                                </p>

                                <button
                                    className="show-more-btn"

                                    onClick={() => {

                                        setSelectedProduct(product);

                                        setCurrentImage(0);

                                    }}
                                >

                                    View Details

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




            {

                selectedProduct &&

                <div className="product-modal-overlay">

                    <div className="product-modal">

                        <button

                            className="close-modal-btn"

                            onClick={() =>
                                setSelectedProduct(null)
                            }

                        >
                            ✖
                        </button>



                        <div className="modal-top-section">

                            <div className="modal-left">

                                <div className="modal-image-wrapper">

                                    <img
                                        src={selectedProduct.image[currentImage]}
                                        alt={selectedProduct.pName}
                                        className="modal-main-image"
                                    />



                                    {

                                        selectedProduct.image.length > 1 &&

                                        <>

                                            <button
                                                className="image-nav-btn prev-btn"

                                                onClick={() =>

                                                    setCurrentImage(

                                                        currentImage === 0

                                                        ?

                                                        selectedProduct.image.length - 1

                                                        :

                                                        currentImage - 1
                                                    )

                                                }
                                            >

                                                ❮

                                            </button>



                                            <button
                                                className="image-nav-btn next-btn"

                                                onClick={() =>

                                                    setCurrentImage(

                                                        currentImage === selectedProduct.image.length - 1

                                                        ?

                                                        0

                                                        :

                                                        currentImage + 1
                                                    )

                                                }
                                            >

                                                ❯

                                            </button>

                                        </>

                                    }

                                </div>

                            </div>



                            <div className="modal-right">

                                <h1>
                                    {selectedProduct.pName}
                                </h1>

                                <p className="modal-brand">
                                    {selectedProduct.brand}
                                </p>

                                <p className="modal-category">
                                    {selectedProduct.category}
                                </p>



                                <div className="modal-price-rating">

                                    <h2 className="modal-price">
                                        ₹ {selectedProduct.price}
                                    </h2>

                                    <span className="modal-rating">
                                        ⭐ {selectedProduct.rating}
                                    </span>

                                </div>



                                <p className="modal-stock">

                                    Stock :
                                    {selectedProduct.stock}

                                </p>



                                <div className="modal-tags">

                                    {

                                        selectedProduct.tags.map((tag, index) => (

                                            <span key={index}>
                                                {tag}
                                            </span>

                                        ))

                                    }

                                </div>



                                <h3 className="modal-description-title">
                                    Product Description
                                </h3>

                                <p className="modal-description">

                                    {selectedProduct.description}

                                </p>

                            </div>

                        </div>




                        <div className="modal-reviews-section">

                            <h3>
                                Customer Reviews
                            </h3>

                            {

                                selectedProduct.reviews.map((review, index) => (

                                    <div
                                        key={index}
                                        className="modal-review-card"
                                    >

                                        <p>
                                            ⭐ {review.rating}
                                        </p>

                                        <p>
                                            {review.comment}
                                        </p>

                                        <small>
                                            {review.reviewerName}
                                        </small>

                                    </div>

                                ))

                            }

                        </div>

                    </div>

                </div>

            }

        </>

    );
}

export default Dashboard;