
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] arrUserInput = new int[5];
        System.out.println("Give elements for array ");
        int i = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while(i<5){
                arrUserInput [i] = sc.nextInt();
                i++;
            }
        }
        int[] array = {1,3,4,2,5,4};
        //System.out.println(array);
        for(int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }
        for(int j = 0; j < arrUserInput.length; j++){
            System.out.println(arrUserInput[j]);
        }
        String [] str = {"Emily", "Ayush","Navel"};
        for (String str1 : str) {
            System.out.println(str1);
        }
        System.out.println(str[1]);
    }
}
