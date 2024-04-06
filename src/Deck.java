import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
public class Deck {
    private ArrayList<Card> emptyCards;
    private ArrayList<Card> deck;
    private ArrayList<Card> botDeck;
    private ArrayList<Card> playerDeck;
    private ArrayList<Card> placedPile;
    private Card[] compareCards;
    private String message;
    public Deck() {
        // array lists for cards
        emptyCards = new ArrayList<>();
        deck = new ArrayList<>();
        botDeck = new ArrayList<>();
        playerDeck = new ArrayList<>();
        placedPile = new ArrayList<>();
        compareCards = new Card[2];
        message = "";

        // empty card objects
        NumberCard num = new NumberCard(null, 0, -1);
        ReverseCard rev = new ReverseCard(null, 0, false);
        SkipCard skip = new SkipCard(null, 0, false);
        PlusCard plus = new PlusCard(null, 0, 0);
        ColorChangeCard color = new ColorChangeCard(null, 0, false);

        //red
        NumberCard red1 = new NumberCard("red", 1, 1);
        NumberCard red2 = new NumberCard("red", 1, 2);
        NumberCard red3 = new NumberCard("red", 1, 3);
        NumberCard red4 = new NumberCard("red", 1, 4);
        NumberCard red5 = new NumberCard("red", 1, 5);
        NumberCard red6 = new NumberCard("red", 1, 6);
        NumberCard red7 = new NumberCard("red", 1, 7);
        NumberCard red8 = new NumberCard("red", 1, 8);
        NumberCard red9 = new NumberCard("red", 1, 9);
        NumberCard red0 = new NumberCard("red", 1, 0);
        NumberCard red1b = new NumberCard("red", 1, 1);
        NumberCard red2b = new NumberCard("red", 1, 2);
        NumberCard red3b = new NumberCard("red", 1, 3);
        NumberCard red4b = new NumberCard("red", 1, 4);
        NumberCard red5b = new NumberCard("red", 1, 5);
        NumberCard red6b = new NumberCard("red", 1, 6);
        NumberCard red7b = new NumberCard("red", 1, 7);
        NumberCard red8b = new NumberCard("red", 1, 8);
        NumberCard red9b = new NumberCard("red", 1, 9);
        ReverseCard redRev = new ReverseCard("red", 2, true);
        ReverseCard redRevb = new ReverseCard("red", 2, true);
        SkipCard redSk = new SkipCard("red", 2, true);
        SkipCard redSkb = new SkipCard("red", 2, true);
        PlusCard redPlus = new PlusCard("red", 3, 2);
        PlusCard redPlusb = new PlusCard("red", 3, 2);

        // yellow
        NumberCard yel1 = new NumberCard("yellow", 1, 1);
        NumberCard yel2 = new NumberCard("yellow", 1, 2);
        NumberCard yel3 = new NumberCard("yellow", 1, 3);
        NumberCard yel4 = new NumberCard("yellow", 1, 4);
        NumberCard yel5 = new NumberCard("yellow", 1, 5);
        NumberCard yel6 = new NumberCard("yellow", 1, 6);
        NumberCard yel7 = new NumberCard("yellow", 1, 7);
        NumberCard yel8 = new NumberCard("yellow", 1, 8);
        NumberCard yel9 = new NumberCard("yellow", 1, 9);
        NumberCard yel0 = new NumberCard("yellow", 1, 0);
        NumberCard yel1b = new NumberCard("yellow", 1, 1);
        NumberCard yel2b = new NumberCard("yellow", 1, 2);
        NumberCard yel3b = new NumberCard("yellow", 1, 3);
        NumberCard yel4b = new NumberCard("yellow", 1, 4);
        NumberCard yel5b = new NumberCard("yellow", 1, 5);
        NumberCard yel6b = new NumberCard("yellow", 1, 6);
        NumberCard yel7b = new NumberCard("yellow", 1, 7);
        NumberCard yel8b = new NumberCard("yellow", 1, 8);
        NumberCard yel9b = new NumberCard("yellow", 1, 9);
        ReverseCard yelRev = new ReverseCard("yellow", 2, true);
        ReverseCard yelRevb = new ReverseCard("yellow", 2, true);
        SkipCard yelSk = new SkipCard("yellow", 2, true);
        SkipCard yelSkb = new SkipCard("yellow", 2, true);
        PlusCard yelPlus = new PlusCard("yellow", 3, 2);
        PlusCard yelPlusb = new PlusCard("yellow", 3, 2);

        // green
        NumberCard gre1 = new NumberCard("green", 1, 1);
        NumberCard gre2 = new NumberCard("green", 1, 2);
        NumberCard gre3 = new NumberCard("green", 1, 3);
        NumberCard gre4 = new NumberCard("green", 1, 4);
        NumberCard gre5 = new NumberCard("green", 1, 5);
        NumberCard gre6 = new NumberCard("green", 1, 6);
        NumberCard gre7 = new NumberCard("green", 1, 7);
        NumberCard gre8 = new NumberCard("green", 1, 8);
        NumberCard gre9 = new NumberCard("green", 1, 9);
        NumberCard gre0 = new NumberCard("green", 1, 0);
        NumberCard gre1b = new NumberCard("green", 1, 1);
        NumberCard gre2b = new NumberCard("green", 1, 2);
        NumberCard gre3b = new NumberCard("green", 1, 3);
        NumberCard gre4b = new NumberCard("green", 1, 4);
        NumberCard gre5b = new NumberCard("green", 1, 5);
        NumberCard gre6b = new NumberCard("green", 1, 6);
        NumberCard gre7b = new NumberCard("green", 1, 7);
        NumberCard gre8b = new NumberCard("green", 1, 8);
        NumberCard gre9b = new NumberCard("green", 1, 9);
        ReverseCard greRev = new ReverseCard("green", 2, true);
        ReverseCard greRevb = new ReverseCard("green", 2, true);
        SkipCard greSk = new SkipCard("green", 2, true);
        SkipCard greSkb = new SkipCard("green", 2, true);
        PlusCard grePlus = new PlusCard("green", 3, 2);
        PlusCard grePlusb = new PlusCard("green", 3, 2);

        // blue
        NumberCard blu1 = new NumberCard("blue", 1, 1);
        NumberCard blu2 = new NumberCard("blue", 1, 2);
        NumberCard blu3 = new NumberCard("blue", 1, 3);
        NumberCard blu4 = new NumberCard("blue", 1, 4);
        NumberCard blu5 = new NumberCard("blue", 1, 5);
        NumberCard blu6 = new NumberCard("blue", 1, 6);
        NumberCard blu7 = new NumberCard("blue", 1, 7);
        NumberCard blu8 = new NumberCard("blue", 1, 8);
        NumberCard blu9 = new NumberCard("blue", 1, 9);
        NumberCard blu0 = new NumberCard("blue", 1, 0);
        NumberCard blu1b = new NumberCard("blue", 1, 1);
        NumberCard blu2b = new NumberCard("blue", 1, 2);
        NumberCard blu3b = new NumberCard("blue", 1, 3);
        NumberCard blu4b = new NumberCard("blue", 1, 4);
        NumberCard blu5b = new NumberCard("blue", 1, 5);
        NumberCard blu6b = new NumberCard("blue", 1, 6);
        NumberCard blu7b = new NumberCard("blue", 1, 7);
        NumberCard blu8b = new NumberCard("blue", 1, 8);
        NumberCard blu9b = new NumberCard("blue", 1, 9);
        ReverseCard bluRev = new ReverseCard("blue", 2, true);
        ReverseCard bluRevb = new ReverseCard("blue", 2, true);
        SkipCard bluSk = new SkipCard("blue", 2, true);
        SkipCard bluSkb = new SkipCard("blue", 2, true);
        PlusCard bluPlus = new PlusCard("blue", 3, 2);
        PlusCard bluPlusb = new PlusCard("blue", 3, 2);

        // other (wild)
        ColorChangeCard change1 = new ColorChangeCard("wild", 4, true);
        ColorChangeCard change2 = new ColorChangeCard("wild", 4, true);
        ColorChangeCard change3 = new ColorChangeCard("wild", 4, true);
        ColorChangeCard change4 = new ColorChangeCard("wild", 4, true);
        PlusCard fourPlus1 = new PlusCard("wild", 5, 4);
        PlusCard fourPlus2 = new PlusCard("wild", 5, 4);
        PlusCard fourPlus3 = new PlusCard("wild", 5, 4);
        PlusCard fourPlus4 = new PlusCard("wild", 5, 4);

        // empty objects added to array list
        emptyCards.add(num);
        emptyCards.add(rev);
        emptyCards.add(skip);
        emptyCards.add(plus);
        emptyCards.add(color);

        // objects added to deck arraylist
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
        deck.add(red1b);
        deck.add(red2b);
        deck.add(red3b);
        deck.add(red4b);
        deck.add(red5b);
        deck.add(red6b);
        deck.add(red7b);
        deck.add(red8b);
        deck.add(red9b);
        deck.add(redRev);
        deck.add(redRevb);
        deck.add(redSk);
        deck.add(redSkb);
        deck.add(redPlus);
        deck.add(redPlusb);
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
        deck.add(yel1b);
        deck.add(yel2b);
        deck.add(yel3b);
        deck.add(yel4b);
        deck.add(yel5b);
        deck.add(yel6b);
        deck.add(yel7b);
        deck.add(yel8b);
        deck.add(yel9b);
        deck.add(yelRev);
        deck.add(yelRevb);
        deck.add(yelSk);
        deck.add(yelSkb);
        deck.add(yelPlus);
        deck.add(yelPlusb);
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
        deck.add(gre1b);
        deck.add(gre2b);
        deck.add(gre3b);
        deck.add(gre4b);
        deck.add(gre5b);
        deck.add(gre6b);
        deck.add(gre7b);
        deck.add(gre8b);
        deck.add(gre9b);
        deck.add(greRev);
        deck.add(greRevb);
        deck.add(greSk);
        deck.add(greSkb);
        deck.add(grePlus);
        deck.add(grePlusb);
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
        deck.add(blu1b);
        deck.add(blu2b);
        deck.add(blu3b);
        deck.add(blu4b);
        deck.add(blu5b);
        deck.add(blu6b);
        deck.add(blu7b);
        deck.add(blu8b);
        deck.add(blu9b);
        deck.add(bluRev);
        deck.add(bluRevb);
        deck.add(bluSk);
        deck.add(bluSkb);
        deck.add(bluPlus);
        deck.add(bluPlusb);
        deck.add(change1);
        deck.add(change2);
        deck.add(change3);
        deck.add(change4);
        deck.add(fourPlus1);
        deck.add(fourPlus2);
        deck.add(fourPlus3);
        deck.add(fourPlus4);
    }
    public void shuffle() {
        ArrayList<Card> temp = new ArrayList<>();
        int originalSize = deck.size();
        int die = 0;
        while (temp.size() != originalSize) {
            die = (int)(Math.random() * deck.size());
            temp.add(deck.get(die));
            System.out.println(temp.get(temp.size() - 1));
            deck.remove(die);
        }
        for (Card c : temp) {
            deck.add(c);
        }
    }
    public void dealer() {
        message = "";
        compareCards[0] = deck.get((int)(Math.random() * deck.size()));
        identifyCard(compareCards[0]);
        System.out.println("You picked up " + message);
        message = "";
        compareCards[1] = deck.get((int)(Math.random() * deck.size()));
        identifyCard(compareCards[1]);
        System.out.println("They picked up " + message);
    }
    public void passOut() {
        for (int i = deck.size() - 1; i > deck.size() - 15; i--) {
            if (i % 2 == 0) {
                botDeck.add(deck.get(i));
            } else if (i % 2 == 1) {
                playerDeck.add(deck.get(i));
            }
        }
    }
    public void startingCard() {
        placedPile.add(deck.get(deck.size() - 1));
        identifyCard(placedPile.get(placedPile.size() - 1));
        System.out.println(message);
    }
    public ArrayList<Card> getDeck() {
        return deck;
    }
    public ArrayList<Card> getBotDeck() {
        return botDeck;
    }
    public ArrayList<Card> getPlayerDeck() {
        return playerDeck;
    }
    public ArrayList<Card> getPlacedPile() {
        return placedPile;
    }
    public int getNumBotCards() {
        return botDeck.size();
    }
    public int getNumPlayerCards() {
        return playerDeck.size();
    }
    public int getNumPlacedCards() {
        return placedPile.size();
    }
    private void identifyCard(Card c) {
        message = "a " + c.getColor();
        if (c.getClass() == emptyCards.get(0).getClass()) {
            NumberCard temp = (NumberCard)(c);
            message += " " + temp.getNumber();
        } else if (c.getClass() == emptyCards.get(1).getClass()) {
            message += " reverse";
        } else if (c.getClass() == emptyCards.get(2).getClass()) {
            message += " skip";
        } else if (c.getClass() == emptyCards.get(3).getClass()) {
            PlusCard temp = (PlusCard)(c);
            message += " plus " + temp.getAddCards();
        }
        message += " card";
    }
}
