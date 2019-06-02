package lesson11;

public interface CatInterface {

    String getName();

    default String catToString() {
        return getName();
    }
}
