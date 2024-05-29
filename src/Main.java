import java.util.ArrayList;
import java.util.Stack;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;



public class Main {
    public static void main(String[] args) {

        Stack<Integer>  mystack = new Stack<>();
        mystack.push(15);
        mystack.push(11);
        mystack.push(19);
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());


        HashMap<String, Integer> myhash = new HashMap<>();
        myhash.put("hello", 15);
        myhash.put("goodbye", 18);
        myhash.put("say again?", 20);
        myhash.put("where", 24);

        System.out.println(myhash);
        System.out.println(myhash);

        HashSet<String> setstring = new HashSet<>();

        PriorityQueue<Integer> pqueue = new PriorityQueue<>();

        pqueue.add(5);
        pqueue.add(14);
        pqueue.add(9);
        pqueue.add(3);

        System.out.println(pqueue.poll());
        System.out.println(pqueue.poll());
        System.out.println(pqueue.poll());
        System.out.println(pqueue.poll());
        System.out.println(pqueue.poll());








    }
}