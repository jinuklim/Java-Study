
public class For {

	public static void main(String[] args) {
		
		
		// 5�� ��� �ϰ� ���� �� 
		System.out.println("Hello java!!");
		System.out.println("Hello java!!");
		System.out.println("Hello java!!");
		System.out.println("Hello java!!");
		System.out.println("Hello java!!");
		
		
		//for�� �̿��ؼ� 5�� ��� 
		for(int i=0; i<5 ; i++)
		{
			System.out.println("Hello java!!");
		}
		
		// for ���� ������ ���� i�� ����. �׷��� i�� ���� ������ i�� ���� ��������ߴ�
		// �̶� i�� ����������� ��. for ������ ����� 
		
		int i =5; //���⿡ i�� ������ ���������� �������
		for(;i>=0;i--) //�ʱ⹮�� ������ �����߱� ������ ���� �Ƚᵵ ��
		{
			System.out.println("Hello java!!");
		}
		System.out.println("i="+i);
		
		//�̶� i�� ���� �ֳĸ� for�� �ȿ� ������ �ȵǱ� ������
		// �׸��� i�� ���� -1�� ������ for���� ���ļ� ���� �����
		
//		for(;;) {
//			System.out.println("���ѹݺ�"); //�����Ų�� ������ ������ ��ư ������ ���� ��Ŵ
//		}
		
		
		//1���� 10������ ��
		int sum=0;
		for (int j=1;j<=10;j++) {
		sum+=j;	//sum=sum+j
		}
		System.out.println(sum);
		
		
		
		//0~100������ ������ ¦���� ���� ���غ���!!
		
		int sum2=0;
		
		for(int j=0 ; j<=100 ; j++) {
			if(j%2==00) { //2�� �������� �������� 0�̶�� �� --> ¦��
				System.out.println(sum2+"+"+j);
				sum2=sum2+j;
				
		}
		}
	
		System.out.println("1���� 100������ �� :"+sum2); //
		
	} //i�� ������ ������� d

}
