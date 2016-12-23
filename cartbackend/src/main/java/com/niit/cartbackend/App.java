package com.niit.cartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.cartbackend.config.AppContextConfig;
import com.niit.cartbackend.dao.ProductDAO;
import com.niit.cartbackend.dao.UserDAO;
import com.niit.cartbackend.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppContextConfig.class);
        
        UserDAO userDAO=(UserDAO)context.getBean("userDAO");
        ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
        
        //register new user
        
      /*  User user=new User();
        user.setName("John");
        user.setUsername("john");
        user.setPassword("password@123");
        user.setMobile("9830098300");
        
        userDAO.addUser(user);*/
        
        
        //add a product
        
        Product product=new Product();
        product.setProductName("bat");
        product.setBrand("ss");
        product.setPrice(85000);
        product.setCategory("Cricket");
        product.setDesc("Semi Pro camera");
        
        productDAO.addProduct(product);
        
        
        
        
}
}
