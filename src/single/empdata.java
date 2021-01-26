package single;

public class empdata {

	public static void main(String[] args) {
		
		employee empdata = new employee();
		empdata.setname("neethu");
		empdata.setage(29);
		empdata.setempID("emp101");
		
		System.out.println(empdata.getage());
		System.out.println(empdata.getname());
		System.out.println(empdata.getempID());
		

	}

}
