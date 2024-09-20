class Square {
    double height;

    public Square(double height) {
        this.height = height;
    }

    public double area() {
        return (this.height * this.height);
    }

    public double compareArea(Square a) {
        return this.area() - a.area();
    }
}

public class Example {
    public static void main(String[] args) {
        Square a = new Square(2);
        Square b = new Square(3);
        System.out.println(a.compareArea(b));
    }
}