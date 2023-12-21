public class Main {

}

class Animal {
}

interface Run {
    public void run();
}

interface Speak {
    public void speak();
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