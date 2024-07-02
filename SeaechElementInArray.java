//search the element in an array.If present return the index else return -1.

class SeaechElementInArray{

    public static int searchElement(int[] arr,int n){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3,4,1,7,8,5,9,0,8};
        int element = 8;
        System.out.println(searchElement(array,element));

    }

}