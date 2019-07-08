package task04;

import java.util.Objects;

public class CatColliz {
    private int id;
    private String name;
    private String description;

    CatColliz(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatColliz catColliz = (CatColliz) o;
        return id == catColliz.id &&
                Objects.equals(name, catColliz.name) &&
                Objects.equals(description, catColliz.description);
    }

    @Override
    public String toString() {
        return "CatColliz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
