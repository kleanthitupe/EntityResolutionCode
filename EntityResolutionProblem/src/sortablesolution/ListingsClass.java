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
class ListingsClass {
    public String title;
    public String wholeJSON;
    
    public ListingsClass()
    {
        title = "";
        wholeJSON = "";
    }
    
    public ListingsClass(String line){
        wholeJSON = line;
    }
    
    public String getTitle(){
       return wholeJSON;
    }
    
    public void setTitle(String line){
        wholeJSON = line;
    }    
}
