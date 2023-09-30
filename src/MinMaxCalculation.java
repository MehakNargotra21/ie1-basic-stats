public class MinMaxCalculation {
    public void MinMax() {
        
        int[] arr = {-1, -2, -3, 1, 2, 3};
        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.print(min);
        System.out.print(max);
    }
}
