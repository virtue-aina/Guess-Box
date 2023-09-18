import java.util.Random;
public class Options {




    public enum Colour{
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        INDIGO,
        VIOLET,
        WHITE,
        BLACK,
        BROWN,
        GREY,
        PURPLE;

        static final Random rnd = new Random();

        public static Colour returnRandom(){
            Colour[] clr = values();
            return clr[rnd.nextInt(clr.length)];
        }
    }
    //animal
    //shape
    //album of the year
}
