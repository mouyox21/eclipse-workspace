package clientrmi;
import java.rmi;
public class ClientRMI {

	public static void main(String[] args) {
		
		try
		{
		Somme stub=(Somme) Naming.lookup("rmi://localhost:1098/AA");
		System.out.println(stub.Hello("Issam"));
		System.out.println(stub.add(12, 34));
		} catch (Exception e) {
		e.printStackTrace();
		}}
	}

}
