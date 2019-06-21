package homework11;

public class HardInterviewExam implements Interviewable{
    @Override
    public int getInterviewPoints(int luck) {
        int points = 52 * luck;

        if (points > 100){
            return 100;
        } else if (points >= 0){
            return points;
        } else{
            return 0;
        }
    }
}
