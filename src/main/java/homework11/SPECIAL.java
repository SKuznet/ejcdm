package homework11;

public class SPECIAL {
    private int strength;
    private int perception;
    private int charisma;
    private int intelligence;
    private int agility;
    private int luck;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    @Override
    public String toString() {
        return "S.P.E.C.I.A.L.{" +
                "Strength=" + strength +
                ", Perception=" + perception +
                ", Charisma=" + charisma +
                ", Intelligence=" + intelligence +
                ", Agility=" + agility +
                ", Luck=" + luck +
                '}';
    }
}

