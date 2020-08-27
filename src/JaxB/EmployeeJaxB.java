package JaxB;

import java.io.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import javax.xml.transform.Result;

public class EmployeeJaxB {

	public void marshall() {

		try {
			System.out.println("\n------------------------------Marshalling-------------------------\n");
			Employee emp = new Employee("123", "Ravi", "Pune", 20000);
			JAXBContext cb=JAXBContext.newInstance(Employee.class);
			Marshaller ma=cb.createMarshaller();
			ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			ma.marshal(emp, System.out);
			ma.marshal(emp, new File("src\\Data\\Employee.xml"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void unMarshall() {
		try {
			System.out.println("\n----------------------------Unmarshalling---------------------------\n");
			JAXBContext cb=JAXBContext.newInstance(Employee.class);
			Unmarshaller um=cb.createUnmarshaller();
			Employee em=(Employee) um.unmarshal(new File("src\\Data\\Employee.xml"));
			System.out.println("Id: "+em.getId()
			+"\nName: "+em.getName()
			+"\nAddress: "+em.getAddress()
			+"\nSalary: "+em.getSalary());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
