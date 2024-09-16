public class Reduce {
    public static void main(String[] args) {


        int steps = 0;
        int i = 100;

        boolean isEven = i % 2 == 0;
        boolean isOdd = i % 2 == 1;

        while (i != 0){
            if (isEven) {
                i = i / 2;
                steps++;
            } else if (isOdd) {
                i--;
                steps++;
            }
        }

        System.out.println(steps);
    }
}
