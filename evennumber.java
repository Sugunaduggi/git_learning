import java.util.Scanner;
class evennumber{
    public static void main(String main[]){
        
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = number%2;
        if(result==0){
            System.out.println("even number");

        }
        else {
            System.out.println("odd number");
        }


    }
}