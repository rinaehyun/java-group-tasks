public class PlayerCharacter {

    public static int getX() {
        return 0;

    }

    public static int getY() {
        return 0;

    }

    public static int move(String key) {
        if (key == "w" || key == "W") {
            return 1;
        }
        if (key == "s" || key == "S") {
            return -1;
        }
        return 0;
    }
}
