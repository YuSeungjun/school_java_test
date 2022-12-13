package test_rla;

interface Animal{
	abstract void bear();
}
interface Fish{
	abstract void swim();
}
class Whale implements Animal, Fish{
	public void bear() {
		System.out.println("고래는 새끼를 낳습니다.");
	}
	public void swim() {
		System.out.println("고래는 물속에서 삽니다.");
	}
}

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whale tank1 = new Whale();
		tank1.bear();
		tank1.swim();
	}

}
