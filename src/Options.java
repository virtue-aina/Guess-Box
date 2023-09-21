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
        HORSE("vertebrae", "gallops"),
        CAT("vertebrae","stretches"),
        SNAKE("vertebrae","slithers"),
        PARROT("vertebrae","flies"),
        HUMAN("vertebrae","walks"),
        MONKEY("vertebrates","climbs"),
        FROG("vertebrates","leaps"),
        BULL("vertebrates","charges"),
        APE("vertebrates","swings"),
        BEAR("vertebrates","lumbers"),
        HEN("vertebrates","struts"),
        SHARK("vertebrates","swims"),
        OCTOPUS("invertebrates","swims backwards"),
        ANT("invertebrates","crawls"),
        STINGRAY("invertebrates","propels"),
        LEECH("invertebrates","loops"),
        SNAIL("invertebrates","glides");



        final String kingdom;
        final String movement;

        Animal(String kingdom,String movement){

            this.kingdom = kingdom;
            this.movement = movement;
        }


        String getKingdom(){
            return kingdom;
        }
        String getMovement(){
            return movement;
        }

        public static final Random rando = new Random();
        public static Animal returnRand(){
            Animal[] animal = values();

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