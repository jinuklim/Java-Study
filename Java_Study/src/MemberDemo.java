
public class MemberDemo {
	
	//Ŭ���� ������� : �Ӽ�(�ʵ�) + �޼ҵ�(���, ������)
	
	static int aa; //static ����
	String str; //�ν��Ͻ� ����
	
	
	
	
	//������ : static�� ���� �ʴ´�.
	//�⺻ �����ڴ� �ڹ� �����Ϸ��� �ڵ����� �������ֱ� ������ ����
	
	
	
	public MemberDemo() {
		
	}
		
//	public MemberDemo(){
//		System.out.println("constructor");
//		
//	}
	
	
	static public void yy() {
		System.out.println("Class method");
	}
	
	public static String yyy() {
		System.out.println("��ȯ���� �ִ� Ŭ���� �޼ҵ�");
		return "��ȯ��";
	}
	
	public void xx() {
		System.out.println("Instance Method1");
	}
	
	public int xxx() {
		System.out.println("��ȯ���� �ִ� �ν��Ͻ� �޼ҵ�");
		return 1000;
		
	}

	
	public void zz(String str1) {
		System.out.println("�Ű������� �ִ� �޼ҵ� : "+str1);
	}
	
	
	
	
	public static void main(String[] args) {
		//�����ڸ� ȣ���غ��� => ��ü�� �����Ѵٴ� �ǹ�
		
		MemberDemo md = new MemberDemo();
		md.xx();
		yy(); //���� Ŭ���� ���� �ִ� ���
		
		
		md.zz("�Ķ����");  //String Ÿ���� �Ű������� �Է������ ��
		
		String str2 = yyy();
		System.out.println(str2);
		
		int aa1 = md.xxx();
		System.out.println(aa1);

	}

}
