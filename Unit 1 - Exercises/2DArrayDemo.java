// 2-D Arrays Demo
import java.util.Scanner;
class 2DArrayDemo{
  public static void main(String[] args){

      // Creating a 2-D Array
      int[][] arr = new int[3][3];

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the elements: ");

      for(int i = 0 ; i < arr.length; i++){
        for(int j = 0; j < arr[i].length; j++ ){
            arr[i][j] = sc.nextInt();
        }
      }

      System.out.println("Array elements are: ");
      for(int i = 0; i < arr.length; i++){
          for(int j = 0; j < arr[i].length; j++){
              System.out.print(arr[i][j]+" ");
          }
      }


  }

}
