package com.anatol.everything;

import java.util.*;
 
class Palindrome
{
   public static void main(String args[])
   {
      Scanner scanner = new Scanner(System.in);
      String myString, reverseString = "";

      System.out.println("Enter a string: ");
      myString = scanner.nextLine();

      int length = myString.length();

      for (int i = length - 1; i >=0; i-- )
         reverseString = reverseString + myString.charAt(i);

      if (reverseString.equals(myString))
         System.out.println("The string is a palindrome");
      else
         System.out.println("The string is not a palindrome");
         
   }
}      