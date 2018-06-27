package com.collections.test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		
		String s= "aabbccdefatafaz";
		char[] chars= s.toCharArray();
		Set <Character> charset= new LinkedHashSet<Character>();
		for(char c : chars ) {
			charset.add(c);
		}
		StringBuilder sb= new StringBuilder();
		for(char character: charset) {
			sb.append(character);
			
		}
		System.out.println(sb.toString());
		

	}

}


/*String string = "aabbccdefatafaz"; 

char[] chars = string.toCharArray(); 
Set<Character> charSet = new LinkedHashSet<Character>(); 
for (char c : chars) { 
charSet.add(c); 
} 

StringBuilder sb = new StringBuilder(); 
for (Character character : charSet) { 
sb.append(character); 
} 
System.out.println(sb.toString());*/
