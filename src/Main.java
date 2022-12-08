public class Main {
    public static void main(String[] args) {

        double[] fractionalNums =

                {-1.3, 1.5, -5.3, 8.3, -9.4, 12.3, 20.0, -19.5, 13.2, 31.1, -1.4, 13.5, -15.1, -56.9, 18.4};
        double average = 0.0;
        int count = 0;
        for (int a1 = 0; a1 < fractionalNums.length; a1++) {
            if (fractionalNums[a1] < 0) {


                for (int a2 = a1 + 1; a2 < fractionalNums.length; a2++) {


                    if (fractionalNums[a2] > 0) {
                        average = average + fractionalNums[a2];
                        count++;

                    }

                }
                break;
            }

        }
        System.out.println("average  " + average);
        System.out.println("count  " + count);
        System.out.println("average/count " + average / count);
    }
}

