package lab1;

public class Multiples {

    public static void main(String[] args) {
        //count method
        System.out.println(multiples());
    }

    static int multiples() {
        int total = 0;

        for (int i = 1; i < 1000; i++){

            boolean divisibleby3 = i % 3 == 0;
            boolean divisibleby5 = i % 5 == 0;

            if (divisibleby3){
                total++;
            } else if (divisibleby5){
                total++;
            }
        }
        return total;
    }

    static int multiples(int n, int a, int b) {
        //total integer
        int total = 0;

        for (int i = 1; i < n; i++){

            //boolean statements
            boolean divisiblebya = i % a == 0;
            boolean divisiblebyb = i % b == 0;

            //body of code
            if (divisiblebya){
                total++;
            } else if (divisiblebyb){
                total++;
            }
        };
        return total;
    }

}
