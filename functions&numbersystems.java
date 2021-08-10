//Rotate An Array

import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a, int li, int ri){
    while(li < ri){
      int temp = a[li];
      a[li]= a[ri];
      a[ri] = temp;
      
      li++;
      ri--;
    }
  }

  public static void rotate(int[] a, int k){
    k = k % a.length;
    if(k < 0){
      k += a.length;
    }

    reverse(a, 0, a.length - k - 1);
    reverse(a, a.length - k, a.length - 1);
    reverse(a, 0, a.length - 1);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}

-------------------------------------------------------------------------------------------

Bar Chart
Easy  Prev   Next
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
A bar chart of asteriks representing value of array a
Question Video

  COMMENTConstraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 10
Sample Input
5
3
1
0
7
5
Sample Output
			*		
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*	


import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[]  = new int[n];
    for(int i = 0;i<n;i++){
        a[i] = scn.nextInt();
    }
    
    int max = Integer.MIN_VALUE;
    
    for(int i = 0;i<n;i++){
        if(a[i]>max){
            max = a[i];
        }
    }
    
    for(int c=max ; c>=1;c-- ){
        for(int i = 0;i<n;i++){
            if(a[i]>=c){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }

}
--------------------------------------------------------------------------------




                        
                        
                        