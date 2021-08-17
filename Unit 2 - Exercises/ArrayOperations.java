public class ArrayOperations{

    static void linearSearch(int[] arr){
        int value = 80;
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(value == arr[i]){
                System.out.println("Element found at: "+i);
                flag = true;
                break;
            }
        }
        if(flag == false)
            System.out.println("Element no found!");
    }

    // Binary search algo
    static void binarySearch(int[] arr){
        int low = 0, high = arr.length-1;
        int key = 100;
        boolean flag = false;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                    System.out.println("Element found at index: "+mid);
                    flag = true;
                    break;
            }
            else if(arr[mid] > key){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        if(flag == false){
            System.out.println("Element not found!!!!!");
        }
    }

    public static void main(String[] args){
        
        // declaration and initialization
        int[] arr = new int[10];

        int[] arr2 = {10, 20, 45, 32, 56};

        String[] str = new String[5];

        // insert elements into an array
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 50;
        // arr[3] = 60;

        for(int i = 0; i < arr.length; i++){
            arr[i] = i*2;
        }

        // traversal
        for(int value: arr){
            System.out.println(value);
        }

        // insertion at the begenning 
        // perform the shift operation 
        for(int j = arr.length-1; j > 0; j--){
            arr[j] = arr[j-1];
        }

        // overwrite 
        arr[0]  = 70;

        System.out.println("Insertion at the begenning....");
        for(int value: arr){
            System.out.println(value);
        }

        // Deletion from the begenning
        // perform shift operation to the left
        for(int k = 0; k < arr.length-1; k++){
            arr[k] = arr[k+1];
        }

        System.out.println(arr);

        // Search - Linear Search 

        linearSearch(arr);

        // Search - Binary Search
        binarySearch(arr);
        
    }
}