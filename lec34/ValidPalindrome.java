package lec34;

public class ValidPalindrome {
    public static boolean isPalindromic(String s)
    {
        int i = 0;
        int j = s.length() - 1;

        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        //two pointers apporach
        String s = "naan";
        System.out.println(isPalindromic(s));
    }
}
