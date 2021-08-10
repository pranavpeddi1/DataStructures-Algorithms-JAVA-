//Getting Started

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      
      for(int i = 0; i < t; i++){
          int n = scn.nextInt();
          
          int div = 2;
          while(div * div <= n){
              if(n % div == 0){
                  break;
              }              div++;
          }
          
          if(div * div > n){
              System.out.println("prime");
          } else {
              System.out.println("not prime");
          }
      }
  
   }
  }

-------------------------------------------------------------------

Print Fibonacci Numbers Till N

1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int a = 0;
     int b= 1;
     
     for(int i = 0;i<n;i++){
         int c= a+b;
         System.out.println(a);
         a = b;
         b= c;
     }
   }
  }


--------------------------------------------------------------

Count Digits In A Number
Easy  Prev   Next
1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int count = 0;
    while(n>0){
        n = n/10;
        count++;
    }
    System.out.println(count);
   }
  }
------------------------------------------------------
Digits Of A Number
Easy  Prev   Next
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.



import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int temp =n;
       int count = 0;
       while(temp > 10){
           temp = temp/10;
           count++;
       }
       temp = n;
       while(count>=0){
           System.out.println(temp/(int)Math.pow(10,count));
           temp =temp%(int)Math.pow(10,count);
           count--;
       }
     
     }
    }

--------------------------------------------------------------------------------
Reverse A Number
Easy  Prev   Next
1. You've to display the digits of a number in reverse.
2. Take as input "n", the number for which digits have to be display in reverse.
3. Print the digits of the number line-wise, but in reverse order.



import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     while(n>0){
        System.out.println(n%10);
        n = n/10;
        
     }
   
     
    }
   }

--------------------------------------------------------------------------

Inverse Of A Number

1. You are given a number following certain constraints.
2. The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5 digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273 etc.Here are a few invalid numbers - 139, 7421357 etc.
3. The inverse of a number is defined as the number created by interchanging the face value and index of digits of number.e.g. for 426135 (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 and 4 is in place 6), the inverse will be 416253 (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4, 1 is in place 5 and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153 is 24153    
4. Take as input number "n", assume that the number will follow constraints.
5. Print it's inverse.
Input Format
"n" where n is any integer, following constraints defined above.
Output Format
"i", the inverted number

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int p = 1;
    int sum = 0;

    while (n > 0) {
      int d = n % 10;
      n = n / 10;
      sum += p * Math.pow(10, d - 1);
      p++;
    }

    System.out.println(sum);

  }
}


---------------------------------------------------------------------

Gcd And Lcm
Easy  Prev   Next
1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.

import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
      int n1 = scn.nextInt();
       int n2 = scn.nextInt();
       int temp1 = n1;
       int temp2 = n2;
       while(n2>0){
           int temp = n2;
           n2 = n1%n2;
           n1 = temp;
       }
       int GCD = n1;
       int LCM = temp1*temp2/n1;
       System.out.println(GCD);
       System.out.println(LCM);
     }
    }

-----------------------------------------------------------------------------

Prime Factorisation Of A Number
Easy  Prev   Next
1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.
                               


import java.util.*;

public class Main{

public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
   for(int div = 2 ; div*div<=n;div++){
       while(n%div == 0){
           System.out.print(div+" ");
           n = n/div;
       }
   }
   if(n != 1){
       System.out.print(n);
   }
 }
}




----------------------------------------------------------------------

Pythagorean Triplet
Easy  Prev   Next
1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise.
Input Format
a, an integer
b, an integer
c, an integer
Output Format
true if the numbers form a pythagorean triplet and false otherwise

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
          int a = scn.nextInt();
          int b = scn.nextInt();
          int c = scn.nextInt();
          
    
        if(a*a == b*b+c*c){
            System.out.print("true");
        }else if(b*b == b*b+c*c){
            System.out.print("true");
        }else if(c*c == a*a+b*b){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
   }
  }

-----------------------------------------------------------------------


The Curious Case Of Benjamin Bulbs
Easy  Prev   Next
1. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
2. Take as input a number n, representing the number of bulbs.
3. Print all the bulbs that will be on after the nth fluctuation in voltage.
Input Format
n, an integer
Output Format
b1 b2 b3 b4 .. all bulbs that will be on after nth wave


import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn  = new Scanner(System.in);
    int n =scn.nextInt();
    
    for(int i=1;i*i <n;i++){
        System.out.println(i*i);
    }
   }
  }
----------------------------------------------------------

Rotate A Number
Easy  Prev   Next
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
Input Format
"n" where n is any integer.
"K" where k is any integer.
Output Format
"r", the rotated number


import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn =  new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     int temp = n;
     int d = 0;
    while(temp>0){
        temp = temp/10;
        d++;
    }
     k = k%d;
     
     if(k<0){
         k=k+d;
     }
     
     int ans = n % (int) Math.pow(10,k)*(int)Math.pow(10,d-k)+ n/(int)Math.pow(10,k) ;
     System.out.println(ans);
     
    }
   }



-----------------------------------------------------------------------------------------------------


























