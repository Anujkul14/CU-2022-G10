package Lec42;

class Box<T>
{
    private T item;
    public Box(T item)
    {
        this.item = item;
    }

    public T getItem()
    {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

public class GenericsClass {
    public static void main(String[] args) {
        Box <Integer> integerBox = new Box<>(100);
        System.out.println(integerBox.getItem());

        Box <String> stringBox = new Box<>("Hello ");
        System.out.println(stringBox.getItem());



    }
}
