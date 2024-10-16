package exercise;

import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class SingleTag extends Tag {

    private String nameTag;
    private Map<String, String> attributes;

    public SingleTag(String nameTag, Map<String, String> attributes) {
        this.nameTag = nameTag;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        String string = attributes.entrySet().stream()
                .map(entry -> entry.getKey() + "=\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(" "));

        if (string.isEmpty()) {
            return String.format("<%s>", nameTag);
        } else {
            return String.format("<%s %s>", nameTag, string);
        }
    }
}
// END
