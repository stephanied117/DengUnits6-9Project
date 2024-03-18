import java.util.ArrayList;

public class Bot {
    private ArrayList<Card> botDeck;
    public Bot() {
        botDeck = new ArrayList<>();
    }
    public void addCards(Card card) {
        botDeck.add(card);
    }
}
