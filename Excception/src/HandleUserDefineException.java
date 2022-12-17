import java.util.Scanner;

public class HandleUserDefineException {
    public static void main(String[] args) throws Math,Exception{
        Scanner sc = new Scanner(System.in);
        int amount=5000;
        int withdraw=sc.nextInt();

        if(withdraw>amount) {
            try{
            throw new Math("Insufficient Balance");
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

        System.out.println("hey you have  handle the exception");






    }

}

