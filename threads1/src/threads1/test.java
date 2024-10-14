package threads1;

public class test {
	
	public static void main(String[] args) {
		
	    
	    Thread b = new Thread() {
		      public void run() {
		    	  try {
			    	  for (int i = 0; i < 5; i++) {
						
					
			        System.out.println("salut");
			       
						Thread.sleep(2000);}
					}catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			      }
			    };
			    Thread t = new Thread() {
				      public void run() {
				    	  try {
				    	  for (int i = 0; i < 10; i++) {
							
						
				        System.out.println("Bonjour");
				       
							Thread.sleep(1000);}
						}catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				    	  b.start();
				      }
				    };
	    t.start();
	    
	  }

}
