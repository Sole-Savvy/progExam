/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author Student
 */

public class SalesReport {

    public static void main(String[] args) {
       
        
        String[] company = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket" } ;
        int[][] sales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20} } ;
        int[] month = {1, 2, 3} ;
        int sum = 0 ;
        
        for (int i=0 ; i<sales.length ; i++) {
          System.out.println("Enter number of sales for month " + month[i] +  " for " + company[0] + ": " + sales[0][i] );
        }
        System.out.println("");
      for (int i=0 ; i<sales.length ; i++) {
          System.out.println("Enter number of sales for month " + month[i] +  " for " + company[1] + ": " + sales[1][i] );   
      }
      System.out.println("");
      for (int i=0 ; i<sales.length ; i++) {
          System.out.println("Enter number of sales for month " + month[i] +  " for " + company[2] + ": " + sales[2][i] );   
      } 
      //Calculating sum of sales
      for (int i = 0; i<sales.length ; i++ ){
        sum += sales[0][i] + sales[1][i] + sales[2][i] ;
          
      }
     System.out.println("TOTAL PRODUCT SALES: " + sum); 
   
    }
    public class Product{
        public interface IProduct{
        
            int GetTotalProductSold() ;
            double GetAverageProductSold() ;
            String getMostPopularproduct() ;
            
            
        }
    }
    
    public class PrintProduct{
  
    
     //System.out.println("PRODUCT SALES REPORT - 2026");
      //System.out.println("");
      //System.out.println("***************************************");   
    //System.out.println("TOTAL PRODUCT SALES: " + );
      //System.out.println("AVERAGE PRODUCT SALES: " + );
      //System.out.println("MOST POPULAR PRODUCT: " );    
    }
      
    
}  