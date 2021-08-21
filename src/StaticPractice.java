public class StaticPractice {
    // static instant variables
    static String faveTvShow = "Tweenies";
    static String worstTvShow = "Scooby Doo";

    // static methods
    public static void weatherSentence(String weather) {
        System.out.println("The weather outside is " + weather + "!");
    }
    public static boolean lightSwitch(String onOrOff) {
        if (onOrOff.toLowerCase().equals("on")) {
            return true;
        } else {
            return false;
        }
    }
    public static void ageRestriction(int age) {
        if (age < 18) {
            System.out.println("You are too young to drink!");
        } else {
            System.out.println("You are old enough to drink!");
        }
    }
}
