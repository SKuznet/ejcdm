package task11;

public class SpbAtm implements CreateBank {
    @Override
    public Action createBank() {
        return new CreateSber();
    }
}
