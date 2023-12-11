public class Fibonacci {
    public static void main(String[] args) {
        printFiboSeries(10);
    }

    public static void printFiboSeries(int limit){
        int first =0;
        int second =1;

        for (int i =0; i<=limit;i++){
            System.out.println(first);
            int next = first + second;
            first= second;
            second=next;
        }
    }
}
