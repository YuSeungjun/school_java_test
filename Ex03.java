package test_rla;


public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int hap = 0;
        int i;
        int odd_hap = 0;
        int even_hap = 0;


        for (i = 1; i <= 10; i++) {
            hap += i;
        }
        for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				odd_hap += i;
			} else {
				even_hap += i;
			}
		}
        System.out.printf(" 1에서 10까지의 합: %d \n", hap);
        System.out.printf(" 1에서 10까지의 짝수 합: %d \n", odd_hap);
        System.out.printf(" 1에서 10까지의 홀수 합: %d \n", even_hap);
	}

}
