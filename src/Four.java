import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        int nub1;
        int input1;
        for (int i = 2,win =0; i >= 0;) {
            if (win==3){
                System.out.println("Ти перміг");
                break;
            }
            else if (i==0){
                System.out.println("Ви проіграли");
                break;
            }
            nub1 = (int) (Math.random() * 3 + 1);
            System.out.println("Ведіть число:");
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()){
                input1 = input.nextInt();
                if (input1 == nub1) {
                    System.out.println("Попав");
                    win++;
                    continue;
                }
                else{
                    System.out.println("Промахнувся");
                    i--;
                    continue;}
            }
            else
                System.out.println("Не дробове");
                break;
        }
    }
}