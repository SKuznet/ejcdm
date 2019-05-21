package lesson4;

public abstract class Cat {
    private Eatable eatable;

    @Override
    public String toString() {
        return "Cat{" +
                "eatable=" + eatable +
                '}';
    }

    abstract void getInfo();

    public void setEatable(Eatable eatable) {
        this.eatable = eatable;
    }

    public void getEatable() {
        eatable.eatPossibility();
    }

}
