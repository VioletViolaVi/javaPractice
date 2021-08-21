import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

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
        System.out.println(math.multiply(math.add(-5, 8) , 6));

    }
}
