package homework8;

import java.util.*;

public class Bowling {

    private final int QUANTITY = 20;
    Random random = new Random();
    Set<Ball> balls;
    Set<Ball> fakeBalls;

    public Bowling(){
        balls = new TreeSet<>(Comparator.comparing(Ball::getId));
        fakeBalls = new TreeSet<>(Comparator.comparing(Ball::getId));

        final int centerOfMass = 10;
        for (int i = 0; i < QUANTITY; i++) {
            if (i != 2 && i != 7) {
                balls.add(new Ball(i, centerOfMass));
            } else {
                if (i == 2 || i == 7) {
                    fakeBalls.add(new Ball(i, random.nextInt(10)));
                }
            }
        }
    }

    public Set<Ball> getBalls() {
        return balls;
    }

    public Set<Ball> getFakeBalls() {
        return fakeBalls;
    }

    public int hit(Ball ball){
        int numberOfPins = 0;
        for (int i = 0; i < (10&ball.getCenterOfMass()); i++){
            numberOfPins += random.nextInt(2);
        }
        return numberOfPins;
    }

    public void iterate(){
        balls.forEach(ball -> System.out.print(ball.getId() + " " + ball.getCenterOfMass()));
        fakeBalls.forEach(ball -> System.out.print(ball.getId() + " " + ball.getCenterOfMass()));
    }

    public void delite(int id){
        balls.removeIf(ball -> ball.getId() == id);
    }
}
