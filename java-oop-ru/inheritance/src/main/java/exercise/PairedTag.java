package exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String nameTag;
    private Map<String, String> attributes;
    private String bodyTag;
    private List<Tag> childrenTags;

    public PairedTag(String nameTag, Map<String, String> attributes, String bodyTag, List<Tag> childrenTags) {
        this.nameTag = nameTag;
        this.attributes = attributes;
        this.bodyTag = bodyTag;
        this.childrenTags = childrenTags;
    }

    @Override
    public String toString() {
        String attributesString = attributes.entrySet().stream()
               .map(entry -> entry.getKey() + "=\"" + entry.getValue() + "\"")
               .collect(Collectors.joining(" "));

        String childrenTagsString = childrenTags.stream().map(Tag::toString).collect(Collectors.joining(""));

        if (attributesString.isEmpty()) {
            return String.format("<%s>%s</%s>", nameTag, bodyTag, nameTag);
        } else if (bodyTag.isEmpty()) {
            return String.format("<%s %s>%s</%s>", nameTag, attributesString, childrenTagsString, nameTag);
        } else if (childrenTagsString.isEmpty()) {
            return String.format("<%s %s>%s</%s>", nameTag, attributesString, bodyTag, nameTag);
        } else {
            return String.format("<%s %s>%s%s</%s>", nameTag, attributesString, bodyTag, childrenTagsString, nameTag);
        }
    }
}
// END
