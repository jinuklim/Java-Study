
public class For {

	public static void main(String[] args) {
		
		
		// 5번 출력 하고 싶을 때 
		System.out.println("Hello java!!");
		System.out.println("Hello java!!");
		System.out.println("Hello java!!");
		System.out.println("Hello java!!");
		System.out.println("Hello java!!");
		
		
		//for문 이용해서 5번 출력 
		for(int i=0; i<5 ; i++)
		{
			System.out.println("Hello java!!");
		}
		
		// for 문이 끝나는 순간 i는 끝남. 그래서 i는 값이 없어짐 i를 새로 설정해줘야댐
		// 이때 i는 지역변수라고 함. for 루프를 벗어나면 
		
		int i =5; //여기에 i는 마지막 끝날때까지 살아있음
		for(;i>=0;i--) //초기문은 위에서 선언했기 때문에 구지 안써도 됨
		{
			System.out.println("Hello java!!");
		}
		System.out.println("i="+i);
		
		//이땐 i가 나옴 왜냐면 for문 안에 포함이 안되기 때문에
		// 그리고 i의 값이 -1인 이유는 for문을 거쳐서 값이 변경됨
		
//		for(;;) {
//			System.out.println("무한반복"); //실행시킨후 오른쪽 빨간색 버튼 눌러서 중지 시킴
//		}
		
		
		//1부터 10까지의 합
		int sum=0;
		for (int j=1;j<=10;j++) {
		sum+=j;	//sum=sum+j
		}
		System.out.println(sum);
		
		
		
		//0~100까지의 수에서 짝수의 합을 구해보자!!
		
		int sum2=0;
		
		for(int j=0 ; j<=100 ; j++) {
			if(j%2==00) { //2로 나눴을때 나머지가 0이라는 뜻 --> 짝수
				System.out.println(sum2+"+"+j);
				sum2=sum2+j;
				
		}
		}
	
		System.out.println("1부터 100까지의 합 :"+sum2); //
		
	} //i의 생명은 여기까지 d

}
