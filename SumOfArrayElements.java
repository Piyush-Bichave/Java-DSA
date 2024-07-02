//Calculate the sum of all elements in an array

class SumOfArrayElements{
    
    public static void main(String[] args) {

        int[] arr = {2,5,7,3,4,9};
        int sum = 0;

        for(int array : arr){
            sum = sum + array;
        }

        System.out.println(sum);
    }
}