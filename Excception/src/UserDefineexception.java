import java.util.Scanner;

public class UserDefineexception {
    public static void main(String[] args) throws Math,Exception{
        Scanner sc = new Scanner(System.in);
        int amount=5000;
        int withdraw=sc.nextInt();

         if(withdraw>amount) {
             throw new Math("Insufficient Balance");
         }

        System.out.println("hey you have to handle exception");






    }
}


