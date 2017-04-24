package com.pricerus.api.products;

import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pricerus.api.users.Users;




@RestController
public class ProductsController {
	
	@Autowired
	private ProductsService productsService;
	
	@RequestMapping("/users/{userId}/product")
	public List<Products> getAllProducts(@PathVariable Integer userId){
		return productsService.getAllProducts(userId);
	}
	@RequestMapping("/products")
	public List<Products> getAllCourses(){
		return productsService.getAllProducts();
	}

//	@RequestMapping("/topics/{topicId}/courses/{id}")
//	public Course getCourse(@PathVariable String id){
//		return productsService.getCourse(id);
//	}

	@RequestMapping(method=RequestMethod.POST, value="/users/{userId}/product")
	public void addProduct(@RequestBody Products product,@PathVariable Integer userId){
		Users user = new Users();
		user.setId(userId);
		product.setUser(user);
		productsService.addProduct(product);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/users/{userId}/product/{productId}")
	public void updateCourse(@RequestBody Products product,@PathVariable Integer userId){
		Users user = new Users();
		product.setUser(user);
		productsService.updateProduct(product);
	}
	
	//VER POSIBILIDAD DE QUE LA RUTA SEA (/userid/product/id
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{userId}/product/{productId}")
	public void deleteProduct(@PathVariable Integer productId){
		productsService.deleteProduct(productId);
	}

}
