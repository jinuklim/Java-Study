/*보조제어문 : break, continue
 * 단독으로 사용할 수 없다.
 * 제어문과 함께 사용한다.
 * 제어문 -> 조건문 반복문 등등
 */


public class ContinueBreak {

	public static void main(String[] args) {
		
		//Break 문
		for(int i =0; i<5; i++) {
			if(i==3) break;
			System.out.println("i=" +i);
			/* i=0 일때 0 출력
			 * i=1 일때 1 출력 
			 * i=2 일때 2출력
			 * i=3일때 조건이 맞으니깐 다음문장 실행하지 않고 바로 빠져나옴 
			 */
			
			
			
		}
		//continue문 -->계속해서 반복문을 실행하라
		
		for(int i =0; i<5; i++) {
			if(i==3) continue;
			System.out.println("i=" +i);
		
			/* i=0 일때 0 출력
			 * i=1 일때 1 출력 
			 * i=2 일때 2출력
			 * i=3 이면 컨티뉴 해서 3이 출력 되고
			 * i=4 가 되고 4 출력
			 * 
			 */
		
			
			
				for(int q = 0; q<3; q++) {
					for (int k=0; k<3 ; k++) {
						if (k==1) break;
						System.out.println("i+"+q+", k="+k);
					
						
						
						// k가 1을 만족하는 순간 바로 빠져나옴
					}
				}

				System.out.println("+++++++++++++");
				
				for(int q = 0; q<3; q++) {
					for (int k=0; k<3 ; k++) {
						if (k==1) continue;
						System.out.println("q="+q+", k="+k);

						//q가 0일때 k=0, k=1이어야 되는데 continue로 인해서 다시 k값 증가 되어 k=2가 되고
						//다시 q=1이 됨
						//continue는 스킵 기능이라고 보면 됨
						
	}
				}
					System.out.println("++++++break 레이블+++++++");
				out : //레이블명
				for(int q = 0; q<3; q++) {
					for (int k=0; k<3 ; k++) {
						if (k==1) break out;  //밑으로 이동하는 것이 아니라 꼬리표로 이동을 하라 
						// out과 가장 가까운 반복문을 벗어나라 
						System.out.println("q="+q+", k="+k);

						//k가 1일때 밑으로 내려가지 말고 out이라는 곳으로 빠져 나가라
						
}
					System.out.println("++++++continue 레이블+++++++");
				}
							out : //레이블명
							for(int r = 0; r<3; r++) {
								for (int k=0; k<3 ; k++) {
									if (k==1) continue out;  //밑으로 이동하는 것이 아니라 꼬리표로 이동을 하라 
									// out과 가장 가까운 반복문을 실행하라
									System.out.println("q="+r+", k="+k);

									//k가 1일때 밑으로 내려가지 말고 out이라는 곳으로 빠져 나가라
	}
}
	}
}
}
