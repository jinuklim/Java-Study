
public class WhileEx {

	public static void main(String[] args) {
	
		
		for(int j=1;j<=5;j++) {
			System.out.println(j);
		}
		
		//���� for���� While������ �����غ���!!
		
		int j =1;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		
		//do {
		// 
	//} while (����);
		
		//���� while���� do~ while�� �������� �����غ���
		
		j=0;
		do {
		j++;
			System.out.println(j);
		} while(j<5);
		
		
		//a~z���� ����ϴ� do ~ while���� �ۼ��غ���!!
		
		char a = 'A';
		
		
		
		do {
			System.out.print(a);
			a = (char)(a+1);	
			
			
		}while (a<='Z');
		
		
		
		System.out.println("Hi");
		System.out.print("Java");
		
		}
		
		
	}
	
	


