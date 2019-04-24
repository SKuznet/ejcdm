package lesson2;

class Cat {
    Integer year = 5;
    private String name;

    public static void getInfo() {
        System.out.println("Barsik");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
