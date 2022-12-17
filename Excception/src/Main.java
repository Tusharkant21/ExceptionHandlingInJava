public class Main {
  //exception handling
    public static void main(String[] args) {
        final int j=9;
        int arr[]={1,2,3,4,5};
        System.out.println("this will print");

        try{

            System.out.println(arr[5]);
            int a=5/0;

        }

    catch (ArithmeticException e){
        System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("compulsory");
        }
        System.out.println("will not print this");
    }
}