package lab1;

public class Multiples {

    public static void main(String[] args) {
        //total integer
        int total = 0;

        for (int i = 1; i < 1000; i++){

            //boolean statements
            boolean divisibleby3 = i % 3 == 0;
            boolean divisibleby5 = i % 5 == 0;

            //body of code
            if (divisibleby3){
                total++;
            } else if (divisibleby5){
                total++;
            }
        }
        System.out.println(total);
    }

}
