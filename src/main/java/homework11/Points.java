package homework11;

public class Points {
    private int javaPoints;
    private int springPoints;
    private int java8Points;
    private int attendance;
    private int patternPoints;

    public int getJavaPoints() {
        return javaPoints;
    }

    public void setJavaPoints(int javaPoints) {
        this.javaPoints = javaPoints;
    }

    public int getSpringPoints() {
        return springPoints;
    }

    public void setSpringPoints(int springPoints) {
        this.springPoints = springPoints;
    }

    public int getJava8Points() {
        return java8Points;
    }

    public void setJava8Points(int java8Points) {
        this.java8Points = java8Points;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public int getPatternPoints() {
        return patternPoints;
    }

    public void setPatternPoints(int patternPoints) {
        this.patternPoints = patternPoints;
    }

    @Override
    public String toString() {
        return "Pretender{" +
                "javaPoints=" + javaPoints +
                ", springPoints=" + springPoints +
                ", java8Points=" + java8Points +
                ", attendance=" + attendance +
                ", patternPoints=" + patternPoints +
                '}';
    }
}

