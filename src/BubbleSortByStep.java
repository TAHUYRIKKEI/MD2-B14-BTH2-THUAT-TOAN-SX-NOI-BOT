import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter" + list.length + "value");
        for (int i =0; i < list.length; i ++){
            list[i] = scanner.nextInt();
        }
        System.out.println("your input lis");
        for (int i =0; i < list.length; i ++){
            System.out.println(list[i]+ "\t");
        }
    }
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k ++){

            needNextPass = false;
            for (int i =0; i< list.length-k; i ++){
                if(list[i]>list[i=1]){
                    System.out.println("Swap"+ list[1] + "with"+ list[1+1]);
                    int temp = list[i];
                    list[i]=list[i+1];
                    list[i+1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false){
                System.out.println("Array may be sorted and next pass not needed ");
                break;
        }
            System.out.println("list after the" + k + "sort");
            for (int j =0; j < list.length; j ++){
                System.out.println(list[j]+ "\t");
            }
            System.out.println();
        }



    }
}
