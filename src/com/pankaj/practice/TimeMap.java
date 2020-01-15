package com.pankaj.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/**
 * 
 * @author panrana1
 * Question Stock vendor store based on name price  and time stamp
 * how u will get stock price based on time stamp
 */
public class TimeMap {
 private Map<String,TreeMap<Integer,Integer>>M;
 public TimeMap() {
	M= new HashMap<String, TreeMap<Integer,Integer>>();
}
 //  to store stock name price , timestamp
  public void set(String key,int price, int timestamp) {
	   if(!M.containsKey(key)) {
		   M.put(key, new TreeMap<Integer, Integer>());
	
	   }
	   
	   M.get(key).put(timestamp, price);

	    }
  
  //  to get value
  
  
  public int get(String key, int timestamp) {
       if (!M.containsKey(key)) return 0;

       TreeMap<Integer, Integer> tree = M.get(key);
       Integer t = tree.floorKey(timestamp);
       return t != 0 ? tree.get(t) : 0;
   }
  
  
  
  @Override
public String toString() {
	return "TimeMap [M=" + M + "]";
}
public static void main(String[] args) {
	 
	  TimeMap Tmap= new TimeMap();
	  Tmap.set("google", 100, 1000);
	  Tmap.set("google", 200, 1500);
	  Tmap.set("google", 250, 2000);
	  Tmap.set("google", 300, 2200);
	  System.out.println(Tmap);
	  
	  System.out.println("price at 1800 sec --> "+ Tmap.get("google",1800 )); 
	  
	  System.out.println("price at 2000 sec "+ Tmap.get("google",2000 )); 
	  
	  System.out.println("price at 2500 sec"+ Tmap.get("google",2500 )); 
	  
	  
	  
	  
}
}
 