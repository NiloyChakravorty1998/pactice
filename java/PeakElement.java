public class PeakElement {
    public static void main(String[] args) {
        System.out.println(getPeakElement(new int[] {1,10,1,20,19}));
    }

    public static int getPeakElement(int [] elements) {
        int peak = 0;
        for (int i =1; i < elements.length-1; i++ ) {
            int left = elements[i-1];
            int right = elements[i+1];
            int center = elements[i];
            if(center > left && center > right && center > peak){
                peak = center;
            }
        }
        return peak;
    }
}
