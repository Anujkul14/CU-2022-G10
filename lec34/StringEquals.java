package lec34;

public class StringEquals {
    public static boolean equals(String s1,String s2)
    {
        if(s1 == s2)
            return true;

        if(s1.length() != s2.length())
            return false;

        for(int i = 0;i < s1.length();i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String s1 = "hello";
        s1 = "G10";
        //no reference variable is pointing to hello,collected by garbage collector

        System.out.println(s1.charAt(1));

        String s2 = new String("G10");

        System.out.println(s1.equals(s2));

        //user-defined equals function
        System.out.println(equals(s1,s2));
    }
}
