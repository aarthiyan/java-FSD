package assign;

public class threadclass implements Runnable{
	 public void run() {  
	        System.out.println("Thread has ended");  
	    }  
	   
	    public static void main(String[] args) {  
	    	threadclass ex = new threadclass ();  
	        Thread t1= new Thread(ex);  
	        t1.start();  
	        System.out.println("Hi");  
	    }  
	}

