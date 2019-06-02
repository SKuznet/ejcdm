package lesson11;

public abstract class AbstractCat {

    abstract String getName();

    @Override
    public String toString() {
        return getName();
    }
}
