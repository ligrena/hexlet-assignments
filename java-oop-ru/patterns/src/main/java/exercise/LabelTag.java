package exercise;

// BEGIN
public class LabelTag implements TagInterface {

    private String tag;
    private TagInterface newTag;

    public LabelTag(String tag, TagInterface newTag) {
        this.tag = tag;
        this.newTag = newTag;
    }

    @Override
    public String render() {
        return "<label>" + tag + newTag.render() + "</label>";
    }
}
// END
