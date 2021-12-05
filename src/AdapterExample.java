import domain.animal.adapter.pattern.*;

public class AdapterExample {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/adapter-pattern/ almost stolen from here since I'm too lazy to think of an example
        Dog pug = new Pug();
        Cat tabby = new TabbyCat();

        DogAdapter dogAdapter = new DogAdapter(tabby);
        System.out.println("Command: Pug, sit!");
        pug.sit();

        System.out.println("Command: Tabby, sit!");
        dogAdapter.sit();

    }
}


