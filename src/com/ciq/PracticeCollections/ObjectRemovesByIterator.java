package com.ciq.PracticeCollections;
import java.util.*;
public class ObjectRemovesByIterator {

	public static void main(String[] args) {

//		=--------------------------------------------------------ERROR CODE---------------------------------
		List markets = new ArrayList<>();
		
	
		StockExchange TSE = new StockExchange(){
	         
            
            public boolean isClosed() {
                return true;
            }         
       };
     
       StockExchange HKSE = new StockExchange(){

           
            public boolean isClosed() {
                return true;
            }         
       };
      
       StockExchange NYSE = new StockExchange(){

            @Override
            public boolean isClosed() {
                return false;
            }         
       };
		
       markets.add(TSE);
       markets.add(HKSE);
       markets.add(NYSE);
       
		Iterator dup = markets.iterator();
		while(dup.hasNext()) {
			Object exchange = dup.next();
			if(((StockExchange) exchange).isClosed()) {
				markets.remove(exchange);
			}
		}
		
		
	}

}
