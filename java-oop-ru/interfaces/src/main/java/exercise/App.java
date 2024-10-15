package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int maxCount) {
        return apartments.stream()
                .sorted(Comparator.comparingDouble(Home::getArea))
                .map(Home::toString).limit(maxCount)
                .collect(Collectors.toList());
    }
}
// END
