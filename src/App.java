import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int senha =sc.nextInt();
            System.out.println(senha-1);
        }

        sc.close();
    }
}
