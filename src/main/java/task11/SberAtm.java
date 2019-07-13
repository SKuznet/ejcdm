package task11;

public class SberAtm implements CreateBank {
    @Override
    public Action createBank() {
        return new CreateSpb();
    }
}
