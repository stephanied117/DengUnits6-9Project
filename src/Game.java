import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    public Game() {
    }
    public void start() {
        Deck create = new Deck();
        create.shuffle();
        Bot bob = new Bot();
        Player you = new Player();
        create.passOut();
        create.startingCard();
    }
}
