package domain.animal.adapter.pattern;

public interface Cat extends Animal {
    @Override
    public default void makeSound() {
        System.out.println("meow");
    }
}
