
public class Runner {

	public static void main(String[] args) {
		linkedList a=new linkedList();
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		a.delete(0);
		a.show();
System.out.println();
		a.insertAtStart(100);
		a.insertAt(2, 78);
		a.show();
		
	}

}
