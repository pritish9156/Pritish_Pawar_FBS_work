package model;

import java.util.ArrayList;

public class Product {
	
	int productId;
	String pName;
	String description;
	String category;
	double price;
	double discountPercentage;
	double rating;
	int stock;
	ArrayList<String> tags;
	String brand;
	ArrayList<String> image;
	ArrayList<Reviews> reviews;
	
	public Product() {
		
	}
	
	public Product(int productId, String pName, String description, String category, double price,
			double discountPercentage, double rating, int stock, ArrayList<String> tags, String brand,
			ArrayList<String> image, ArrayList<Reviews> reviews) {

		this.productId = productId;
		this.pName = pName;
		this.description = description;
		this.category = category;
		this.price = price;
		this.discountPercentage = discountPercentage;
		this.rating = rating;
		this.stock = stock;
		this.tags = tags;
		this.brand = brand;
		this.image = image;
		this.reviews = reviews;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public ArrayList<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public ArrayList<String> getImage() {
		return image;
	}
	public void setImage(ArrayList<String> image) {
		this.image = image;
	}
	public ArrayList<Reviews> getReviews() {
		return reviews;
	}
	public void setReviews(ArrayList<Reviews> reviews) {
		this.reviews = reviews;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", pName=" + pName + ", description=" + description + ", category="
				+ category + ", price=" + price + ", discountPercentage=" + discountPercentage + ", rating=" + rating
				+ ", stock=" + stock + ", tags=" + tags + ", brand=" + brand + ", image=" + image + ", reviews="
				+ reviews + "]";
	}
	
	
}
