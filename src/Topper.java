import java.util.Scanner;

public class Topper {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int mark=scanner.nextInt();
        int oddsum=0,evensum=0;
        int digit=0;
        while(mark>0){
            digit=mark%10;
            if(digit%2==0)
                evensum+=digit;
            else
                oddsum+=digit;
            mark/=10;
        }
        if(oddsum==evensum)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
