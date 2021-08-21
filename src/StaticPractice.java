public class StaticPractice {
    // static instant variable
    static String faveTvShow = "Tweenies";
    // static method
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
}
