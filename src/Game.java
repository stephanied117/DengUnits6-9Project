public class Game {
    private Card[] shuffledSet;
    public Game() {

    }
    public void start() {
        Deck create = new Deck();
        Bot bob = new Bot();
        Player you = new Player("");
        create.shuffleDeck();
    }

}
