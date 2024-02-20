import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = scan.nextInt();
        int [] elements = new int[n];
        for(int i = 0; i < n; i++){
            elements[i] = scan.nextInt();
        }
        String num = "";
        for(int i : elements) {
            int unitDigit = i % 10;
            num = num + unitDigit;
        }
        if(Integer.valueOf(num) % 5 ==0){
            System.out.println("Divisible by 5");
        }
        else {
            System.out.println("Not divisible by 5");
        }
    }
}