package test_rla;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] queue = new char[5];
		int rear = 0;

		char carName = 'A';
		int select = 9;

		while (select != 3) {
			System.out.printf("\n<1> 자동차 넣기 <2> 자동차 빼기 <3> 끝 :");
			select = s.nextInt();

			switch (select) {
			case 1:
				if (rear >= 5) {
					System.out.printf("터널이 꽉 차서 차가 못 들어감\n" );
				} else {
					queue[rear] = carName++;
					rear++;
	            }
				System.out.printf("현재 자동차 ==> ");
				for (int i = 0; i < 5; i++)
					System.out.printf(" %c", queue[i]);
				break;
			case 2:
				if (rear <= 0) {
					System.out.printf("빠져나갈 자동차가 없음\n");
				} else {
					for (int i = 0; i < 4; i++)
						queue[i] = queue[i + 1];
					rear--;

				}
				System.out.printf("현재 자동차 ==> ");
				for (int i = 0; i < 5; i++)
					System.out.printf(" %c", queue[i]);
				break;

			case 3:
				System.out.printf("현재 자동차 ==> ");
	            for (int i = 0; i < 5; i++)
	            System.out.printf(" %c", queue[i]);
	            System.out.printf("\n프로그램을 종료합니다.\n");
	            break;


	         }
	      }

	}

}
