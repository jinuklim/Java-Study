
public class Mainclass1 {

	
	public static void main (String[] args) {
		
		Childclass child1 = new Childclass();
		child1.name = "jin";
     	child1.gender = "M";
     	child1.age = 18;
     	
     	child1.setInfo("Jin", "M", 20);
     	
		child1.getInfo();
	}
}
