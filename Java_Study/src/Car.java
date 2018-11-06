

//클래스 = 속성 + 기능

//속성
public class Car {
 
	//Field 부분
	int number; //차량번호
	int speed; //차량속도
	String color; //차량 색깔, 문자열로 표현 (String)
	

	//Method 부분
	//기능 (간단하게 스피드를 올려주고 내려주는 부분만)
	
	public void speedUp() { //speedUp이라는 기능을 가지고 있음 
		speed +=10;
					
	}
	
	
	public void speedDown() {
		speed -=5;
	}

	
	public static void main (String [] args) {   //이것이 Main Method이고 꼭 있어야됨 
		
		Car mycar = new Car(); //클래스를 객체화 할때는 클래스명 참조변수 => new 클래스명 ();
		Car yourCar = new Car();
		
		
		mycar.number=1;
		mycar.speed=10;
		mycar.color="Black";
		
		System.out.println("mycar의 speed: " +mycar.speed); //값은 0이 나옴
		mycar.speedUp(); //speedUp에서 +10이 됨
		
		System.out.println(mycar.speed);
		System.out.println(mycar.number);
		System.out.println(mycar.color);
		
		yourCar.speed=50;
		System.out.println("yourCar의 speed: " +yourCar.speed);
		yourCar.speedUp();
		yourCar.speedDown();
		System.out.println(yourCar.speed);
		
		
		
		
	}
}



