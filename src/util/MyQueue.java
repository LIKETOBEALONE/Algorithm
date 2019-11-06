package util;

public class MyQueue {
    int[] elements;

    public MyQueue() {
        elements = new int[0];
    }

    public void add(int element) {
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    public int poll() {
        int element = elements[0];
        int[] newArray = new int[elements.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = elements[i + 1];
        }
        elements = newArray;

        return element;
    }

    public boolean isEmpty() {

        return elements.length == 0;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(9);
        myQueue.add(2);
        myQueue.add(9);
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
    }
}
