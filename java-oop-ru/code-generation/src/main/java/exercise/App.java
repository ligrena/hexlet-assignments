package exercise;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;

// BEGIN
public class App {
    public static void save(Path path, Car car) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(car);
        try (FileWriter writer = new FileWriter(path.toFile())) {
            writer.write(json);
        }
    }

    public static Car extract(Path path) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(Files.newBufferedReader(path));
        return mapper.treeToValue(jsonNode, Car.class);
    }
}
// END
