package homework10;

public class EasyInterviewExam implements Interviewable{
    @Override
    public int getInterviewPoints(int luck) {
        int points = 99 * luck;

        if (points > 100){
            return 100;
        } else if (points >= 0){
            return points;
        } else{
            return 0;
        }
    }
}

