package domain.animal.adapter.pattern;

public class DogAdapter implements Dog {
    Cat cat;

    public DogAdapter(Cat cat) {
        this.cat = cat;
    }

    public void sit() {
        System.out.println("Cats don't sit, silly!");
        cat.makeSound();
    }
}
