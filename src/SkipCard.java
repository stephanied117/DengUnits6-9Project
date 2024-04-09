public class SkipCard extends Card {
    private boolean skip;
    public SkipCard(String color, String symbol, int hiearchy, boolean skip) {
        super(color, symbol, hiearchy);
        this.skip = skip;
    }
    public boolean getSkip() {
        return skip;
    }
}
