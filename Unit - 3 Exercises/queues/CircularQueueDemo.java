// Array impelementation of Circular Queue. 1. Enqueue 2. Dequeue 3. Peek 4. isFull 5. isEmpty
import java.util.Scanner;
class CircularQueueDemo{
  int front  = -1;
  int rear = -1;
  int[] arr = new int[5];

  // Insertion into a circular queue
  void enqueueAtRear(int item){
      // check for overflow
      if(isFull()){
            System.out.println("Queue is full!! Overflow...");
      }
      else{
          // initial case
          if(front == -1)
              front = 0;
          if(rear == arr.length-1)
              rear = 0;
          else
              rear = rear+1;
          arr[rear] = item;
      }
  }

  // Deletion from a circular queue
  int dequeueAtFront(){
      // check for underflow
      if(isEmpty()){
          System.out.println("Queue is empty!! Underflow....");
          return 0;
      }
      else{
          int temp = arr[front];
          // if front and rear points to same index, then re-initialize front & rear
          if(front == rear){
              front = -1;
              rear = -1;
              return temp;
          }
          if(front == arr.length-1)
              front = 0;
          else
              front = front+1;
          return temp;
      }
  }

  // Peek front element
  int peekAtFront(){
      // check for underflow
      if(isEmpty()){
          System.out.println("Queue is Empty!! ");
          return 0;
      }
      else
          return arr[front];
  }

  // Condition for Overflow
  boolean isFull(){
        if(front == 0 && rear == arr.length-1 || front == rear+1)
            return true;
        else
          return false;

  }

  // Condition for underflow
  boolean isEmpty(){
        if(front == -1)
            return true;
        else
            return false;

  }

  public static void main(String[] args){
      CircularQueueDemo cqueue = new CircularQueueDemo();
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter 5 elements: ");

      for(int i = 0; i < 5; i++){
          cqueue.enqueueAtRear(sc.nextInt());
      }

      System.out.println("Element at the front is: "+cqueue.peekAtFront());

      System.out.println("Element deleted is: "+cqueue.dequeueAtFront());
      System.out.println("Element deleted is: "+cqueue.dequeueAtFront());

      cqueue.enqueueAtRear(100);

      System.out.println("Element at the front is: "+cqueue.peekAtFront());

      cqueue.enqueueAtRear(120);

      cqueue.enqueueAtRear(150);  // overflow condition



  }
}
