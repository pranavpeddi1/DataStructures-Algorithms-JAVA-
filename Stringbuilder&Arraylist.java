//String Compression


import java.io.*;
import java.util.*;

public class Main {

  public static String compression1(String str) {
    int idx = 1;
    String res  = str.charAt(0) + "";
    while (idx < str.length()) {
      char curr = str.charAt(idx);
      char prev = str.charAt(idx - 1);
      if (curr != prev) {
        res += curr;
      }
      idx++;

    }

    return res;
  }

  public static String compression2(String str) {

    int counter = 1;
    String res  = str.charAt(0) + "";
    for (int idx = 1; idx < str.length(); idx++) {
      char curr = str.charAt(idx);
      char prev = str.charAt(idx - 1);

      if (curr == prev) {
        counter++;
      } else {
        if (counter > 1) {
          res += counter;
          counter = 1;
        }
        res += curr;
      }

    }
    if (counter > 1) {
      res += counter;
    }


    return res;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(compression1(str));
    System.out.println(compression2(str));
  }

}
----------------------------------------------------------------------------
Print All Palindromic Substrings
Easy  Prev   Next
1. You are given a string. 
2. You have to print all palindromic substrings of the given string.
Input Format
A String
Output Format
All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.
Question Video

  COMMENTConstraints
1 <= length of string <= 500
Sample Input
abcc
Sample Output
a
b
c
cc
c

import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		for(int i = 0 ;i<str.length();i++){
		    for(int j = i+1;j<=str.length();j++){
		        
		        String ss = str.substring(i,j);
		        if(Ispalindromic(ss)){
		            System.out.println(ss);
		        }
		    }
		}
		
	}
	public static boolean Ispalindromic(String str){
	    
	    int lo = 0;
	    int hi = str.length()-1;
	    while(lo<hi){
	        if(str.charAt(lo) != str.charAt(hi)){
	            return false;
	        }
	        lo++;
	        hi--;
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}


--------------------------------------------------------------------------------------------
Toggle Case
Easy  Prev   Next
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.
Input Format
A String
Output Format
A String
Question Video

  COMMENTConstraints
1 <= length of string <= 1000
Sample Input
pepCODinG

import java.io.*;
import java.util.*;

public class Main {

  public static String toggleCase(String str) {
    String res = "";
    for (int idx = 0; idx < str.length(); idx++) {
      if (str.charAt(idx) >= 'a' && str.charAt(idx) <= 'z') {
        res += (char)(str.charAt(idx) - 'a' + 'A');
      } else {
        res += (char)(str.charAt(idx) + 'a' - 'A');
      }
    }

    return res;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(toggleCase(str));
  }

}
-----------------------------------








