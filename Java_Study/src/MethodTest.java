
public class MethodTest {

	int sum(int a, int b) {
	return a+b;
	}
	
	
    public static void main(String[] args) 
    
    {
        int a = 3;
        int b = 4;

        MethodTest myTest = new MethodTest();
        int c = myTest.sum(a, b);
	
        System.out.println(c);
 
	
	}

}
