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
    public enum Animal{
        DOG("",""),
        CAT("",""),
        COW("",""),
        SNAKE("",""),
        LION("",""),
        PANTHER("",""),
        PARROT("",""),
        HAMSTER("",""),
        TIGER("",""),
        FROG("",""),
        LIZARD("",""),
        CHIMPANZEE("",""),
        BEAR("",""),
        CHICKEN("",""),
        RACOON("",""),
        SHARK("",""),
        GOLDFISH("","");


        final String type;
        final String kingdom;

        Animal(String type, String kingdom){
            this.type = type;
            this.kingdom = kingdom;
        }


    }






    //shape
    public enum Shapes{
        TRIANGLE (3),
        SQUARE (4),
        RECTANGLE(4),
        KITE(4),
        PARALLELOGRAM(4),
        PENTAGON(5),
        HEXAGON(6),
        HEPTAGON(7),
        OCTAGON(8),
        NONAGON(9),
        DECAGON(10);

        final int sides;

        static final Random rnd = new Random();

        public static Shapes returnRandom(){
            Shapes[] shp = values();
            return shp[rnd.nextInt(shp.length)];
        }

        Shapes(int sides){
            this.sides =sides;
        }

        int getSides(){
            return sides;
        }
    }
    //album of the year
}
