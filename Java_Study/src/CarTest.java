//�����Ͼȿ��� public class�� �ϳ��� �����ؾ��Ѵ�.

//public Ÿ���� ������ Ŭ������ �̸��� ���ϸ����� �Ѵ�.
//main() �޼ҵ带 ������ Ŭ������ public Ÿ���� �����ش�.


class CarDemo{
	//���� (Variable)
	
	// 1)�������
	// (1) Ŭ���� ���� : static ����  or ��������
	// (2) �ν��Ͻ� ���� : instance variable (static�� ���� ���� ���� - non-static)
	//     Ŭ���������� �ν��Ͻ� ������ ���������� �Ѵ�.
	
	// 2) �������� (local ����) : �޼ҵ� ���ȿ� ����� ����. �޼ҵ��� ���� ������ ���� ������ ���Ѵ�.
	                      
	
	// �Ʒ��͵��� �ν���Ʈ ���� (�������)
    
	//��������� �ʱ�ȭ�� ���� ���� ��� default ���� ����
	// ex) int default �� => 0,  string default => null
	//���������� �ʱ�ȭ�� �ؾ��Ѵ�.
	static String kind ;    
    int number;  //���� ���� ���� �ʱ�ȭ�� ��� ���� 0
	int speed;
	String color;
		
	
	
	// ������ : �ν��Ͻ�(��ü)�� �����Ҷ� ȣ��
	// - �������� �̸� : �ش�Ŭ������ ��� �����ؾ���
	// - �޼ҵ�� ����ϳ� ��ȯŸ���� ����� �Ѵ�.
	// - ��������� �ʱ�ȭ �Ҷ� ���
	
		
	//���������̱⶧���� 
	public CarDemo () {
		kind = "������";
		int aa = 20; //�������� aa�� �� ������ �ȿ����� ��ȿ�ϴ�.
		
	}
	// ��������� ��
	
	
	
	// Method ���
	public static void kind() {

//		System.out.println("�������Դϴ�");
		
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
//��������� Class CarDemo




public class CarTest {

	static String kind1;
	
	
	public static void main(String[] args) {
		//Ŭ������ ����� ���� Ÿ���̴�.
		CarDemo myCar = new CarDemo(); //�ν��Ͻ� ����
		myCar.color = "White";
		CarDemo yourCar = new CarDemo();
		

		//Ŭ���� ���� ȣ�� : Ŭ������.������
		System.out.println("Ŭ�������� kind : "+CarDemo.kind); //�ܺ� Ŭ������ CarDemo.kind
		
		//���� Ŭ���� ���� �ִ� Ŭ���������� ȣ���� ���� Ŭ�������� ������ �� �ִ�.
		System.out.println(kind1); 
		
		//�ν��Ͻ� ������ ȣ�� : �ν��Ͻ��� ������ �Ŀ� ȣ���� �� �ִ�.
		//�ν��Ͻ���(��ü��, ��������).����
		
		System.out.println("�ν��Ͻ����� color : "+myCar.color);
		System.out.println("�ν��Ͻ����� color : "+yourCar.color);
		//��������� �ʱ�ȭ�� ���ؼ� default���� ����.
		// ���������� �� �ʱ�ȭ�� �ؾ��Ѵ�.
		
		CarDemo.kind();
		
		//static �̶�� �͵� ���������̴�.
		myCar.kind ="������";
		System.out.println("------------------");
		System.out.println("myCar�� ������ : "+CarDemo.kind);
		System.out.println("yourCar�� ������ : "+CarDemo.kind);
		
		
		
		
		
		//��������
		int c = 100;
				
		System.out.println("�������� : "+c);
		
		
		//aa��� ���������� ������ ����
//		System.out.println("�������� : "+myCar.aa);
	
		
		//��� �޼ҵ��� ȣ�� : �ν��Ͻ��� ������ �Ŀ� ȣ���� �����ϴ�. ����������.�޼ҵ��
		
		System.out.println("myCar�� ���ǵ� : " +myCar.speed);  //�ʱⰪ 0
		myCar.speedUp();
		myCar.speedUp();
		System.out.println("myCar�� ���ǵ� : " +myCar.speed);
		myCar.speedDown();
		
		System.out.println("---------------");
		System.out.println("yourCar�� ���ǵ� : " +yourCar.speed);
		yourCar.speedUp();
		System.out.println("myCar�� ���ǵ� : " +myCar.speed);
		
		//Ŭ���� �޼ҵ� ȣ�� : Ŭ������.�޼ҵ�� (�ν��Ͻ��� ������ �ʿ䰡 ����)
		//Ŭ���� �޼ҵ� �ȿ��� Ŭ���� �������� ����� �� �ִ�.
		
		CarDemo.kind();
		 
		 
		
	}

}
