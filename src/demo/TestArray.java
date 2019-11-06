package demo;

import util.MyArray;

public class TestArray {
    public static void main(String[] args) {


        MyArray myArray = new MyArray();
        myArray.add(1);
        System.out.println(myArray.toString());
        myArray.add(2);
        System.out.println(myArray.toString());
        myArray.add(3);
        System.out.println(myArray.toString());


        System.out.println(myArray.bisectionSearch(3));


    }


}
