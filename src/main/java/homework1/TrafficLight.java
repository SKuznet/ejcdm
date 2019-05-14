package homework1;

import java.util.Scanner;

public class TrafficLight {
    private int minute = 0;

    public void getMinute(){
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            minute = scan.nextInt();
        } else {
            System.out.println("Sorry, but it's totally not an integer. Please, try again!");
            getMinute();
        }
        if (minute < 0){
            System.out.println("Number should be positive. Please, try again!");
            getMinute();
        }
    }

    public void checkColor(){
        int remainder = minute % 6;
        if(remainder >= 0 && remainder <= 2){
            System.out.println("Red");
        } else if(remainder == 3){
            System.out.println("Yellow");
        } else if(remainder >= 4 && remainder <= 6){
            System.out.println("Green");
        } else {
            System.out.println("Is it possible? Something went wrong >:(");
        }
    }


}
