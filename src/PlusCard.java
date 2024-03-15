public class PlusCard extends Card {
    private int addCards;
    public PlusCard(String color, int hiearchy, int addCards) {
        super(color, hiearchy);
        this.addCards = addCards;
    }
    public int getAddCards() {
        return addCards;
    }
}
