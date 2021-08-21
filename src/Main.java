import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // finding specific number in array
        FindTheNum findTheNum = new FindTheNum();
        System.out.println(findTheNum.numThatIsPassed);
        Arrays.sort(findTheNum.arrayOfNums);
        System.out.println(Arrays.toString(findTheNum.arrayOfNums));
        System.out.println(Arrays.binarySearch(findTheNum.arrayOfNums, findTheNum.numThatIsPassed));
        System.out.println(Arrays.binarySearch(findTheNum.arrayOfNums, findTheNum.numThatIsPassed) > -1);
    }
}
