/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortablesolution;

/**
 *
 * @author user1
 */
class ProductsClass {
    public String product_name;
    
    public ProductsClass(){
        product_name = "";
    }
    
    public ProductsClass(String p){
        product_name = p;
    }
    
    public String getProductName(){
       return product_name;
    }
        
    public void setProductName(String p){
        product_name = p;
    }
}
