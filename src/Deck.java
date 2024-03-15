public class Deck {
    private Card[] deck;
    public Deck() {
        // red
        Card red1 = new NumberCard("red", 0, 1);
        Card red2 = new NumberCard("red", 0, 2);
        Card red3 = new NumberCard("red", 0, 3);
        Card red4 = new NumberCard("red", 0, 4);
        Card red5 = new NumberCard("red", 0, 5);
        Card red6 = new NumberCard("red", 0, 6);
        Card red7 = new NumberCard("red", 0, 7);
        Card red8 = new NumberCard("red", 0, 8);
        Card red9 = new NumberCard("red", 0, 9);
        Card red0 = new NumberCard("red", 0, 0);
        Card redRev = new ReverseCard("red", 0, true);
        Card redSk = new SkipCard("red", 0, true);
        Card redPlus = new PlusCard("red", 0, 2);

        // yellow
        Card yel1 = new NumberCard("yellow", 0, 1);
        Card yel2 = new NumberCard("yellow", 0, 2);
        Card yel3 = new NumberCard("yellow", 0, 3);
        Card yel4 = new NumberCard("yellow", 0, 4);
        Card yel5 = new NumberCard("yellow", 0, 5);
        Card yel6 = new NumberCard("yellow", 0, 6);
        Card yel7 = new NumberCard("yellow", 0, 7);
        Card yel8 = new NumberCard("yellow", 0, 8);
        Card yel9 = new NumberCard("yellow", 0, 9);
        Card yel0 = new NumberCard("yellow", 0, 0);
        Card yelRev = new ReverseCard("yellow", 0, true);
        Card yelSk = new SkipCard("yellow", 0, true);
        Card yelPlus = new PlusCard("yellow", 0, 2);

        // green
        Card gre1 = new NumberCard("yellow", 0, 1);
        Card gre2 = new NumberCard("yellow", 0, 2);
        Card gre3 = new NumberCard("yellow", 0, 3);
        Card gre4 = new NumberCard("yellow", 0, 4);
        Card gre5 = new NumberCard("yellow", 0, 5);
        Card gre6 = new NumberCard("yellow", 0, 6);
        Card gre7 = new NumberCard("yellow", 0, 7);
        Card gre8 = new NumberCard("yellow", 0, 8);
        Card gre9 = new NumberCard("yellow", 0, 9);
        Card gre0 = new NumberCard("yellow", 0, 0);
        Card greRev = new ReverseCard("yellow", 0, true);
        Card greSk = new SkipCard("yellow", 0, true);
        Card grePlus = new PlusCard("yellow", 0, 2);

        // blue
        Card blu1 = new NumberCard("yellow", 0, 1);
        Card blu2 = new NumberCard("yellow", 0, 2);
        Card blu3 = new NumberCard("yellow", 0, 3);
        Card blu4 = new NumberCard("yellow", 0, 4);
        Card blu5 = new NumberCard("yellow", 0, 5);
        Card blu6 = new NumberCard("yellow", 0, 6);
        Card blu7 = new NumberCard("yellow", 0, 7);
        Card blu8 = new NumberCard("yellow", 0, 8);
        Card blu9 = new NumberCard("yellow", 0, 9);
        Card blu0 = new NumberCard("yellow", 0, 0);
        Card bluRev = new ReverseCard("yellow", 0, true);
        Card bluSk = new SkipCard("yellow", 0, true);
        Card bluPlus = new PlusCard("yellow", 0, 2);

        // other
        Card change1 = new ColorChangeCard("black", 0, true);
        Card change2 = new ColorChangeCard("black", 0, true);
        Card fourPlus1 = new PlusCard("black", 0, 4);
        Card fourPlus2 = new PlusCard("black", 0, 4);
        Card fourPlus3 = new PlusCard("black", 0, 4);
        Card fourPlus4 = new PlusCard("black", 0, 4);

        deck = {};
    }
}
