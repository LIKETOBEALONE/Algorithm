package util;

public class Hanoi {

    public static void main(String[] args) {
        hanoi(100,'A','B','C');
    }
    public static void hanoi(int n,char one,char two,char three){
        if (n==1){
            System.out.println("第"+n+"个盘子从"+one+"移到"+three);
        }else {
            hanoi(n-1,one,three,two);
            System.out.println("第"+n+"个盘子从"+one+"移到"+three);
            hanoi(n-1,two,one,three);
            System.out.println("第"+n+"个盘子从"+one+"移到"+three);

        }
    }
}
