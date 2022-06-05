package org.example;

import java.util.Scanner;

public class Palindrome {

  public static String StringChallenge(String str) {
    // code goes here
    String rev = "";
    String org = "";
    str.replaceAll("\\W","");
    int len = str.length();
    for(int i= len -1 ;i>=0;i--) {
       rev = rev + org.charAt(i);
    }
    return rev;
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    String s1 = StringChallenge(String.valueOf(s));
    if (s1.equals(s)) {
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}
