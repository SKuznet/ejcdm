package homework9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    private Hippodrome hippodrome;
    private int nHorses = 4;
    private int pause = 1;
    private Player player = new Player(1);

    public void play(){
        Names[] names = Names.values();
        System.out.println("Greetings and welcome to our brand new hippodrome!");
        System.out.println("Your balance is: " + player.getMoney());
        System.out.println("Choose a horse (add a number from 0 to " + (nHorses - 1) + "):");
        for(Names n : names){
            System.out.println(n);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int horseNumber = Integer.parseInt(reader.readLine().trim());

            if(horseNumber >= 0 && horseNumber < nHorses){
                player.setFavorite(names[horseNumber].name());
            } else {
                throw new IllegalArgumentException();
            }

            System.out.println(" Please, make a bet.");
            player.setBet(Integer.parseInt(reader.readLine().trim()));

            if(!makeBet(player.getBet())){
                throw new IllegalArgumentException();
            }

            hippodrome = new Hippodrome(nHorses, pause, player);

            System.out.println("Do you wanna play again?(Y - yes, N - no)");
            String s = reader.readLine().trim();
            while(!s.equalsIgnoreCase("Y") && !s.equalsIgnoreCase("N")) {
                System.out.println("Wrong token. Try again.");
                s = reader.readLine().trim();
            }

            if(s.equalsIgnoreCase("Y")){
                play();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    private boolean makeBet(int bet){
        if(bet > 0 && player.getMoney() - bet >= 0){
            return true;
        }
        return false;
    }
}
