package lab1;

public class Reduce {
    public static void main(String[] args) {

        System.out.println(reduce());
    }

     static int reduce() {
        //total moves
        int total_moves = 0;

        int i = 100;
        while (i != 0){

            //booleans for even odds
            boolean even = i % 2 == 0;
            boolean odd = i % 2 == 1;

            if (even){
                i = i / 2;
            } else if (odd) {
                i--;
            }

            total_moves++;
        }
        return total_moves;
    }

    static int reduce(int n) {
        //total moves
        int total_moves = 0;

        while (n != 0){

            //booleans for even odds
            boolean even = n % 2 == 0;
            boolean odd = n % 2 == 1;

            if (even){
                n = n / 2;
            } else if (odd) {
                n--;
            }

            total_moves++;
        }
        return total_moves;
    }
}
