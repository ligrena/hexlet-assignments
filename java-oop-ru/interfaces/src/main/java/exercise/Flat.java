package exercise;

// BEGIN
public class Flat implements Home {

    private double area;
    private int floor;
    private double basementArea;

    public Flat(double area, int floor, double basementArea) {
        this.area = area;
        this.floor = floor;
        this.basementArea = basementArea;
    }

    public String toString() {
        return String.format("Квартира площадью %s метров на %s этаже", area, floor);
    }

    @Override
    public int compareTo(Home another) {
        if (this.area > another.getArea()) {
            return 1;
        } else if (this.area < another.getArea()) {
            return -1;
        } else return 0;
    }

    @Override
    public double getArea() {
        return area;
    }
}
// END
