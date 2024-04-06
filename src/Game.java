import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    public Game() {
    }
    public void start() {
        Deck create = new Deck();
        create.shuffle();
        System.out.print(create.getDeck());
        create.dealer();
        create.passOut();
        create.startingCard();
    }
}
