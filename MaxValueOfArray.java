//Calculate the maximum element in an array

class MaxValueOfArray {

    public static void main(String[] args) {
        int arr[] = {3, 6, 4};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
