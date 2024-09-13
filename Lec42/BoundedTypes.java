package Lec42;

class Animal{
    public void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    public void bark()
    {
        System.out.println("Dog is barking");
    }
}

class AnimalShelter<T extends Animal>
{
    private T animal;

    public AnimalShelter(T animal)
    {
        this.animal = animal;
    }

    public void showAnimal()
    {
        animal.eat();
    }
}

public class BoundedTypes {
    public static void main(String[] args) {
        AnimalShelter <Dog> shelter = new AnimalShelter<>(new Dog());
        shelter.showAnimal();

        //AnimalShelter<Integer> shelter1 = new AnimalShelter<Integer>(10);
    }
}

