package serverrmi;

import java.rmi.Naming;

public class ClientRMI {

	public static void main(String[] args) {
		try
		{
		Somme stub=(Somme) Naming.lookup("rmi://localhost:9900/ia");
		System.out.println(stub.Hello("mouad"));
		System.out.println(stub.add(12, 34));
		} catch (Exception e) {
		e.printStackTrace();
		}}

	}


