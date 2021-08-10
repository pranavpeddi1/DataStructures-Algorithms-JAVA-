//patterns



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       int n = scn.nextInt();
       int st = 1;
       int sp = n/2;
       for(int i = 0;i<n;i++){
           for(int j=0 ;j<sp;j++){
               System.out.print("\t");
           }
           for(int k =0;k<st;k++){
               System.out.print("*\t");
           }
           System.out.println();
           if(i<n/2){       // i<n/2 beacause st , sp are initialised at i=0 st,sp are changed 
               st = st+2;
               sp--;
           }else{
               st =st-2;
               sp++;
           }
       }
      

    }
}


---------------------------------------------------------------------

Pattern 9
Easy  Prev   Next
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
Input Format
A number n


import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1 ; j <= n; j++) {

        if (i == j || i + j == n+1) {
          System.out.print("*\t");

        } else {
          System.out.print("\t");
        }
      }
      System.out.println();
    }
  }
}


-----------------------------------------------------------------------------------------------------------------

Pattern 10
Easy  Prev   Next
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
Input Format
A number n



import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int os = n / 2;
    int is = -1;

    for (int i = 1; i <= n; i++) {
      if (i > 1 && i < n) {
        for (int k = 0; k < os; k++) {
          System.out.print("\t");
        }
        System.out.print("*\t");
        for (int k = 0; k < is; k++) {
          System.out.print("\t");
        }
        System.out.print("*\t");
      }
      else {
        for (int k = 0; k < os; k++) {
          System.out.print("\t");
        }
        System.out.print("*");
      }
      System.out.println();
      if (i <= n / 2) {
        os--;
        is = is + 2;
      } else {
        os++;
        is = is - 2;
      }
    }
  }
}

--------------------------------------------------------------------------------------------------------

Pattern 12
Easy  Prev   Next
1. You are given a number n.
2. You've to create a pattern as shown in output format.
Input Format
A number n

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int a =0 ;
    int b =1;
    int c = 0;
  
    for (int i = 1; i <= n; i++) {
      for (int j = 1 ; j <= n; j++) {
          if(j<=i){
              System.out.print(a+"\t");
              c = a+b;
              a = b;
              b = c;
              
          }
        
      }
      System.out.println();
    }

  }
}

----------------------------------------------------------------------------------------------
Pattern 13

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for (int i = 0; i < n; i++) {
      int icj = 1;
      for (int j = 0; j <= i ; j++) {
        System.out.print(icj + "\t");
        int  icjp1 = icj * (i - j) / (j + 1);
        icj = icjp1;
      }
      System.out.println();
    }
  }

}

--------------------------------------------------------------------------

Pattern 15

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int st = 1;
    int sp = n/2;
    int  k = 1;
    for (int i = 1; i <= n; i++) {
      int val = k;
      for (int j = 1 ; j <= sp; j++) {
           System.out.print("\t");
      }
      for (int j = 1 ; j <= st; j++) {
          
          System.out.print(val+"\t");
          if(j<=st/2){
              val++;
          }else{
              val--;
          }
          
           
      }
      System.out.println();
      
      if(i<=n/2){
          sp--;
          st =st+2;
          k++;
      }else{
          sp++;
          st = st-2;
          k--;
      }
    }
  }
}

--------------------------------------------------------------------------


                        


                        
                        



