
public class Switch {

	public static void main(String[] args) {
		
		if(true); 
		if(true) 
			System.out.println("참이다"); //true일 경우 참이다.
		
		if(false)  
			System.out.println("거짓이다");
		
		
		
		if(false) {  //만약 false이면 참입니다가 나오는데 아니니깐 거짓이다!! 가 나옴
			System.out.println("참입니다!!!");  
		}else	{
			System.out.println("거짓이다!!");
		}
		
		
		//다중 if문
		int jumsu = 59;
		//학점 A B
		
		
		//학점을부여하기 위한 변수 공백으로 초기화
		char hakjum = ' ';
		
		if(jumsu >= 90) hakjum = 'A';
		else if (jumsu >= 80) hakjum = 'B';
		else if (jumsu >= 70) hakjum = 'C';
		else if (jumsu >= 60) hakjum = 'D';
		else hakjum = 'F';
		
		
		
		System.out.println("당신의 학점은" +hakjum+"이다");
		
		
		
		
		//삼항연산자를 이용해서 위의 다중 if문을 바꿔보자
		
		hakjum =(jumsu>=90)? 'A': ((jumsu>=80)? 'B' : 'C'); 
		//90점 이상인 경우 A이고 그렇지 않으면 ((jumsu>=80)? 'B' : 'C') 이다.
		
		System.out.println("당신의 학점은" +hakjum+"이다");
		
		
		//Switch문
		
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
				
		System.out.println("당신의 학점은" +hakjum2+"이다");  // avg가 82라 값이 안나옴
		
		
		
	} // End of main

} // 클래스의 끝
