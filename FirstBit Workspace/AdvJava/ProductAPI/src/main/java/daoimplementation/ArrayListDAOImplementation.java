package daoimplementation;

import java.time.LocalDate;
import java.util.ArrayList;

import daointerface.ProductDAOInterface;
import model.Product;
import model.Reviews;

public class ArrayListDAOImplementation implements  ProductDAOInterface{
	
	ArrayList<Product> productArray = new ArrayList<Product>();
	
	public ArrayListDAOImplementation(){
	
		 /*
         * =========================
         * MOBILE PRODUCT
         * =========================
         */

        ArrayList<Reviews> mobileReviews = new ArrayList<>();

        mobileReviews.add(
                new Reviews(
                        5,
                        "Excellent camera quality",
                        LocalDate.of(2026, 5, 20),
                        "Yash",
                        "yash@gmail.com"));

        mobileReviews.add(
                new Reviews(
                        4,
                        "Battery backup is good",
                        LocalDate.of(2026, 5, 30),
                        "Rahul",
                        "rahul@gmail.com"));

        ArrayList<String> mobileTags = new ArrayList<>();

        mobileTags.add("5G");
        mobileTags.add("AMOLED");
        mobileTags.add("Fast Charging");

        ArrayList<String> mobileImages = new ArrayList<>();

        mobileImages.add("https://images.unsplash.com/photo-1511707171634-5f897ff02aa9");
        mobileImages.add("https://images.unsplash.com/photo-1598327105666-5b89351aff97");

        Product mobile = new Product(
                1,
                "iPhone 15",
                "Apple flagship smartphone",
                "Mobile",
                80000,
                10,
                4.7,
                15,
                mobileTags,
                "Apple",
                mobileImages,
                mobileReviews);



        /*
         * =========================
         * LAPTOP PRODUCT
         * =========================
         */

        ArrayList<Reviews> laptopReviews = new ArrayList<>();

        laptopReviews.add(
                new Reviews(
                        5,
                        "Perfect for coding",
                        LocalDate.of(2026, 9, 25),
                        "Aman",
                        "aman@gmail.com"));

        laptopReviews.add(
                new Reviews(
                        4,
                        "Performance is smooth",
                        LocalDate.of(2026, 12, 30),
                        "Rohit",
                        "rohit@gmail.com"));

        ArrayList<String> laptopTags = new ArrayList<>();

        laptopTags.add("i7");
        laptopTags.add("16GB RAM");
        laptopTags.add("SSD");

        ArrayList<String> laptopImages = new ArrayList<>();

        laptopImages.add("https://images.unsplash.com/photo-1496181133206-80ce9b88a853");
        laptopImages.add("https://images.unsplash.com/photo-1517336714739-489689fd1ca8");

        Product laptop = new Product(
                2,
                "Dell Inspiron",
                "High performance laptop",
                "Laptop",
                65000,
                8,
                4.5,
                5,
                laptopTags,
                "Dell",
                laptopImages,
                laptopReviews);



        /*
         * =========================
         * SHOES PRODUCT
         * =========================
         */

        ArrayList<Reviews> shoesReviews = new ArrayList<>();

        shoesReviews.add(
                new Reviews(
                        4,
                        "Very comfortable",
                        LocalDate.of(2026, 8, 8),
                        "Karan",
                        "karan@gmail.com"));

        shoesReviews.add(
                new Reviews(
                        4,
                        "Best for running",
                        LocalDate.of(2026, 6, 8),
                        "Neha",
                        "neha@gmail.com"));

        ArrayList<String> shoesTags = new ArrayList<>();

        shoesTags.add("Running");
        shoesTags.add("Sports");
        shoesTags.add("Lightweight");

        ArrayList<String> shoesImages = new ArrayList<>();

        shoesImages.add("https://images.unsplash.com/photo-1542291026-7eec264c27ff");
        shoesImages.add("https://images.unsplash.com/photo-1460353581641-37baddab0fa2");

        Product shoes = new Product(
                3,
                "Nike Air Max",
                "Comfortable running shoes",
                "Shoes",
                5000,
                12,
                4.3,
                20,
                shoesTags,
                "Nike",
                shoesImages,
                shoesReviews);



        /*
         * =========================
         * WATCH PRODUCT
         * =========================
         */

        ArrayList<Reviews> watchReviews = new ArrayList<>();

        watchReviews.add(
                new Reviews(
                        5,
                        "Premium design",
                        LocalDate.of(2026, 1, 10),
                        "Vikas",
                        "vikas@gmail.com"));

        watchReviews.add(
                new Reviews(
                        4,
                        "Battery lasts long",
                        LocalDate.of(2026, 2, 15),
                        "Riya",
                        "riya@gmail.com"));

        ArrayList<String> watchTags = new ArrayList<>();

        watchTags.add("Smart Watch");
        watchTags.add("Bluetooth");
        watchTags.add("Waterproof");

        ArrayList<String> watchImages = new ArrayList<>();

        watchImages.add("https://images.unsplash.com/photo-1523275335684-37898b6baf30");
        watchImages.add("https://images.unsplash.com/photo-1546868871-7041f2a55e12");

        Product watch = new Product(
                4,
                "Samsung Galaxy Watch",
                "Advanced smart watch",
                "Watch",
                18000,
                15,
                4.4,
                8,
                watchTags,
                "Samsung",
                watchImages,
                watchReviews);



        /*
         * =========================
         * HEADPHONE PRODUCT
         * =========================
         */

        ArrayList<Reviews> headphoneReviews = new ArrayList<>();

        headphoneReviews.add(
                new Reviews(
                        5,
                        "Amazing sound quality",
                        LocalDate.of(2026, 3, 12),
                        "Arjun",
                        "arjun@gmail.com"));

        headphoneReviews.add(
                new Reviews(
                        4,
                        "Noise cancellation is good",
                        LocalDate.of(2026, 4, 22),
                        "Sneha",
                        "sneha@gmail.com"));

        ArrayList<String> headphoneTags = new ArrayList<>();

        headphoneTags.add("Wireless");
        headphoneTags.add("Bass");
        headphoneTags.add("Noise Cancellation");

        ArrayList<String> headphoneImages = new ArrayList<>();

        headphoneImages.add("https://images.unsplash.com/photo-1505740420928-5e560c06d30e");
        headphoneImages.add("https://images.unsplash.com/photo-1484704849700-f032a568e944");

        Product headphone = new Product(
                5,
                "Sony WH-1000XM5",
                "Wireless premium headphones",
                "Headphone",
                25000,
                18,
                4.8,
                12,
                headphoneTags,
                "Sony",
                headphoneImages,
                headphoneReviews);



        /*
         * =========================
         * TABLET PRODUCT
         * =========================
         */

        ArrayList<Reviews> tabletReviews = new ArrayList<>();

        tabletReviews.add(
                new Reviews(
                        5,
                        "Perfect for study",
                        LocalDate.of(2026, 7, 5),
                        "Ankit",
                        "ankit@gmail.com"));

        tabletReviews.add(
                new Reviews(
                        4,
                        "Display quality is nice",
                        LocalDate.of(2026, 7, 18),
                        "Pooja",
                        "pooja@gmail.com"));

        ArrayList<String> tabletTags = new ArrayList<>();

        tabletTags.add("Stylus");
        tabletTags.add("Large Display");
        tabletTags.add("Android");

        ArrayList<String> tabletImages = new ArrayList<>();

        tabletImages.add("https://images.unsplash.com/photo-1544244015-0df4b3ffc6b0");
        tabletImages.add("https://images.unsplash.com/photo-1585790050230-5dd28404ccb9");

        Product tablet = new Product(
                6,
                "Samsung Tab S9",
                "High performance tablet",
                "Tablet",
                55000,
                10,
                4.6,
                6,
                tabletTags,
                "Samsung",
                tabletImages,
                tabletReviews);
        
        /*
         * =========================
         * CAMERA PRODUCT
         * =========================
         */

        ArrayList<Reviews> cameraReviews = new ArrayList<>();

        cameraReviews.add(
                new Reviews(
                        5,
                        "Picture quality is amazing",
                        LocalDate.of(2026, 5, 15),
                        "Ramesh",
                        "ramesh@gmail.com"));

        cameraReviews.add(
                new Reviews(
                        4,
                        "Good for travel photography",
                        LocalDate.of(2026, 5, 18),
                        "Aditi",
                        "aditi@gmail.com"));

        ArrayList<String> cameraTags = new ArrayList<>();

        cameraTags.add("DSLR");
        cameraTags.add("4K");
        cameraTags.add("Photography");

        ArrayList<String> cameraImages = new ArrayList<>();

        cameraImages.add("https://images.unsplash.com/photo-1516035069371-29a1b244cc32");
        cameraImages.add("https://images.unsplash.com/photo-1502920917128-1aa500764ce7");

        Product camera = new Product(
                7,
                "Canon EOS 1500D",
                "Professional DSLR camera",
                "Camera",
                45000,
                7,
                4.5,
                10,
                cameraTags,
                "Canon",
                cameraImages,
                cameraReviews);



        /*
         * =========================
         * TV PRODUCT
         * =========================
         */

        ArrayList<Reviews> tvReviews = new ArrayList<>();

        tvReviews.add(
                new Reviews(
                        5,
                        "Display is crystal clear",
                        LocalDate.of(2026, 2, 10),
                        "Manish",
                        "manish@gmail.com"));

        tvReviews.add(
                new Reviews(
                        4,
                        "Sound quality is good",
                        LocalDate.of(2026, 3, 12),
                        "Priya",
                        "priya@gmail.com"));

        ArrayList<String> tvTags = new ArrayList<>();

        tvTags.add("Smart TV");
        tvTags.add("4K");
        tvTags.add("LED");

        ArrayList<String> tvImages = new ArrayList<>();

        tvImages.add("https://images.unsplash.com/photo-1593784991095-a205069470b6");
        tvImages.add("https://images.unsplash.com/photo-1461151304267-38535e780c79");

        Product tv = new Product(
                8,
                "LG Smart TV",
                "55 inch Ultra HD Smart TV",
                "Television",
                70000,
                5,
                4.6,
                18,
                tvTags,
                "LG",
                tvImages,
                tvReviews);



        /*
         * =========================
         * BAG PRODUCT
         * =========================
         */

        ArrayList<Reviews> bagReviews = new ArrayList<>();

        bagReviews.add(
                new Reviews(
                        4,
                        "Very spacious",
                        LocalDate.of(2026, 1, 15),
                        "Rohit",
                        "rohit@gmail.com"));

        bagReviews.add(
                new Reviews(
                        5,
                        "Best for college",
                        LocalDate.of(2026, 2, 20),
                        "Snehal",
                        "snehal@gmail.com"));

        ArrayList<String> bagTags = new ArrayList<>();

        bagTags.add("Travel");
        bagTags.add("Laptop Bag");
        bagTags.add("Waterproof");

        ArrayList<String> bagImages = new ArrayList<>();

        bagImages.add("https://images.unsplash.com/photo-1542291026-7eec264c27ff");
        bagImages.add("https://images.unsplash.com/photo-1512436991641-6745cdb1723f");

        Product bag = new Product(
                9,
                "Wildcraft Backpack",
                "Durable laptop backpack",
                "Bag",
                2500,
                20,
                4.2,
                25,
                bagTags,
                "Wildcraft",
                bagImages,
                bagReviews);



        /*
         * =========================
         * KEYBOARD PRODUCT
         * =========================
         */

        ArrayList<Reviews> keyboardReviews = new ArrayList<>();

        keyboardReviews.add(
                new Reviews(
                        5,
                        "Mechanical keys feel great",
                        LocalDate.of(2026, 4, 11),
                        "Sahil",
                        "sahil@gmail.com"));

        keyboardReviews.add(
                new Reviews(
                        4,
                        "RGB lights are awesome",
                        LocalDate.of(2026, 4, 18),
                        "Kunal",
                        "kunal@gmail.com"));

        ArrayList<String> keyboardTags = new ArrayList<>();

        keyboardTags.add("Mechanical");
        keyboardTags.add("RGB");
        keyboardTags.add("Gaming");

        ArrayList<String> keyboardImages = new ArrayList<>();

        keyboardImages.add("https://images.unsplash.com/photo-1511467687858-23d96c32e4ae");
        keyboardImages.add("https://images.unsplash.com/photo-1515879218367-8466d910aaa4");

        Product keyboard = new Product(
                10,
                "Redragon K552",
                "Mechanical gaming keyboard",
                "Keyboard",
                3500,
                30,
                4.7,
                14,
                keyboardTags,
                "Redragon",
                keyboardImages,
                keyboardReviews);



        /*
         * =========================
         * MOUSE PRODUCT
         * =========================
         */

        ArrayList<Reviews> mouseReviews = new ArrayList<>();

        mouseReviews.add(
                new Reviews(
                        5,
                        "Very smooth movement",
                        LocalDate.of(2026, 5, 2),
                        "Abhishek",
                        "abhishek@gmail.com"));

        mouseReviews.add(
                new Reviews(
                        4,
                        "Good grip",
                        LocalDate.of(2026, 5, 6),
                        "Nikita",
                        "nikita@gmail.com"));

        ArrayList<String> mouseTags = new ArrayList<>();

        mouseTags.add("Wireless");
        mouseTags.add("Gaming");
        mouseTags.add("RGB");

        ArrayList<String> mouseImages = new ArrayList<>();

        mouseImages.add("https://images.unsplash.com/photo-1527814050087-3793815479db");
        mouseImages.add("https://images.unsplash.com/photo-1587829741301-dc798b83add3");

        Product mouse = new Product(
                11,
                "Logitech G102",
                "Gaming optical mouse",
                "Mouse",
                1800,
                25,
                4.5,
                9,
                mouseTags,
                "Logitech",
                mouseImages,
                mouseReviews);



        /*
         * =========================
         * SPEAKER PRODUCT
         * =========================
         */

        ArrayList<Reviews> speakerReviews = new ArrayList<>();

        speakerReviews.add(
                new Reviews(
                        5,
                        "Bass is excellent",
                        LocalDate.of(2026, 3, 5),
                        "Tushar",
                        "tushar@gmail.com"));

        speakerReviews.add(
                new Reviews(
                        4,
                        "Portable and loud",
                        LocalDate.of(2026, 3, 8),
                        "Megha",
                        "megha@gmail.com"));

        ArrayList<String> speakerTags = new ArrayList<>();

        speakerTags.add("Bluetooth");
        speakerTags.add("Portable");
        speakerTags.add("Bass");

        ArrayList<String> speakerImages = new ArrayList<>();

        speakerImages.add("https://images.unsplash.com/photo-1511379938547-c1f69419868d");
        speakerImages.add("https://images.unsplash.com/photo-1545454675-3531b543be5d");

        Product speaker = new Product(
                12,
                "JBL Flip 6",
                "Portable Bluetooth speaker",
                "Speaker",
                9000,
                14,
                4.6,
                13,
                speakerTags,
                "JBL",
                speakerImages,
                speakerReviews);



        productArray.add(camera);
        productArray.add(tv);
        productArray.add(bag);
        productArray.add(keyboard);
        productArray.add(mouse);
        productArray.add(speaker);
        productArray.add(mobile);
        productArray.add(laptop);
        productArray.add(shoes);
        productArray.add(watch);
        productArray.add(headphone);
        productArray.add(tablet);

	}

	@Override
	public ArrayList<Product> getAllProducts() {
		
		return productArray;
	}

	@Override
	public Product getProductById(int pid) {

		for(Product product : productArray) {
			if(product.getProductId() == pid)
				return product;
		}
		
		return null;
	}

	@Override
	public ArrayList<Product> getProductByName(String pname) {
		
		ArrayList<Product> filteredProducts = new ArrayList<Product>();
		
		for(Product product : productArray) {
			if(product.getpName().toLowerCase().contains(pname.toLowerCase()))
				filteredProducts.add(product);
		}
		
		return filteredProducts;
	}

	@Override
	public boolean updateProduct(Product product) {
		
		for(int i=0; i<productArray.size(); i++) {
			if(productArray.get(i).getProductId() == product.getProductId()) {
				productArray.set(i, product);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean deleteProduct(int productId) {
		
		for(int i=0; i<productArray.size(); i++) {
			if(productArray.get(i).getProductId() == productId) {
				productArray.remove(i);
				return true;
			}
		}
		
		return false;
	}

}
