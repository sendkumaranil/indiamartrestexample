package com.indiamart.rest.example.resource;

import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.anil.indiamart.resource.Product;
import com.anil.indiamart.resource.ProductCatelogImpl;
import com.anil.indiamart.resource.ProductCatelogImplService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/products-category")
public class IndiaMartResource {

   
    @GET    
    @Path("/products")
    @Produces(MediaType.TEXT_PLAIN)
    public String getProducts() {
    	StringBuilder appender=new StringBuilder();
    	
    	ProductCatelogImplService prodservice=new ProductCatelogImplService();
		ProductCatelogImpl indiamrt_stub= prodservice.getProductCatelogImplPort();
		List<String> products=indiamrt_stub.getProductDetails();
		for(String product:products){
			appender.append(product+",");
		}		
        return appender.toString();
    }
    
    @GET    
    @Path("/product")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProduct() {
    	
    	ProductCatelogImplService prodservice=new ProductCatelogImplService();
		ProductCatelogImpl indiamrt_stub= prodservice.getProductCatelogImplPort();
		Product item=indiamrt_stub.getProduct();
		
		com.indiamart.rest.example.model.Product prod=new com.indiamart.rest.example.model.Product();
		
		prod.setProductname(item.getProductname());
		prod.setPrice(item.getPrice());
		prod.setMfgdate(item.getMfgdate());
		prod.setExpdate(item.getExpdate());
		
		
        return Response.ok(prod).build();
    }
}
