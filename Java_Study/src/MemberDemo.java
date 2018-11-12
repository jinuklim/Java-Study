
public class MemberDemo {
	
	//클래스 구성요소 : 속성(필드) + 메소드(기능, 생성자)
	
	static int aa; //static 변수
	String str; //인스턴스 변수
	
	
	
	
	//생성자 : static이 붙지 않는다.
	//기본 생성자는 자바 컴파일러가 자동으로 생성해주기 떄문에 생략
	
	
	
	public MemberDemo() {
		
	}
		
//	public MemberDemo(){
//		System.out.println("constructor");
//		
//	}
	
	
	static public void yy() {
		System.out.println("Class method");
	}
	
	public static String yyy() {
		System.out.println("반환값이 있는 클래스 메소드");
		return "반환값";
	}
	
	public void xx() {
		System.out.println("Instance Method1");
	}
	
	public int xxx() {
		System.out.println("반환값이 있는 인스턴스 메소드");
		return 1000;
		
	}

	
	public void zz(String str1) {
		System.out.println("매개변수가 있는 메소드 : "+str1);
	}
	
	
	
	
	public static void main(String[] args) {
		//생성자를 호출해보자 => 객체를 생성한다는 의미
		
		MemberDemo md = new MemberDemo();
		md.xx();
		yy(); //같은 클래스 내에 있는 경우
		
		
		md.zz("파라미터");  //String 타입의 매개변수를 입력해줘야 함
		
		String str2 = yyy();
		System.out.println(str2);
		
		int aa1 = md.xxx();
		System.out.println(aa1);

	}

}
