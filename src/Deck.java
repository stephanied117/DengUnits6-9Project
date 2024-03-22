import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Deck {
    private ArrayList<Card> deck;
    private int passOutCounter;
    public Deck() {
        passOutCounter = 0;

        // red
        NumberCard red1 = new NumberCard("red", 0, 1);
        NumberCard red2 = new NumberCard("red", 0, 2);
        NumberCard red3 = new NumberCard("red", 0, 3);
        NumberCard red4 = new NumberCard("red", 0, 4);
        NumberCard red5 = new NumberCard("red", 0, 5);
        NumberCard red6 = new NumberCard("red", 0, 6);
        NumberCard red7 = new NumberCard("red", 0, 7);
        NumberCard red8 = new NumberCard("red", 0, 8);
        NumberCard red9 = new NumberCard("red", 0, 9);
        NumberCard red0 = new NumberCard("red", 0, 0);
        ReverseCard redRev = new ReverseCard("red", 0, true);
        SkipCard redSk = new SkipCard("red", 0, true);
        PlusCard redPlus = new PlusCard("red", 0, 2);

        // yellow
        NumberCard yel1 = new NumberCard("yellow", 0, 1);
        NumberCard yel2 = new NumberCard("yellow", 0, 2);
        NumberCard yel3 = new NumberCard("yellow", 0, 3);
        NumberCard yel4 = new NumberCard("yellow", 0, 4);
        NumberCard yel5 = new NumberCard("yellow", 0, 5);
        NumberCard yel6 = new NumberCard("yellow", 0, 6);
        NumberCard yel7 = new NumberCard("yellow", 0, 7);
        NumberCard yel8 = new NumberCard("yellow", 0, 8);
        NumberCard yel9 = new NumberCard("yellow", 0, 9);
        NumberCard yel0 = new NumberCard("yellow", 0, 0);
        ReverseCard yelRev = new ReverseCard("yellow", 0, true);
        SkipCard yelSk = new SkipCard("yellow", 0, true);
        PlusCard yelPlus = new PlusCard("yellow", 0, 2);

        // green
        NumberCard gre1 = new NumberCard("yellow", 0, 1);
        NumberCard gre2 = new NumberCard("yellow", 0, 2);
        NumberCard gre3 = new NumberCard("yellow", 0, 3);
        NumberCard gre4 = new NumberCard("yellow", 0, 4);
        NumberCard gre5 = new NumberCard("yellow", 0, 5);
        NumberCard gre6 = new NumberCard("yellow", 0, 6);
        NumberCard gre7 = new NumberCard("yellow", 0, 7);
        NumberCard gre8 = new NumberCard("yellow", 0, 8);
        NumberCard gre9 = new NumberCard("yellow", 0, 9);
        NumberCard gre0 = new NumberCard("yellow", 0, 0);
        ReverseCard greRev = new ReverseCard("yellow", 0, true);
        SkipCard greSk = new SkipCard("yellow", 0, true);
        PlusCard grePlus = new PlusCard("yellow", 0, 2);

        // blue
        NumberCard blu1 = new NumberCard("yellow", 0, 1);
        NumberCard blu2 = new NumberCard("yellow", 0, 2);
        NumberCard blu3 = new NumberCard("yellow", 0, 3);
        NumberCard blu4 = new NumberCard("yellow", 0, 4);
        NumberCard blu5 = new NumberCard("yellow", 0, 5);
        NumberCard blu6 = new NumberCard("yellow", 0, 6);
        NumberCard blu7 = new NumberCard("yellow", 0, 7);
        NumberCard blu8 = new NumberCard("yellow", 0, 8);
        NumberCard blu9 = new NumberCard("yellow", 0, 9);
        NumberCard blu0 = new NumberCard("yellow", 0, 0);
        ReverseCard bluRev = new ReverseCard("yellow", 0, true);
        SkipCard bluSk = new SkipCard("yellow", 0, true);
        PlusCard bluPlus = new PlusCard("yellow", 0, 2);

        // other
        ColorChangeCard change1 = new ColorChangeCard("black", 0, true);
        ColorChangeCard change2 = new ColorChangeCard("black", 0, true);
        PlusCard fourPlus1 = new PlusCard("black", 0, 4);
        PlusCard fourPlus2 = new PlusCard("black", 0, 4);
        PlusCard fourPlus3 = new PlusCard("black", 0, 4);
        PlusCard fourPlus4 = new PlusCard("black", 0, 4);

        // objects added to arraylist
        deck.add(red1);
        deck.add(red2);
        deck.add(red3);
        deck.add(red4);
        deck.add(red5);
        deck.add(red6);
        deck.add(red7);
        deck.add(red8);
        deck.add(red9);
        deck.add(red0);
        deck.add(redRev);
        deck.add(redSk);
        deck.add(redPlus);

        deck.add(yel1);
        deck.add(yel2);
        deck.add(yel3);
        deck.add(yel4);
        deck.add(yel5);
        deck.add(yel6);
        deck.add(yel7);
        deck.add(yel8);
        deck.add(yel9);
        deck.add(yel0);
        deck.add(yelRev);
        deck.add(yelSk);
        deck.add(yelPlus);

        deck.add(gre1);
        deck.add(gre2);
        deck.add(gre3);
        deck.add(gre4);
        deck.add(gre5);
        deck.add(gre6);
        deck.add(gre7);
        deck.add(gre8);
        deck.add(gre9);
        deck.add(gre0);
        deck.add(greRev);
        deck.add(greSk);
        deck.add(grePlus);

        deck.add(blu1);
        deck.add(blu2);
        deck.add(blu3);
        deck.add(blu4);
        deck.add(blu5);
        deck.add(blu6);
        deck.add(blu7);
        deck.add(blu8);
        deck.add(blu9);
        deck.add(blu0);
        deck.add(bluRev);
        deck.add(bluSk);
        deck.add(bluPlus);

        deck.add(change1);
        deck.add(change2);
        deck.add(fourPlus1);
        deck.add(fourPlus2);
        deck.add(fourPlus3);
        deck.add(fourPlus4);
    }
    public void shuffleDeck() {
        ArrayList<Card> temp = new ArrayList<>();
        int deckLength = deck.size();
        while (temp.size() != deckLength) {
            int rng = (int) Math.random() * (deck.size() - 1);
            temp.add(deck.get(rng));
            deck.remove(rng);
        }
        for (Card c : temp) {
            deck.add(c);
        }
    }
    public void sortDeck() {

    }
    public void passOutCards() {
        passOutCounter = 0;
        while (passOutCounter < 17) {
            if (passOutCounter % 2 == 0) {
                Player.addCards(deck.get(passOutCounter));
            } else if (passOutCounter % 2 == 1) {
                Bot.addCards(deck.get(passOutCounter));
            }
            passOutCounter++;
        }
    }

}
