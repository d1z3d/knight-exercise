package knight;

import knight.ammunition.helmet.Helmet;
import knight.ammunition.sword.Sword;

public class Knight {
    public Helmet helmet;
    public Sword sword;
    public Knight() {
        this.helmet = new Helmet();
        this.sword = new Sword();
    }

    public void equipSword(int weight, int cost, int damage) {
        this.sword.setWeight(weight);
        this.sword.setCost(cost);
        this.sword.setDamage(damage);
    }

    public void equipHelmet(int weight, int cost, int protection) {
        this.helmet.setWeight(weight);
        this.helmet.setCost(cost);
        this.helmet.setProtection(protection);
    }

    public String showSword() {
        return "ClassesEquipment.Sword{damage=" + this.sword.getDamage() +
                ", weight=" + this.sword.getWeight() +
                ", cost=" + this.sword.getCost() + "}";
    }

    public String showHelmet() {
        return "ClassesEquipment.Helmet{protection=" + this.helmet.getProtection() +
                ", weight=" + this.helmet.getWeight() +
                ", cost=" + this.helmet.getCost() + "}";
    }

    public void showStats() {
        System.out.println("Ammunition cost: " + (this.helmet.getCost() + this.sword.getCost()));
        System.out.println("Ammunition weight: " + (this.helmet.getWeight() + this.sword.getCost()));
        System.out.println("Ammunition damage: " + (this.helmet.getDamage() + this.sword.getDamage()));
        System.out.println("Ammunition protection: " + (this.helmet.getProtection() + this.sword.getProtection()));
    }

}
