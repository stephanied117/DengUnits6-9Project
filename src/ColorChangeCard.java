public class ColorChangeCard extends Card {
    private boolean change;
    public ColorChangeCard(String color, int hiearchy, boolean change) {
        super(color, hiearchy);
        this.change = change;
    }
    public boolean getChange() {
        return change;
    }
}
