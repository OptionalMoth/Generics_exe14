public class Main {
    public static void main(String[] args) {
        HomeAnimal<Dog> dogHome = new HomeAnimal<>(new Dog());
        dogHome.animal().run();
        dogHome.animal().speak();
        dogHome.showType();
        dogHome.sleepOnTheCouch();

        HomeAnimal<Cat> catHome = new HomeAnimal<>(new Cat());
        catHome.animal().run();
        catHome.animal().speak();
        catHome.showType();
        catHome.sleepOnTheCouch();

      //HomeAnimal<Shark> SharkHome = new HomeAnimal<>(new Shark());
      //  SharkHome.getAnimal().run();
      //  SharkHome.getAnimal().speak();
      //  SharkHome.showType();
      //  SharkHome.sleepOnTheCouch();/
    }

}

class Animal {
}

interface Run {
    void run();
}

interface Speak {
    void speak();
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

record HomeAnimal<T extends Animal & Run & Speak>(T animal) {

    public void showType() {
        System.out.println("Type of animal: " + animal.getClass().getSimpleName());
    }

    public void sleepOnTheCouch() {
        System.out.println("The animal is sleeping on the couch.");
    }
}