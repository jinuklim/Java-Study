
public class WhileEx {

	public static void main(String[] args) {
	
		
		for(int j=1;j<=5;j++) {
			System.out.println(j);
		}
		
		//위의 for문을 While문으로 변경해보자!!
		
		int j =1;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		
		//do {
		// 
	//} while (조건);
		
		//위의 while문을 do~ while문 형식으로 변경해보자
		
		j=0;
		do {
		j++;
			System.out.println(j);
		} while(j<5);
		
		
		//a~z까지 출력하는 do ~ while문을 작성해보자!!
		
		char a = 'A';
		
		
		
		do {
			System.out.print(a);
			a = (char)(a+1);	
			
			
		}while (a<='Z');
		
		
		
		System.out.println("Hi");
		System.out.print("Java");
		
		}
		
		
	}
	
	


