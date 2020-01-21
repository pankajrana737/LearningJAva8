import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestCalcNode {
public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	System.out.println("enter your input");
	String inputString= //"879432156";
	sc.next();
	System.out.println("enter your test integer");

	String s=sc.next();
	Map<Character,String> map= new LinkedHashMap<>();
	
		int len= inputString.length();
		int insert=0;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			if(insert<=len)
			 map.put(inputString.charAt(insert), i+","+j);
			insert++;
		}
	}
		
		
		  int count=0; 
		  char temp= s.charAt(0);
		  
		
		  for (int i=1;i<s.length();i++) { String str= map.get(temp); String str1=
		  map.get(s.charAt(i)); String[] split1 = str.split(","); String[] split2 =
		  str1.split(","); int diff1 = Math.abs( Integer.parseInt(split1[0])-
		  Integer.parseInt(split2[0]) ); int diff2 = Math.abs(
		  Integer.parseInt(split1[1])- Integer.parseInt(split2[1]) );
		  
		  count += Math.max(diff1, diff2); temp=s.charAt(i); }
		 
	
		
	
	System.out.println( 
			map);
		
		 System.out.println( count );
		 
}
}
