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
public class MatchesToPrint {
    public String productName;
    public String listings;
    
    public MatchesToPrint(){
    productName = "";
    listings = "";
    }
    
    public MatchesToPrint(String t, String l){
    productName = t;
    listings = l;
    }
    
    public void setProductName(String t){
        productName = t;
    }
    public void setListing(String l){
        listings = l;
    }
    
    public String getProductName(){
        return productName;
    }
    
    public String getListing(){
    return listings;
    }
    
    public String getPairs(){
        return productName + listings;
    }
}



