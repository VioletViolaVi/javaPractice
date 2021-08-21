import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ArrayLists
        ArrayList<String> foods = new ArrayList<>();
        foods.add("pie");
        foods.add("chips");
        foods.add("soup");
        foods.add("sweets");
        foods.add("bread");
        foods.add("fish");
        System.out.println(foods);
        foods.set(0, "sandwich");
        System.out.println(foods);
        System.out.println(foods.get(3));

        // ternary operator usage
        int time = 2;
        String greeting = time < 18 ? "Good day.": "Good evening.";
        System.out.println(greeting);
        System.out.println((time < 18) ? "Good day.": "Good evening.");

        // finding specific number in array
        FindTheNum findTheNum = new FindTheNum();
        System.out.println(findTheNum.numThatIsPassed);
        Arrays.sort(findTheNum.arrayOfNums);
        System.out.println(Arrays.toString(findTheNum.arrayOfNums));
        System.out.println(Arrays.binarySearch(findTheNum.arrayOfNums, findTheNum.numThatIsPassed));
        System.out.println(Arrays.binarySearch(findTheNum.arrayOfNums, findTheNum.numThatIsPassed) > -1);

        /* https://www.w3resource.com/java-exercises/basic/index.php */

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
    }
}
