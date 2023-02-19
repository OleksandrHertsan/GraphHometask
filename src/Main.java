import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Graph first = new Graph(null, "А");
        Graph second = new Graph(null, "Б");
        Graph third = new Graph(null, "В");
        Graph fourth = new Graph(null, "Г");
        Graph fifth = new Graph(null, "Д");
        Graph sixth = new Graph(null, "Е");
        Graph seventh = new Graph(null, "Ж");
        Graph eighth = new Graph(null, "З");
        Graph ninth = new Graph(null, "И");
        Graph tenth = new Graph(null, "К");

        List<Graph> linksFirst = new ArrayList<>();
        linksFirst.add(second);
        linksFirst.add(third);
        linksFirst.add(fourth);
        linksFirst.add(fifth);
        first.setLinks(linksFirst);

        List<Graph> linksSecond = new ArrayList<>();
        linksSecond.add(third);
        linksSecond.add(sixth);
        second.setLinks(linksSecond);

        List<Graph> linksThird = new ArrayList<>();
        linksThird.add(seventh);
        third.setLinks(linksThird);

        List<Graph> linksFourth = new ArrayList<>();
        linksFourth.add(eighth);
        fourth.setLinks(linksFourth);

        List<Graph> linksFifth = new ArrayList<>();
        linksFifth.add(fourth);
        linksFifth.add(ninth);
        fifth.setLinks(linksFifth);

        List<Graph> linksSixth = new ArrayList<>();
        linksSixth.add(tenth);
        sixth.setLinks(linksSixth);

        List<Graph> linksSeventh = new ArrayList<>();
        linksSeventh.add(eighth);
        linksSeventh.add(tenth);
        seventh.setLinks(linksSeventh);

        List<Graph> linksEighth = new ArrayList<>();
        linksEighth.add(tenth);
        eighth.setLinks(linksEighth);

        List<Graph> linksNinth = new ArrayList<>();
        linksNinth.add(tenth);
        ninth.setLinks(linksNinth);


        List<Graph> vertices = List.of(fifth, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth);

        for (Graph graph : vertices) {
            System.out.println(graph + " " + graph.getLinks());
        }
    }
}