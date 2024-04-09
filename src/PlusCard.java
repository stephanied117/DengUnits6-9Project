public class PlusCard extends Card {
    private int addCards;
    public PlusCard(String color, String symbol, int hiearchy, int addCards) {
        super(color, symbol, hiearchy);
        this.addCards = addCards;
    }
    public int getAddCards() {
        return addCards;
    }
}
