package queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String Rafi[]){
        printQueue(createQueue());
    }

    private static Queue<Integer> createQueue(){
        PriorityQueue<Integer> queueOfIntegers = new PriorityQueue<>();
        queueOfIntegers.add(100);
        queueOfIntegers.add(200);
        queueOfIntegers.add(500);
        return queueOfIntegers;
    }

    private static void printQueue(Queue<Integer> queue){
        System.out.println("Retrieving head of the list "+queue.peek());
        System.out.println("Retrieve and Remove head of the list 1st attempt "+queue.poll());
        System.out.println("Retrieve and Remove head of the list 2nd attempt "+queue.poll());
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
