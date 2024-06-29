public class PlayerCharacter {
    static int y=3;
    static int x=4;

   public static void main(String[] args) {
       System.out.println(x);
        System.out.println(y);
       System.out.println("getX "+getX());
       System.out.println("getY "+getY());
        System.out.println("d "+move("d"));
        System.out.println("w "+move("w"));
       System.out.println(x);
       System.out.println(y);
        System.out.println("s "+move("s"));
        System.out.println("a "+move("a"));
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
            y++;
            return true;

        }
        if(key == "d" || key == "D"){
            x++;
            return true;

        }
        if(key == "a" || key == "A"){
            x--;
            return true;

        }
        if(key == "s" || key == "S"){
            y--;
            return true;

        }

        return false;
    }
}
