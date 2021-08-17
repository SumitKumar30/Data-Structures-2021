public class MissingValue{
    
    static void findMissing(int[] arr){
        int n = arr.length+1;
        int totalSum = n * ((n+1)/2);

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum+ arr[i];
        }
        int missingValue = totalSum - sum;
        System.out.println("Missing value is: "+missingValue);
    }

    public static void main(String[] args){
            int arr[] = {1, 2, 3, 5, 6, 9, 8, 7};
            findMissing(arr);
    }
}