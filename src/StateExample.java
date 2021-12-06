import domain.buttons.Button;
import domain.buttons.ButtonStateTypes;

public class StateExample {
    public static void main(String[] args) {
        Button button = new Button(ButtonStateTypes.ENABLED);
        System.out.println(button);
        button.click();
        System.out.println(button);
        button.onUpdate(true);
        button.onUpdate(true);
        button.onUpdate(true);
        System.out.println(button);
        button.click();
        System.out.println(button);
        button.click();
        System.out.println(button);
        button.onUpdate(false);
        System.out.println(button);
        button.click();
        System.out.println(button);
    }
}
