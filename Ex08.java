package test_rla;

class Book{
	Book(){
		System.out.println("Book 클래스 생성자 ~~ (파라미터 없음)");
	}
	Book(String pa){
		this();
		System.out.println("Book 클래스 생성자 -->"+pa);
	}
}

class ComputerBook extends Book{
	ComputerBook(String pa) {
		super(pa);
		System.out.println("ComputerBook 클래스 생성자 ~~");
	}
}


public class Ex08 {

	public static void main(String[] args) {
		ComputerBook sedan1 = new ComputerBook("굿 자바");

	}

}
