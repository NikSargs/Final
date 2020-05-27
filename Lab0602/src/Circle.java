public class Circle {
    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    public boolean contains (int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return dx * dx + dy + dy < radius * radius;
    }
    public String toString() {
        return String.format("Circle: %d, %d, %d", x, y, radius);

    }
}
