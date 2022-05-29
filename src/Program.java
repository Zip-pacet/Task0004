public class Program {
    public static void main(String[] args) {

        int[] info1 = new int[] {19,18,17,16,15,14,13,12,11,1};
        int[] info2 = new int[] {11,10,9,8,7,6,5,4,3,1};

        boolean[] debug1 = new boolean[] {false, false, true, true, false, false, false, true, true, true};
        boolean[] debug2 = new boolean[] {false, true, true, false, false, true, false, false, false, false};

        System.out.println("Info1:");
        sort(info1, debug1);
        printArr(info1);

        System.out.println("\nInfo2:");
        sort(info2, debug2);
        printArr(info2);
    }
    private static void printArr(int[] info) {
        StringBuilder sb = new StringBuilder("[");

        for (int obj: info) {
            sb.append(obj).append(", ");
        }

        String s = sb.toString().substring(0, sb.length() - 2) + "]";
        System.out.println(s);
    }
    private static <T extends Comparable<T>> void sort(int[] info, boolean[] debug) {

        for(int i = 0; i < info.length; i++) {

            if(debug[i]) {
                continue;
            }
            for(int j = i + 1; j < info.length; j++) {

                if(debug[j]) {
                    continue;
                }
                if(info[i] > info[j]) {

                    int temp = info[i];
                    info[i] = info[j];
                    info[j] = temp;
                }
            }
        }
    }
}
