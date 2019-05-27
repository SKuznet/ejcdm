package lesson9;

public class Runner1 {
    public static void main(String[] args) {
        Animal turtle = new Turtle();


        Turtle turtle1 = new Turtle();
        Animal animal = new Turtle();

        if(turtle1 instanceof Animal) {
            turtle1 =(Turtle) animal;
        }


    }
}
