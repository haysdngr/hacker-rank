/*

//* Task

You are given a class Solution and its main method in the editor.
Your task is to create the class Add and the required methods so that the code prints the sum of the numbers passed to the function add.

//* Input Format

There are six lines of input, each containing an integer.

//* Output Format

There will be only four lines of output. Each line contains the sum of the integers passed as the parameters to add in the main method.

*/

package hackerRank.java;

// DEFAULT CODE
import java.io.*;
import java.lang.reflect.*;
import java.util.*;

// FINISH TASK
class Add {
  public void add(int... intArgs) {
    // initiate variabel.
    int sum = 0;
    String separator = "";

    // loop all arguments
    for (int i : intArgs) {
      /**
       * Calculate total all argumentes.
       * change separator with "+".
       */
      sum += i;
      System.out.print(separator + i);
      separator = "+";
    }

    // print the result with sum from all arguments.
    System.out.println("=" + sum);
  }
}


public class varargs {
  public static void main(String[] args) {
    // DEFAULT CODE
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n1 = Integer.parseInt(br.readLine());
      int n2 = Integer.parseInt(br.readLine());
      int n3 = Integer.parseInt(br.readLine());
      int n4 = Integer.parseInt(br.readLine());
      int n5 = Integer.parseInt(br.readLine());
      int n6 = Integer.parseInt(br.readLine());
      Add ob = new Add();
      ob.add(n1,n2);
      ob.add(n1,n2,n3);
      ob.add(n1,n2,n3,n4,n5);	
      ob.add(n1,n2,n3,n4,n5,n6);
      Method[] methods = Add.class.getDeclaredMethods();
      Set<String> set = new HashSet<>();
      boolean overload = false;
      for(int i = 0;i<methods.length;i++)
      {
        if(set.contains(methods[i].getName()))
        {
          overload = true;
          break;
        }
        set.add(methods[i].getName());
        
      }
      if(overload)
      {
        throw new Exception("Overloading not allowed");
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}