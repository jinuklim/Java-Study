
public class ArrayEx1 {

	public static void main(String[] args) {
	
		
		
		//배열선언
		int a []; 
		
		//배열생성 (메모리에 할당)
		a = new int[3];
		
		//초기화
//		a[0] = 100;   방만 생성하고 값을 입력하지 않으면 0값이 나옴
		a[1] = 200;
		a[2] = 300;
		
	
	System.out.println("배열 a[1] = "+a[0]);
	System.out.println("배열 a[2] = "+a[1]);
	System.out.println("배열 a[3] = "+a[2]);
	
	//length 배열의 길이를 알고자 할 때
	System.out.println("배열 a의 크기는 : "+a.length);
	
	int i [] = {100, 200, 300, 400};
	
	System.out.println("배열 i[0] : "+i[0]);
	System.out.println("배열 i[1] : "+i[1]);
	System.out.println("배열 i[2] : "+i[2]);
	System.out.println("배열 i[3] : "+i[3]);
	System.out.println("배열 a의 크기는 : "+a.length);
	
	}
	
}
