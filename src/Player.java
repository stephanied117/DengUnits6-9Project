import java.util.ArrayList;
public class Player {
    private String name;
    private ArrayList<Card> myDeck;
    public Player(String name) {
        this.name = name;
        myDeck = new ArrayList<>();
    }
}
