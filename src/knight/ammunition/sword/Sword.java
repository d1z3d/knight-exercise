package knight.ammunition.sword;

import knight.ammunition.Ammunition;

public class Sword extends Ammunition {
    private final String defaultValue = "you have no sword";

    public Sword() {
        super();
    }

    public String getDefaultValue() {
        return "Sword: " + defaultValue;
    }
}
