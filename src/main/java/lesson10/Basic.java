package lesson10;

public class Basic<T extends Number> {
    private final Class<T> entityClass;

    public Basic(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    Class<T> get() {
        return entityClass;
    }
}
