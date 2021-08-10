//Spiral Display


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int count = 0;
        int minr = 0;
        int minc =0;
        int maxc = arr[0].length-1;
        int maxr = arr.length-1;
        
        while(count< n*m){
            //leftwall
            for(int i = minr,j=minc;i<=maxr && count< n*m;i++){
                System.out.println(arr[i][j]);
                count++;
            }
            //bottomwall
            for(int i = maxr,j=minc+1;j<=maxc && count< n*m;j++){
                System.out.println(arr[i][j]);
                count++;
            }
            //rightwall
            for(int i = maxr-1,j=maxc;i>=minr && count< n*m;i--){
                System.out.println(arr[i][j]);
                count++;
            }
            //topwall
            for(int i = minr,j=maxc-1;j>minc && count< n*m;j--){
                System.out.println(arr[i][j]);
                count++;
            }
            
            minr++;
            minc++;
            maxr--;
            maxc--;
            
            
        }
    }

}
--------------------------------------------------------------------------------------------
Ring Rotate
Easy  Prev   Next
You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int arr[][] = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    int s = scn.nextInt();
    int r = scn.nextInt();
    int minr = s - 1;
    int minc = s - 1;
    int maxc = arr[0].length - s;
    int maxr = arr.length - s;
    int size = 2 * (maxc-minc+1) + 2 * (maxr-minr+1) - 4;
    int list[] = new int[size];
    r = r% size;
    if(r<0){
        r =r+size;
    }
    

    traverse(arr, list, minr, maxr, minc, maxc);

    // Now manipulate list
    reverse(list, 0, size - r - 1);

    reverse(list, size - r , size-1 );
   
    reverse(list, 0, size - 1);
   



   
    finaltraverse(arr, list, minr, maxr, minc, maxc);
    display(arr);




  }

  public static void display(int[][] arr ) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void finaltraverse(int[][] arr, int[] list, int minr, int maxr, int minc, int maxc) {
    int idx = 0;
    //leftwall
    for (int i = minr, j = minc; i <= maxr ; i++) {
      arr[i][j] = list[idx]  ;
      idx++;
    }
    //bottomwall
    for (int i = maxr, j = minc + 1; j <= maxc ; j++) {
      arr[i][j] = list[idx]  ;
      idx++;
    }
    //rightwall
    for (int i = maxr - 1, j = maxc; i >= minr; i--) {
      arr[i][j] = list[idx]  ;
      idx++;
    }
    //topwall
    for (int i = minr, j = maxc - 1; j > minc ; j--) {
      arr[i][j] = list[idx]  ;
      idx++;
    }

  }

  public static void traverse(int[][] arr, int[] list, int minr, int maxr, int minc, int maxc) {
    int idx = 0;
    //leftwall
    for (int i = minr, j = minc; i <= maxr ; i++) {
      list[idx] = arr[i][j]  ;
      idx++;
    }
    //bottomwall
    for (int i = maxr, j = minc + 1; j <= maxc ; j++) {
      list[idx] = arr[i][j]  ;
      idx++;
    }
    //rightwall
    for (int i = maxr - 1, j = maxc; i >= minr; i--) {
      list[idx] = arr[i][j]  ;
      idx++;
    }
    //topwall
    for (int i = minr, j = maxc - 1; j > minc ; j--) {
      list[idx] = arr[i][j]  ;
      idx++;
    }

  }

  public static void reverse(int[] arr, int lo, int hi) {

    while (lo < hi) {
      int temp = arr[lo];
      arr[lo] = arr[hi];
      arr[hi] = temp;
      lo++;
      hi--;
    }

  }

}
-------------------------------------------------------------------------------------------


