/*������� : break, continue
 * �ܵ����� ����� �� ����.
 * ����� �Բ� ����Ѵ�.
 * ��� -> ���ǹ� �ݺ��� ���
 */


public class ContinueBreak {

	public static void main(String[] args) {
		
		//Break ��
		for(int i =0; i<5; i++) {
			if(i==3) break;
			System.out.println("i=" +i);
			/* i=0 �϶� 0 ���
			 * i=1 �϶� 1 ��� 
			 * i=2 �϶� 2���
			 * i=3�϶� ������ �����ϱ� �������� �������� �ʰ� �ٷ� �������� 
			 */
			
			
			
		}
		//continue�� -->����ؼ� �ݺ����� �����϶�
		
		for(int i =0; i<5; i++) {
			if(i==3) continue;
			System.out.println("i=" +i);
		
			/* i=0 �϶� 0 ���
			 * i=1 �϶� 1 ��� 
			 * i=2 �϶� 2���
			 * i=3 �̸� ��Ƽ�� �ؼ� 3�� ��� �ǰ�
			 * i=4 �� �ǰ� 4 ���
			 * 
			 */
		
			
			
				for(int q = 0; q<3; q++) {
					for (int k=0; k<3 ; k++) {
						if (k==1) break;
						System.out.println("i+"+q+", k="+k);
					
						
						
						// k�� 1�� �����ϴ� ���� �ٷ� ��������
					}
				}

				System.out.println("+++++++++++++");
				
				for(int q = 0; q<3; q++) {
					for (int k=0; k<3 ; k++) {
						if (k==1) continue;
						System.out.println("q="+q+", k="+k);

						//q�� 0�϶� k=0, k=1�̾�� �Ǵµ� continue�� ���ؼ� �ٽ� k�� ���� �Ǿ� k=2�� �ǰ�
						//�ٽ� q=1�� ��
						//continue�� ��ŵ ����̶�� ���� ��
						
	}
				}
					System.out.println("++++++break ���̺�+++++++");
				out : //���̺��
				for(int q = 0; q<3; q++) {
					for (int k=0; k<3 ; k++) {
						if (k==1) break out;  //������ �̵��ϴ� ���� �ƴ϶� ����ǥ�� �̵��� �϶� 
						// out�� ���� ����� �ݺ����� ����� 
						System.out.println("q="+q+", k="+k);

						//k�� 1�϶� ������ �������� ���� out�̶�� ������ ���� ������
						
}
					System.out.println("++++++continue ���̺�+++++++");
				}
							out : //���̺��
							for(int r = 0; r<3; r++) {
								for (int k=0; k<3 ; k++) {
									if (k==1) continue out;  //������ �̵��ϴ� ���� �ƴ϶� ����ǥ�� �̵��� �϶� 
									// out�� ���� ����� �ݺ����� �����϶�
									System.out.println("q="+r+", k="+k);

									//k�� 1�϶� ������ �������� ���� out�̶�� ������ ���� ������
	}
}
	}
}
}
