package homework10;

public class Pretender {
    public int id;
    private String lastname;

    Points points;
    SPECIAL special;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Pretender{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", points=" + points +
                ", special=" + special +
                '}';
    }
}

