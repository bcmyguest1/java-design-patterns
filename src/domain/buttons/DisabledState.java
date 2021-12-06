package domain.buttons;

public class DisabledState extends ButtonState {
    public DisabledState(Button button) {
        super(button);
        button.setEnabled(false);
    }

    @Override
    public void onUpdate(boolean enabled) {
        this.button.setEnabled(enabled);
        if (this.button.isEnabled()) {
            System.out.println(String.format("Changing state to enabled"));
            this.button.changeState(new EnabledState(button));
        } else {
            System.out.println("State of button remains the same");
        }
    }

    @Override
    public void onClick() {
        System.out.println("Do nothing");
    }
}
