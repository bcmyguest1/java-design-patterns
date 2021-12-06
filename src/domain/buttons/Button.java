package domain.buttons;

public class Button {
    private ButtonState state;
    private boolean enabled;

    public Button(ButtonStateTypes stateType) {
        if (stateType == ButtonStateTypes.DISABLED) {
            this.state = new DisabledState(this);
        } else if (stateType == ButtonStateTypes.ENABLED) {
            this.state = new EnabledState(this);
        } else {
            throw new UnsupportedOperationException("No.");
        }
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {return enabled;}

    public void changeState(ButtonState state) {
        this.state = state;
    }

    public void onUpdate(boolean enabled) {
        this.state.onUpdate(enabled);
    }

    public void click() {
        this.state.onClick();
    }

    @Override
    public String toString() {
        return String.format("Button is enabled: %s", enabled);
    }
}
