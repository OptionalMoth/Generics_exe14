public class Main {
    public static void main(String[] args) {
        HomeAnimal<Dog> dogHome = new HomeAnimal<>(new Dog());
        dogHome.getAnimal().run();
        dogHome.getAnimal().speak();
        dogHome.showType();
        dogHome.sleepOnTheCouch();

        HomeAnimal<Cat> catHome = new HomeAnimal<>(new Cat());
        catHome.getAnimal().run();
        catHome.getAnimal().speak();
        catHome.showType();
        catHome.sleepOnTheCouch();

        //HomeAnimal<Shark> SharkHome = new HomeAnimal<>(new Shark());
        //SharkHome.getAnimal().run();
        //SharkHome.getAnimal().speak();
        //SharkHome.showType();
        //SharkHome.sleepOnTheCouch();
    }

}

class Animal {
}

interface Run {
    public void run();
}

interface Speak {
    public void speak();
}

class Cat extends Animal implements Run , Speak{
    @Override
    public void run() {
        System.out.println("the cat is running.");
    }

    @Override
    public void speak() {
        System.out.println("the cat is meowing.");
    }
}

class Dog extends Animal implements Run , Speak{
    @Override
    public void run() {
        System.out.println("the dog is running.");
    }

    @Override
    public void speak() {
        System.out.println("the dog is barking .");
    }
}

class Shark extends Animal{

}
class HomeAnimal<T extends Animal & Run & Speak> {
    private T animal;

    public HomeAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void showType() {
        System.out.println("Type of animal: " + animal.getClass().getSimpleName());
    }

    public void sleepOnTheCouch() {
        System.out.println("The animal is sleeping on the couch.");
    }
}