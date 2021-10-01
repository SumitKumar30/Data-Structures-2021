// Demonstrate all basic operations on stack data structure - using ARRAY
import java.util.Scanner;
class StackDemo{
    // int top = -1;
   static int push(int value, int[] stack, int top){
        // check for overflow condition
        if(isFull(stack, top)){
            System.out.println("Overflow!!! No more space left....");
        }
        else{
            // increment top
            top = top+1;
            // insert the element at the top
            stack[top] = value;
        }
        return top;
    }

    static int pop(int[] stack, int top){
        // check the condition for underflow
        if(isEmpty(top)){
            System.out.println("Underflow!!!.. Stack is Empty!");
            // return 0;
        }
        else{
            int temp = stack[top];
            top = top - 1;
            System.out.println("Element removed from the top: "+temp);
        }
        return top;
    }

   static int peek(int[] stack, int top){
        // check the condition for underflow
        if(isEmpty(top)){
            System.out.println("STACK is empty!!!");
        }else{
            System.out.println("Element at the top is: "+stack[top]);
        }
        return top;
    }

    // condition for overflow
   static boolean isFull(int[] stack, int top){
        if(stack.length <= top)
            return true;    // stack is full
        else    
            return false; 
    }

    // condition for underflow
    static boolean isEmpty(int top){
        if(top < 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int top = -1;   // initialize top 
        System.out.println("Enter the size of stack: ");
        int size = sc.nextInt();
         int[] stack = new int[size];
        System.out.println("Enter the elements....");
        for(int i = 0; i < stack.length; i++){
           top = push(sc.nextInt(), stack, top);
        }
        top = pop(stack, top);
        
        top = peek(stack, top);
    }
}