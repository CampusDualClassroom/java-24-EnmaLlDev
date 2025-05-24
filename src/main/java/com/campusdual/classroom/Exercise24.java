package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Smith");
        queue.add("Montessori");
        queue.add("Peralta");
        queue.add("House");

        return queue;

    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        for(String item : queue){
            System.out.println(item+" ");
        }
    }

    public static void main(String[] args) {
        Queue<String> myQueue = createQueue();
        System.out.println("Show my Queue");
        printAndEmptyQueue(myQueue);
    }
}
