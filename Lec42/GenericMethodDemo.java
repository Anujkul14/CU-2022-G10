package Lec42;

public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray =  {"Hello","World"};

        printArray(intArray);
    }

    public static <T> void printArray(T[] myArray)
    {
        for(T val : myArray)
        {
            System.out.println(val);
        }
    }
}
