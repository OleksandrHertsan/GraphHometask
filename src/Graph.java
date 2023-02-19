import java.util.List;

public class Graph {
    private List<Graph> links;
    private String value;


    public Graph(List<Graph> links, String value) {
        this.links = links;
        this.value = value;
    }


    public void setLinks(List<Graph> links) {
        this.links = links;
    }

    public List<Graph> getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return value;
    }
}
