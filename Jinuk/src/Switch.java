
public class Switch {

	public static void main(String[] args) {
		
		if(true); 
		if(true) 
			System.out.println("���̴�"); //true�� ��� ���̴�.
		
		if(false)  
			System.out.println("�����̴�");
		
		
		
		if(false) {  //���� false�̸� ���Դϴٰ� �����µ� �ƴϴϱ� �����̴�!! �� ����
			System.out.println("���Դϴ�!!!");  
		}else	{
			System.out.println("�����̴�!!");
		}
		
		
		//���� if��
		int jumsu = 59;
		//���� A B
		
		
		//�������ο��ϱ� ���� ���� �������� �ʱ�ȭ
		char hakjum = ' ';
		
		if(jumsu >= 90) hakjum = 'A';
		else if (jumsu >= 80) hakjum = 'B';
		else if (jumsu >= 70) hakjum = 'C';
		else if (jumsu >= 60) hakjum = 'D';
		else hakjum = 'F';
		
		
		
		System.out.println("����� ������" +hakjum+"�̴�");
		
		
		
		
		//���׿����ڸ� �̿��ؼ� ���� ���� if���� �ٲ㺸��
		
		hakjum =(jumsu>=90)? 'A': ((jumsu>=80)? 'B' : 'C'); 
		//90�� �̻��� ��� A�̰� �׷��� ������ ((jumsu>=80)? 'B' : 'C') �̴�.
		
		System.out.println("����� ������" +hakjum+"�̴�");
		
		
		//Switch��
		
		int kor = 90, math = 80, eng=70;
		
		char hakjum2 = ' ';
		
		int total = kor + math + eng;
		int avg = total/3;
		
		
		System.out.println(avg);
		switch(avg/10) {
		case 10: 
		case 9:
			hakjum2 = 'A';
			break;
		case 8:
			hakjum2 = 'B';
			break;
		case 7:
			hakjum2 = 'C';
			break;
		case 6:
			hakjum2 = 'D';
			break;
		default :
			hakjum2 = 'F';
		
			
	    
		}
				
		System.out.println("����� ������" +hakjum2+"�̴�");  // avg�� 82�� ���� �ȳ���
		
		
		
	} // End of main

} // Ŭ������ ��
