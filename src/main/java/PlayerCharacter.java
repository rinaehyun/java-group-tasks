public class PlayerCharacter {
    static int y=0;
    static int x=0;

   public static void main(String[] args) {
       System.out.println(x);
        System.out.println(y);
   }

    public static int getX() {
        return x=0;

    }

    public static int getY() {
        return y=0;

    }

    public static boolean move(String key){
        if(key == "w" || key == "W"){
            y += 1;
            return true;
        }
        if(key == "d" || key == "D"){
            x += 1;
            return true;
        }

        return false;
    }
}
