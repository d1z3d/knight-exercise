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
}
