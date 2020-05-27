public class Rectangle {
    private final int x, y, width, height;

    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y= y;
        this.width = width;
        this.height = height;

    }
    public boolean contains(int x, int y){
        return x >= this.x && x < this.x + width &&
                y >= this.y && y < this.y + height;

    }

    public String toString() {
        return String.format("Rectangle: %d, %d, %d, %d", x, y, width, height);
    }

}