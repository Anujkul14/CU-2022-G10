package lec35;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
      String res = reverseWords(" Hello World ");

    }

    public static String reverseWords(String s)
    {
        s = s.trim();
        String ans = "";
        String arr[] = s.split("\s+");

        for(int i = arr.length - 1;i >= 0;i--)
        {
            ans += arr[i] + " ";
        }
        return ans.trim();
    }
}
