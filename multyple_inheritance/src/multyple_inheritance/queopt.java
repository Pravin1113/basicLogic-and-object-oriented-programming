package multyple_inheritance;
/* 6.	Define an interface “QueueOperations” which declares methods for a static queue. 
 * Define a class “MyQueue” which contains an array and front and rear as data members 
 * and implements the above interface. Initialize the queue using a constructor.
 *  Write a menu driven program to perform operations on a queue object.
 * 
 * OUTPUT:>
 * Enter the first value of Queue:
18
last value of queue:
25
Queue: [18, 19, 20, 21, 22, 23, 24]
Size of Queue: 7
Enter the value to remove from queue:
21
Peek: [18, 19, 20, 22, 23, 24]
Poll: 18
After implementation of all method Queue: [19, 20, 22, 23, 24]
PS C:\Users\Admin\Documents\GitHub>

 */


import java.util.Scanner;

import javax.xml.validation.Schema;

import java.util.Queue;
import java.util.LinkedList;

interface QueueOperations {
   void add(); // add the value in queue list

   void remove(); // remove the element in queue

   void peek(); // Returns the head of the queue

   void size(); //fidn the size of an queue

   void poll(); //it returns the head of element and remove it
}

class MyQueue implements QueueOperations {
   Queue<Integer> Q = new LinkedList<Integer>();
   int front, rear;

   MyQueue(int front, int rear) {
      this.rear = rear;
      this.front = front;

      if (front >= rear) {
         return;
      } else {

         for (int i = front; i < rear; i++) {
            Q.add(i);
         }
      }
      // method  call ()abstract emthod
      add();
      size();
      remove();
      peek();
      poll();

   }

   @Override
   public void add() {
      System.out.println("Queue: " + Q);
   }

   @Override
   public void size() {

      System.out.println("Size of Queue: " + (Q.size()));
   }

   @Override
   public void remove() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value to remove from queue: ");
      int b = sc.nextInt();
      Q.remove(b);
      System.out.println("After removing value Queue " + Q);
   }

   @Override
   public void peek() {
     
      System.out.println("Peek: " +  Q.peek());
   }

   @Override
   public void poll() {

      System.out.println("Poll: " + Q.poll() + "\nAfter implementation of all method Queue: " + Q);

   }

}

public class queopt {
   public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in);) {

         System.out.println("Enter the first value of Queue: ");
         int n = sc.nextInt();
         System.out.println("last value of queue: ");
         int rear = sc.nextInt();
         MyQueue m = new MyQueue(n, rear); // sending the size number of an array to Constructor.

      }
   }
}

