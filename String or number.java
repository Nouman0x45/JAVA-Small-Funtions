// Name = Nouman Butt
// ID   = 2020-CS-110
// Uni  = U.E.T
// Date = 24/02/2021

import java.util.Scanner;
public class Task8 {
  
  public static void main(String[] args)
  {
    Scanner cin = new Scanner(System.in);
    String str;
    boolean flag = false;
    str = cin.nextLine();
    char arr[] = str.toCharArray();
    for(byte i = 0; i< str.length(); i++)
    {
      if ( arr[i] >= 48 && arr[i] <= 57 )
      {
        flag = true;
      }
      else
      {
        flag = false;
        break;
      }
    }
    
    if(flag == true)
    {
      System.out.print("Entered String is Number.");
    }
    else
    {
      System.out.print("Entered String isn't a Number.");
    }
    
  } // ending bracket of main
  
} // ending bracket of class