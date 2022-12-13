package test_rla;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("처리할 수를 입력하세요: ");
        a = s.nextInt();

        if (a > 0)
            System.out.printf("입력한 수는 + 입니다.\n");

        if (a < 0)
            System.out.printf("입력한 수는 - 입니다.\n");

        if (a == 0)
            System.out.printf("입력한 수는 0 입니다.\n");



    }
}	
