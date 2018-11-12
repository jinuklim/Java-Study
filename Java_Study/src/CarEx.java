

//클래스 : 속성 + 기능

public class CarEx {

	// Field 속성
	
	int number;  //값을 선언만 했지 초기화일 경우 값은 0
	int speed;
	String color;
	
	
	
	// Method 기능
	
	public void speedUp () {
		System.out.println("속도를 올린다!!");
		speed +=10;
	}

	public void speedDown() {
		System.out.println("속도를 내린다!!");
		speed -=5;
		
		}
	
	
	
	//Main method
	public static void main(String [] args) {
		int number2;
		
		CarEx myCar = new CarEx (); //클래스를 객체화 할때는 클래스명 참조변수  = new 클래스명 ();
		CarEx yourCar = new CarEx ();
		myCar.number = 1;
		myCar.speed = 10;
		myCar.color = "Black";
		
			
		
		
		myCar.speed=10;
		System.out.println("myCar의 Speed: " +myCar.speed);
 		myCar.speedUp();
 		System.out.println(myCar.number);
 		System.out.println(myCar.speed);
 		System.out.println(myCar.color);
 		
 		
 		myCar.speed=50;
 		System.out.println("yourCar의 Speed: " +yourCar.speed);
 		myCar.speedUp();
 		myCar.speedDown();
 		System.out.println(yourCar.speed);
		
	}
}


