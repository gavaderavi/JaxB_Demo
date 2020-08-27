package Demo;

import JaxB.EmployeeJaxB;
public class Main {

	public static void main(String[] args) {
		
		EmployeeJaxB ob=new EmployeeJaxB();
		ob.marshall();
		ob.unMarshall();
			
	}
}
