package multiThreading;

class Thread1 extends Thread {
	public synchronized void run(){
		for(int i=0;i<2;i++){
			System.out.println("this is the "+i+" thread of first class");
		}
	}
}
class Thread2 extends Thread {
	public synchronized void run(){
		for(int i=0;i<2;i++){
			System.out.println("this is the "+i+" thread of second class");
		}
	}
}

/*class Thread3 implements Runnable {
	public synchronized void run(){
		for(int i=0;i<2;i++){
			System.out.println("this is the "+i+" thread of third class");
		}
	}
}*/

public class multipleThreads {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 tObj1=new Thread1();
		Thread1 tObj2=new Thread1();
		
		Thread2 tObj3=new Thread2();
		Thread2 tObj4=new Thread2();
		
		//Runnable rObj5=new Thread3();
		//Thread tObj5=new Thread(rObj5);
		
	//	Runnable rObj6=new Thread3();
	//	Thread tObj6=new Thread(rObj6);
		tObj1.start();
		tObj2.start();
		tObj3.start();
		tObj4.start();

	//	tObj5.start();
		//tObj6.start();
	}

}
