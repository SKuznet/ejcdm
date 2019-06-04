package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight {
    private int minute;
    private Color color;

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public void getMinute(){

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            minute = Integer.parseInt(reader.readLine().trim());
            if (minute < 0) {
                System.out.println("Number should be positive. Please, try again!");
                getMinute();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.getMessage();
            System.err.println("Error. It's totally not an integer. Please, try again!");
            getMinute();
        }
    }

    public void checkColor(){
        int remainder = minute % 6;
        if(remainder >= 0 && remainder <= 2){
            setColor(Color.RED);
        } else if(remainder == 3){
            setColor(Color.YELLOW);
        } else if(remainder >= 4 && remainder <= 6){
            setColor(Color.GREEN);
        } else {
            System.out.println("Is it possible? You ruined everything!");
        }
    }

    public void printColor(){
        System.out.println(color);
    }
}
