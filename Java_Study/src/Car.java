

//Ŭ���� = �Ӽ� + ���

//�Ӽ�
public class Car {
 
	//Field �κ�
	int number; //������ȣ
	int speed; //�����ӵ�
	String color; //���� ����, ���ڿ��� ǥ�� (String)
	

	//Method �κ�
	//��� (�����ϰ� ���ǵ带 �÷��ְ� �����ִ� �κи�)
	
	public void speedUp() { //speedUp�̶�� ����� ������ ���� 
		speed +=10;
					
	}
	
	
	public void speedDown() {
		speed -=5;
	}

	
	public static void main (String [] args) {   //�̰��� Main Method�̰� �� �־�ߵ� 
		
		Car mycar = new Car(); //Ŭ������ ��üȭ �Ҷ��� Ŭ������ �������� => new Ŭ������ ();
		Car yourCar = new Car();
		
		
		mycar.number=1;
		mycar.speed=10;
		mycar.color="Black";
		
		System.out.println("mycar�� speed: " +mycar.speed); //���� 0�� ����
		mycar.speedUp(); //speedUp���� +10�� ��
		
		System.out.println(mycar.speed);
		System.out.println(mycar.number);
		System.out.println(mycar.color);
		
		yourCar.speed=50;
		System.out.println("yourCar�� speed: " +yourCar.speed);
		yourCar.speedUp();
		yourCar.speedDown();
		System.out.println(yourCar.speed);
		
		
		
		
	}
}



