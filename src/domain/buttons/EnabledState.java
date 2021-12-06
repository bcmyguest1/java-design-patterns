package domain.buttons;

public class EnabledState extends ButtonState {

    public EnabledState(Button button) {
        super(button);
        button.setEnabled(true);
    }

    @Override
    public void onUpdate(boolean enabled) {
        this.button.setEnabled(enabled);
        if (!this.button.isEnabled()) {
            System.out.println(String.format("Changing button state to disabled"));
            this.button.changeState(new DisabledState(button));
        } else {
            System.out.println("State of button remains the same");
        }
    }

    @Override
    public void onClick() {
        System.out.println("Clicked the button, it does something!");
        this.button.changeState(new DisabledState(button));
    }
}
