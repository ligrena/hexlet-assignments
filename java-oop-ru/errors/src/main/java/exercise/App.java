package exercise;

// BEGIN
public class App {

    public static void printSquare(Circle circle) throws NegativeRadiusException {
        if (circle.getRadius() < 0) {
            System.out.println("Не удалось посчитать площадь\nВычисление окончено");
        } else {
            int square = (int) Math.round(circle.getSquare());
            System.out.println(String.format("%s\nВычисление окончено", square));
        }
    }
}
// END
