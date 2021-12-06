package domain.buttons;

public abstract class ButtonState {
    final Button button;

    public ButtonState(Button button) {
        this.button = button;
    }

    public abstract void onUpdate(boolean enabled);
    public abstract void onClick();

    @Override
    public String toString() {
        return String.format("%s",button);
    }
}
