public class PlayerCharacter {
    static int y=0;
    static int x=0;

   public static void main(String[] args) {
    y+=move("w");
    System.out.println(y);
   }

    public static int getX() {
        return x=0;

    }

    public static int getY() {
        return y=0;

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
