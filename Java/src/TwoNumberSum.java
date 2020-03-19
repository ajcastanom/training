import java.util.Arrays;

public class TwoNumberSum {

    public int[] getTwoNumberSum(int[] numbers, int target) {
        int[] pairNumbers;

        int[] sortedNumbers = Arrays.stream(numbers).sorted().toArray();

        if(target < 0) {
            pairNumbers = findPairNumberForTargetNegative(sortedNumbers, target);
        } else {
            pairNumbers = findPairNumberForTargetPositive(sortedNumbers, target);
        }

        return pairNumbers;
    }

    private int[] findPairNumberForTargetNegative(int[] numbers, int target) {
        int[] pairNumbers = new int[0];
        int sumPairNumbers;
        for(int i = 0, n = numbers.length; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                sumPairNumbers = numbers[i] + numbers[j];
                if(sumPairNumbers == target) {
                    pairNumbers = new int[2];
                    pairNumbers[0] = numbers[i];
                    pairNumbers[1] = numbers[j];
                    return pairNumbers;
                } else if(sumPairNumbers > target){
                    break;
                }
            }
        }

        return pairNumbers;
    }

    private int[] findPairNumberForTargetPositive(int[] numbers, int target) {
        int[] pairNumbers = new int[0];
        int sumPairNumbers;
        for(int i = 0, n = numbers.length; i < n - 1; i++) {
            for(int j = n - 1; j > i; j--) {
                sumPairNumbers = numbers[i] + numbers[j];
                if(sumPairNumbers == target) {
                    pairNumbers = new int[2];
                    pairNumbers[0] = numbers[i];
                    pairNumbers[1] = numbers[j];
                    return pairNumbers;
                } else if(sumPairNumbers < target){
                    break;
                }
            }
        }

        return pairNumbers;
    }

    public static void main(String... args) {
        int[] numbers = {3, 5, -4, 8, 11, 1, -1, 6};
        int target = 8;

        /*int[] numbers = {2, -7, 4, 8, -11};
        int target = 56;
         */

        int[] pairNumbers = new TwoNumberSum().getTwoNumberSum(numbers, target);
        if(pairNumbers.length > 0) {
            System.out.println("[" + pairNumbers[0] + "," + pairNumbers[1] + "]");
        } else {
            System.out.println("[]");
        }

    }
}
