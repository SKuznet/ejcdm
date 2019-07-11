package homework8;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Bowling bowling = new Bowling();
        bowling.iterate();
        bowling.delite(3);
        bowling.delite(17);
        game.play();
    }
}
