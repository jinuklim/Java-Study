

//Ŭ���� : �Ӽ� + ���

public class CarEx {

	// Field �Ӽ�
	
	int number;  //���� ���� ���� �ʱ�ȭ�� ��� ���� 0
	int speed;
	String color;
	
	
	
	// Method ���
	
	public void speedUp () {
		System.out.println("�ӵ��� �ø���!!");
		speed +=10;
	}

	public void speedDown() {
		System.out.println("�ӵ��� ������!!");
		speed -=5;
		
		}
	
	
	
	//Main method
	public static void main(String [] args) {
		int number2;
		
		CarEx myCar = new CarEx (); //Ŭ������ ��üȭ �Ҷ��� Ŭ������ ��������  = new Ŭ������ ();
		CarEx yourCar = new CarEx ();
		myCar.number = 1;
		myCar.speed = 10;
		myCar.color = "Black";
		
			
		
		
		myCar.speed=10;
		System.out.println("myCar�� Speed: " +myCar.speed);
 		myCar.speedUp();
 		System.out.println(myCar.number);
 		System.out.println(myCar.speed);
 		System.out.println(myCar.color);
 		
 		
 		myCar.speed=50;
 		System.out.println("yourCar�� Speed: " +yourCar.speed);
 		myCar.speedUp();
 		myCar.speedDown();
 		System.out.println(yourCar.speed);
		
	}
}


