package com.pankaj;

public class LongestPalindroneFinder {
public static void main(String[] args) {



	        
	        String pal = findLongestPalindrome("bananas");
	        System.out.println("" + pal);
	        
	        pal = findLongestPalindrome("forgeeksskeegfor");
	        System.out.println("" + pal);

	    }

private static String findLongestPalindrome(String string) {
	// TODO Auto-generated method stub
	 if(string.isEmpty()) {
		 return "please enter non empty string";
	 }
	 if(string.length()==1)
		 {
		 	return string;
		 }
	 String longest = string.substring(0,1);
	 for (int i = 0; i < string.length(); i++) {
	       
         // get longest palindrome for odd length (center is i)
		 String temp=checkForEquality(string, i,i);

      if(temp.length() >longest.length()) {
    	  longest=temp;
      }
      
      // get longest palindrome for even length (center is i)
		  temp=checkForEquality(string, i,i+1);

      if(temp.length() >longest.length()) {
    	  longest=temp;
      }
	}
	return longest;
}

private static String checkForEquality(String string, int begin, int end) {
	// TODO Auto-generated method stub
	while (begin>= 0 && end <= string.length() - 1 && 	 string.charAt(begin)== string.charAt(end)) {
		begin--;
		end++;
	}
	return string.substring(begin+1,end);
}
}

