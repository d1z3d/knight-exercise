package knight.ammunition;

public abstract class Ammunition {
    private int weight;
    private int cost;
    private int damage;
    private int protection;

    protected Ammunition(){
        this.weight = 0;
        this.cost = 0;
        this.damage = 0;
        this.protection = 0;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public abstract String getDefaultValue();
}
