import java.util.Random;
public class Options {
    public enum Colour{
        RED ("Primary"),
        ORANGE("Secondary"),
        YELLOW("Primary"),
        GREEN("Secondary"),
        BLUE("Primary"),
        INDIGO("Shady"),
        VIOLET("Secondary"),
        WHITE("Elementary"),
        BLACK("Elementary"),
        BROWN("Composite"),
        GREY("Shady"),
        PURPLE("Secondary");

        final String properties;

        Colour(String properties){
            this.properties = properties;
        }

        String getProperties(){
            return properties;
        }
        static final Random rnd = new Random();

        public static Colour returnRandom(){
            Colour[] clr = values();
            return clr[rnd.nextInt(clr.length)];
        }
    }
    //animal
    public enum Animal{
        DOG("vertebrae"),
        CAT("vertebrae"),
        COW("vertebrae"),
        SNAKE("vertebrae"),
        LION("vertebrae"),
        PANTHER("vertebrae"),
        PARROT("vertebrae"),
        HAMSTER("vertebrae"),
        TIGER("vertebrates"),
        FROG("vertebrates"),
        LIZARD("vertebrates"),
        CHIMPANZEE("vertebrates"),
        BEAR("vertebrates"),
        CHICKEN("vertebrates"),
        RACOON("vertebrates"),
        SHARK("vertebrates"),
        GOLDFISH("vertebrates"),
        OCTOPUS("invertebrates"),
        SCORPION("invertebrates"),
        ANT("invertebrates"),
        MILLIPEDE("invertebrates"),
        STINGRAY("invertebrates"),
        LEECH("invertebrates"),
        STARFISH("invertebrates"),
        SNAIL("invertebrates");



        final String kingdom;

        Animal( String kingdom){

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