public class SkipCard extends Card {
    private boolean skip;
    public SkipCard(String color, int hiearchy, boolean skip) {
        super(color, hiearchy);
        this.skip = skip;
    }
    public boolean getSkip() {
        return skip;
    }
}
