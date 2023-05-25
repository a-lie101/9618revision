package sorts;
import java.io.*;
import java.util.*;

public class csmtestHashmap {
    
      HashMap<String, String> products = new HashMap<>();
      HashMap<String, Integer> inventory = new HashMap<>();
        
   public csmtestHashmap() {

	   
    }//end constructor
   public static void main(String args[]) {
	   csmtestHashmap m = new csmtestHashmap();
	   m.populateHashMaps();
	   m.checkID("12345");
   }
    
    //populate the two global dictionaries (hash maps) by reading in the relevant files
    public void populateHashMaps(){
        try {
            FileReader f = new FileReader("Products.txt");
            BufferedReader reader = new BufferedReader(f);
            FileReader x = new FileReader("Inventory.txt");
            BufferedReader readerr = new BufferedReader(x);
            
            String idProducts;
            String nameProducts;
            String idInventory;
            int stockInventory;
            
            while (reader.ready()) {
                idProducts = reader.readLine();
                nameProducts = reader.readLine();
                idInventory = readerr.readLine();
                stockInventory = Integer.parseInt(readerr.readLine());
                
                products.put(idProducts, nameProducts);
                inventory.put(idInventory, stockInventory);
            }
            
            
        } catch (IOException e) {
            System.err.println("not found");
            System.exit(-1);
        }
        System.out.println(inventory);
        
    }
    
    //identify the amount in stock and the description by accessing the two dictionaries
    public void checkID(String id){
    	
        String productName = products.get(id);
        Integer stock = inventory.get(id);
       
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + productName);
        System.out.println("Units in Stock: " + stock);
       
    }
}
