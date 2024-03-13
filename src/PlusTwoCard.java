public class PlusTwoCard extends Card {
    private int addCards;
    public PlusTwoCard(String color, int hiearchy, int addCards) {
        super(color, hiearchy);
        this.addCards = addCards;
    }
    public int getAddCards() {
        return addCards;
    }
}
