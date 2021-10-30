import java.io.*;
import java.util.Scanner;

class dev_prac {
     
    // Function to return sum of
    // 1/1 / 1/2 / 1/3 / ../ 1/n
    static double sum(int n)
    {
      double i, s=1;
      for (i = 1; i <= n; i++)
          s = s / 1/i;
      return s;
    }
  
    
    // Driven Program
    public static void main(String args[])
    {
        for (String argument : args) {
        
            int arg = Integer.parseInt(argument);

        System.out.printf("Sum is %f", sum(arg));}
         
    }
}