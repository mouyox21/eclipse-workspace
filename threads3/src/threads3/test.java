package threads3;

public class test {

	public static void main(String[] args)  throws InterruptedException {
		BankAccount1 bankAccount = new BankAccount1(10000);

        UserThread[] userThreads = {
            new UserThread(bankAccount, "deposit", 500),
            new UserThread(bankAccount, "deposit", 1000),
            new UserThread(bankAccount, "withdraw", 2000),
            new UserThread(bankAccount, "withdraw", 1000)
        };
        
        
        System.out.println("hahow"+bankAccount.getBalance());

      /*  for (UserThread thread : userThreads) {
            thread.start();
        }

        for (UserThread thread : userThreads) {
            thread.join();
        }*/
        
        for (int i = 0; i < userThreads.length; i++) {
        	userThreads[i].run();
			
		}
        for (int i = 0; i < userThreads.length; i++) {
        	userThreads[i].join();
			
		}

        System.out.println("Final balance: " + bankAccount.getBalance());
    }


	

}
