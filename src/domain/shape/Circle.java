package domain.shape;

public class Circle {
    public Integer rad;

    public Circle(Integer rad) {
        this.rad = rad;
    }

    public Circle(Circle c) {
        this(c != null ? c.rad : null);
    }

    @Override
    public String toString() {
        return String.format("Circle - radius: %d", this.rad);
    }
}