/*************************************************
Filename: Lab04.java
Author: MIDN Ian Coffey
File to Implement Both Queue & Node Classes
**************************************************/

// Import Classes
import java.util.*;

public class Lab04
{
    public static void main(String[] args)
    {
        Queue Q = new Queue();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while(!s.equals("done")) 
        {      
            Q.enqueue(s);
            s = sc.next();      
        }

        while(!Q.empty()) 
        {
            System.out.println(Q.dequeue());
        }
  }
}