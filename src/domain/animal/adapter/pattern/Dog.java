package domain.animal.adapter.pattern;

public interface Dog extends Animal {
    @Override
    public default void makeSound() {
        System.out.println("woof");
    }

    public default void sit() {
        System.out.println("thump");
    }
}
