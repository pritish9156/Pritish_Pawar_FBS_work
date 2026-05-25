package productservlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import daoimplementation.ArrayListDAOImplementation;
import daointerface.ProductDAOInterface;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import model.Product;

@MultipartConfig
public class ProductServlet extends HttpServlet{
	
	void Cors(HttpServletResponse resp) {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
		resp.setHeader("Access-Control-Max-Age","86400");
		resp.setContentType("application/json");
	}
	
	ProductDAOInterface productDAO = new ArrayListDAOImplementation();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cors(resp);
			
		String pathInfo = req.getPathInfo();
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
		
		PrintWriter pw = resp.getWriter();
		
		if(pathInfo == null || pathInfo.equals("/")) {
			ArrayList<Product> products = productDAO.getAllProducts();
			String JsonProducts = objectMapper.writeValueAsString(products);
			pw.write(JsonProducts);
		}
		else {
			
			String value = pathInfo.substring(1);
			
			if(value.matches("\\d+")) {
				int id = Integer.parseInt(value);

				ArrayList<Product> matchedProducts = new ArrayList<Product>();
	            Product foundProduct = productDAO.getProductById(id);
	            matchedProducts.add(foundProduct);
	            
	            pw.write(objectMapper.writeValueAsString(matchedProducts));
			}
			else {
				ArrayList<Product> matchedProducts = productDAO.getProductByName(value);
				pw.write(objectMapper.writeValueAsString(matchedProducts));
			}
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cors(resp);
		
		
		System.out.println();
		for(Part p:req.getParts())
		{
			System.out.println(p.getName());
			InputStream res = p.getInputStream();
			byte[] ress = res.readAllBytes();
			for(byte b:ress)
				System.out.print((char)b);
		}
		
		System.out.println();
		
//		Part image = req.getPart("image");
//		InputStream inputStream =
//		        image.getInputStream();

//		byte[] imageBytes =
//		        inputStream.readAllBytes();

		
		
		
	}
	
	@Override
	protected void doOptions(HttpServletRequest req,
	                         HttpServletResponse resp)
	                         throws ServletException, IOException {

	    Cors(resp);

	    resp.setStatus(HttpServletResponse.SC_OK);

	}
	
	@Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cors(resp);

        String pathInfo = req.getPathInfo();

        String[] pathParts = pathInfo.split("/");

        int productId = Integer.parseInt(pathParts[1]);


        BufferedReader reader = req.getReader();

        StringBuilder jsonBuilder = new StringBuilder();

        String line;

        while((line = reader.readLine()) != null){

            jsonBuilder.append(line);

        }

        String json = jsonBuilder.toString();


        ObjectMapper mapper = new ObjectMapper();
        
        mapper.registerModule(new JavaTimeModule());

        Product product =
                mapper.readValue(json, Product.class);


        product.setProductId(productId);


        boolean status = productDAO.updateProduct(product);
        

        PrintWriter out = resp.getWriter();


        if(status){

            out.print("{\"message\":\"Product Updated\"}");

        }
        else{

        	resp.setStatus(500);

            out.print("{\"message\":\"Update Failed\"}");

        }

    }
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	    Cors(resp);

	    String pathInfo = req.getPathInfo();

	    String[] pathParts = pathInfo.split("/");

	    int productId = Integer.parseInt(pathParts[1]);

	    boolean status = productDAO.deleteProduct(productId);

	    PrintWriter out = resp.getWriter();

	    if(status){
	        out.print("{\"message\":\"Deleted\"}");
	    }
	    else{
	        resp.setStatus(500);
	        out.print("{\"message\":\"Delete Failed\"}");
	    }
	}
}
