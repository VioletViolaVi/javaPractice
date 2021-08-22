import java.util.*;

public class Main {
    public static void main(String[] args) {
        // static practice
        StaticPractice.weatherSentence("sunny");
        System.out.println(StaticPractice.faveTvShow);
        System.out.println(StaticPractice.lightSwitch("oFf"));
        System.out.println(StaticPractice.worstTvShow);
        StaticPractice.ageRestriction(23);
        StaticPractice.ageRestriction(6);

        System.out.println("\n");

        // ternary operator usage
        int time = 2;
        String greeting = time < 18 ? "Good day.": "Good evening.";
        System.out.println(greeting);
        System.out.println((time < 18) ? "Good day.": "Good evening.");

        System.out.println("\n");

        // finding specific number in array
        FindTheNum findTheNum = new FindTheNum();
        System.out.println(findTheNum.numThatIsPassed);
        Arrays.sort(findTheNum.arrayOfNums);
        System.out.println(Arrays.toString(findTheNum.arrayOfNums));
        System.out.println(Arrays.binarySearch(findTheNum.arrayOfNums, findTheNum.numThatIsPassed));
        System.out.println(Arrays.binarySearch(findTheNum.arrayOfNums, findTheNum.numThatIsPassed) > -1);

        System.out.println("\n");

        /* https://www.w3resource.com/java-exercises/basic/index.php */
        /* Start */

        // 1) printing your full name
        System.out.println("Challenge 1:");
        PrintName printName = new PrintName();
        printName.myName("Jessie J");

        // 2) adding numbers
        System.out.println("Challenge 2:");
        Math math = new Math();
        System.out.println(math.add(3,3));

        // 3) dividing numbers
        System.out.println("Challenge 3:");
        System.out.println(math.divide(55, 11));

        // 4) multiplying numbers
        System.out.println("Challenge 4:");
        System.out.println(math.multiply(5, 5));

        // 4a) -5 + 8 * 6
        System.out.println("Challenge 4a:");
        System.out.println(math.add(-5 , math.multiply(8, 6)));

        // 4b) (55+9) % 9
        System.out.println("Challenge 4b:");
        int firstPart = math.add(55, 9);
        int secondPart = math.modulo(firstPart, 9);
        System.out.println(secondPart);

        // 4c) 20 + -3*5 / 8
        System.out.println("Challenge 4c:");
        int first = math.multiply(-3, 5);
        int second = math.divide(first, 8) ;
        int third = math.add(20, second);
        System.out.println(third);

        // 4d) 5 + ((15 / 3) * 2) - (8 % 3)
        System.out.println("Challenge 4d:");
        int firstNum = math.divide(15, 3);
        int secondNum = math.multiply(firstNum, 2);
        int otherFirstNum = math.modulo(8, 3);
        int thirdNum = math.add(5, secondNum);
        int fourthNum = math.subtract(thirdNum, otherFirstNum);
        System.out.println(fourthNum);

        /* End */

        System.out.println("\n");

        // LinkedHashMap
        LinkedHashMap weatherMap = new LinkedHashMap(); /* using LinkedHashMap allows keys or values be printed out in order in terminal */
        weatherMap.put("sunny", "hot");
        weatherMap.put("winter", "cold");
        weatherMap.put("clear skies", "warm");
        System.out.println(weatherMap);
        System.out.println(weatherMap.get("clear skies"));
        System.out.println(weatherMap.size());
        System.out.println("\n");
        for (Object weatherType : weatherMap.keySet()) {
            System.out.println(weatherType);
        }
        System.out.println("\n");
        for (Object temp : weatherMap.values()) {
            System.out.println(temp);
        }
        System.out.println("\n");
        for (Object all : weatherMap.entrySet()) {
            System.out.println(all);
        }
        System.out.println("\n");

        // HashMap
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Britain", "London");
        capitalCities.put("South Korea", "Seoul");
        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("China", "Shanghai");
        System.out.println(capitalCities);
        System.out.println("\n");
        System.out.println("LOOK HERE ALSO!!!");
        for (Map.Entry bothCountryAndCapital : capitalCities.entrySet()) {
            System.out.println(bothCountryAndCapital);
        }
        System.out.println("\n");
        for (Map.Entry bothCountryAndCapital : capitalCities.entrySet()) {
            System.out.println("bothCountryAndCapital.getKey(): " + bothCountryAndCapital.getKey() + "\nbothCountryAndCapital.getValue(): " + bothCountryAndCapital.getValue());
        }
        System.out.println("\n");
        System.out.println("LOOK HERE!!!");
        for (String country : capitalCities.keySet()) {
            System.out.println("Country: " + country + "\nCapital: " + capitalCities.get(country));
        }
        System.out.println("\n");
        for (String city : capitalCities.values()) {
            System.out.println(city);
        }
        System.out.println("\n");
        System.out.println(capitalCities.get("Britain"));
        System.out.println(capitalCities.containsValue("Paris"));
        System.out.println(capitalCities.containsKey("Singapore"));
        capitalCities.replace("China", "Shenzhen");
        System.out.println(capitalCities);
        capitalCities.clear(); // took all keys and values out
        System.out.println(capitalCities);

        ArrayList<String> foods = new ArrayList<>();
        foods.add("pie");// ArrayLists
        foods.add("chips");
        foods.add("soup");
        foods.add("sweets");
        foods.add("bread");
        foods.add("fish");
        System.out.println(foods);
        foods.set(0, "sandwich");
        System.out.println(foods);
        System.out.println(foods.get(3));

        System.out.println("\n");

        ArrayList<Integer> testScores = new ArrayList<>();
        testScores.add(30);
        testScores.add(60);
        testScores.add(100);
        System.out.println(testScores);
        testScores.add(0);
        System.out.println(testScores);
        Collections.sort(testScores);
        System.out.println(testScores);

        System.out.println("\n");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.remove(1);
        System.out.println("HERE LOOK HERE!!!");
        numbers.set(0, 67859);
        System.out.println(numbers);

        System.out.println("\n");

        ArrayList<Double> decimalNums = new ArrayList<>();
        decimalNums.add(15.0);
        decimalNums.add(6.7);
        decimalNums.add(9.341);
        System.out.println(decimalNums);

        System.out.println("\n");

        // Binary Search
        System.out.println("HERE LOOK HERE!!!");
        int[] nums = {20, 30, 40};
        System.out.println("Arrays.binarySearch(nums, 30): " + Arrays.binarySearch(nums, 30));

        System.out.println("\n");

        String[] randWords = {"hello", "cat", "dog", "house", "mouse", "goodbye", "see ya"};
        Arrays.sort(randWords);
        System.out.println("Now Sorted: " + Arrays.toString(randWords));
        System.out.println("Arrays.binarySearch(randWords, \"hello\"): " + Arrays.binarySearch(randWords, "hello"));
        System.out.println("Arrays.binarySearch(randWords, \"see ya\"): " + Arrays.binarySearch(randWords, "see ya"));

        System.out.println("\n");
        double[] randDecimals = {2.2, 3.4, 13.567, 0.454, 5.67, 6.2, 8.1, 0.2548};
        Arrays.sort(randDecimals);
        System.out.println("Now Sorted: " + Arrays.toString(randDecimals));
        System.out.println("Arrays.binarySearch(randWords, \"13.567\"): " + Arrays.binarySearch(randDecimals, 13.567));


    }
}
