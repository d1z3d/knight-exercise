package knight.ammunition.helmet;

import knight.ammunition.Ammunition;

public class Helmet extends Ammunition {
    private final String defaultValue = "you have no helmet";

    public Helmet() {
        super();
    }

    @Override
    public String getDefaultValue() {
        return "Helmet: " + defaultValue;
    }
}
