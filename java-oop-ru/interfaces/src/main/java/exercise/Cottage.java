package exercise;

// BEGIN
public class Cottage implements Home {

    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public String toString() {
        return String.format("%s этажный коттедж площадью %s метров", floorCount, area);
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
