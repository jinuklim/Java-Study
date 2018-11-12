//한파일안에는 public class는 하나만 존재해야한다.

//public 타입을 가지는 클래스의 이름을 파일명으로 한다.
//main() 메소드를 가지는 클래스에 public 타입을 정해준다.


class CarDemo{
	//변수 (Variable)
	
	// 1)멤버변수
	// (1) 클래스 변수 : static 변수  or 공유변수
	// (2) 인스턴스 변수 : instance variable (static이 붙지 않은 변수 - non-static)
	//     클래스변수와 인스턴스 변수를 멤버변수라고 한다.
	
	// 2) 지역변수 (local 변수) : 메소드 블럭안에 선언된 변수. 메소드의 블럭이 끝나는 순간 생명을 다한다.
	                      
	
	// 아래것들이 인스턴트 변수 (멤버변수)
    
	//멤버변수는 초기화를 하지 않을 경우 default 값이 들어간다
	// ex) int default 값 => 0,  string default => null
	//지역변수는 초기화를 해야한다.
	static String kind ;    
    int number;  //값을 선언만 했지 초기화일 경우 값은 0
	int speed;
	String color;
		
	
	
	// 생성자 : 인스턴스(객체)를 생성할때 호출
	// - 생성자의 이름 : 해당클래스의 명과 동일해야함
	// - 메소드와 비슷하나 반환타입이 없어야 한다.
	// - 멤버변수를 초기화 할때 사용
	
		
	//지역변수이기때문에 
	public CarDemo () {
		kind = "소형차";
		int aa = 20; //지역변수 aa는 이 생성자 안에서만 유효하다.
		
	}
	// 여기까지가 끝
	
	
	
	// Method 기능
	public static void kind() {

//		System.out.println("소형차입니다");
		
		System.out.println(kind);
	}
	public void speedUp () {
		number = 9;
     	speed +=10;
	}

	public void speedDown() {
		
		speed -=5;
		
		}
	
}
//여기까지가 Class CarDemo




public class CarTest {

	static String kind1;
	
	
	public static void main(String[] args) {
		//클래스는 사용자 정의 타입이다.
		CarDemo myCar = new CarDemo(); //인스턴스 생성
		myCar.color = "White";
		CarDemo yourCar = new CarDemo();
		

		//클래스 변수 호출 : 클래스명.변수명
		System.out.println("클래스변수 kind : "+CarDemo.kind); //외부 클래스는 CarDemo.kind
		
		//같은 클래스 내에 있는 클래스변수를 호출할 경우는 클래스명을 생략할 수 있다.
		System.out.println(kind1); 
		
		//인스턴스 변수의 호출 : 인스턴스를 생생한 후에 호출할 수 있다.
		//인스턴스명(객체명, 참조변수).변수
		
		System.out.println("인스턴스변수 color : "+myCar.color);
		System.out.println("인스턴스변수 color : "+yourCar.color);
		//멤버변수는 초기화를 안해서 default값이 들어간다.
		// 지역변수는 꼭 초기화를 해야한다.
		
		CarDemo.kind();
		
		//static 이라는 것도 공유변수이다.
		myCar.kind ="중형차";
		System.out.println("------------------");
		System.out.println("myCar의 차종류 : "+CarDemo.kind);
		System.out.println("yourCar의 차종류 : "+CarDemo.kind);
		
		
		
		
		
		//지역변수
		int c = 100;
				
		System.out.println("지역변수 : "+c);
		
		
		//aa라는 지역변수는 위에서 끝남
//		System.out.println("지역변수 : "+myCar.aa);
	
		
		//멤버 메소드의 호출 : 인스턴스를 생성한 후에 호출이 가능하다. 참조변수명.메소드명
		
		System.out.println("myCar의 스피드 : " +myCar.speed);  //초기값 0
		myCar.speedUp();
		myCar.speedUp();
		System.out.println("myCar의 스피드 : " +myCar.speed);
		myCar.speedDown();
		
		System.out.println("---------------");
		System.out.println("yourCar의 스피드 : " +yourCar.speed);
		yourCar.speedUp();
		System.out.println("myCar의 스피드 : " +myCar.speed);
		
		//클래스 메소드 호출 : 클래스명.메소드명 (인스턴스를 생성할 필요가 없다)
		//클래스 메소드 안에는 클래스 변수만을 사용할 수 있다.
		
		CarDemo.kind();
		 
		 
		
	}

}
