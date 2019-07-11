package homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class Game {
    private int score = 0;
    private int attempts = 10;

    public void play(){
        System.out.println("Greetings and welcome to our bowling club!");

        Bowling bowling = new Bowling();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while(attempts != 0) {
                System.out.println("Choose the ball from 0 to 19.");
                int ballId = Integer.parseInt(reader.readLine());
                Set<Ball> set = bowling.balls;
                if(ballId == 2 || ballId == 7 ){
                    set = bowling.fakeBalls;
                }
                for (Ball b : set) {
                    if (b.getId() == ballId) {
                        int hitedPins = bowling.hit(b);
                        if (hitedPins == 10){
                            System.out.println("Strike!");
                        } else{
                            if (hitedPins == 9){
                                System.out.println("Spare!");
                            } else{
                                System.out.println("You hit " + hitedPins + " pin(s). Next time aim better!");
                            }
                        }
                        score += hitedPins;
                        break;
                    }
                }
                attempts--;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getScore() {
        return score;
    }
}
