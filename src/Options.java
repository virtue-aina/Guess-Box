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
    public enum Album{
        W010("Taylor Swift", "Fearless", 2010, 2010, "Female"),
        W011("Arcade Fire", "The Suburbs", 2011, 2010, "Group"),
        W012("Adele", "21", 2012, 2010, "Female"),
        W013("Mumford & Sons", "Babel", 2013, 2010, "Group"),
        W014("Daft Punk", "Random Access Memories", 2014, 2010, "Group"),
        W015("Beck", "Morning Phase", 2015, 2010, "Male"),
        W016("Taylor Swift", "1989", 2016, 2010, "Female"),
        W017("Adele", "25", 2017, 2010, "Female"),
        W018("Bruno Mars", "24K Magic", 2018, 2010, "Male"),
        W019("Kacey Musgraves", "Golden Hour", 2019, 2010, "Female"),
        W020("Billie Eilish", "When We All Fall Asleep, Where Do We Go?", 2020, 2020, "Female"),
        W021("Taylor Swift", "folklore", 2021, 2020, "Female"),
        W022("Jon Batiste", "We Are", 2022, 2020, "Male"),
        W023("Harry Styles", "Harry's House", 2023, 2020, "Male");


        final String artistName;
        final String albumName;
        final int year;
        final int decade;
        final String category;
        static final Random rnd = new Random();
        String getArtistName(){
            return artistName;
        }
        String getAlbumName(){
            return albumName;
        }
        int getYear(){
            return year;
        }

        public static Album returnRandom(){
            Album[] shp = values();
            return shp[rnd.nextInt(shp.length)];
        }

        @Override
        public String toString() {
            return artistName+", "+albumName+", "+year;
        }

        Album(String artistName, String albumName, int year, int decade, String category){
            this.artistName = artistName;
            this.albumName = albumName;
            this.year = year;
            this.decade = decade;
            this.category = category;
        }
        //grouping
        //decade
    }
}