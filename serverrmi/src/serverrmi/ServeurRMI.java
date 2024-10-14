package serverrmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServeurRMI {

	public static void main(String[] args) {
		try {
			SommeImpl od = new SommeImpl();
						
			LocateRegistry.createRegistry(9900);
			
		
			System.out.println("f");
			Naming.rebind("rmi://localhost:9900/ia", od);
			System.out.println("publié");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
