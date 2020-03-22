public class MaximumSumSubarray {

    public static void main(String... args) {
        float sum;
        float[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int sizeSubarray = 3;

        StringBuilder subarray;
        int i = 0;
        while(i < numbers.length) {
            sum = 0;
            subarray = new StringBuilder("{");
            for(int j = 0; j < sizeSubarray; ++j) {
                subarray.append(numbers[i]);
                sum += numbers[i++];
                if (j < sizeSubarray - 1) {
                    subarray.append(",");
                }
            }
            subarray.append("}: ").append(sum);
            System.out.println(subarray);
        }
    }
}
