package multiThreading;


class FirstThread extends Thread {
	public synchronized void run(){
		for(int i=0;i<2;i++){
			
			System.out.println("this is the "+i+" thread of first class");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


}

class SecondThread extends Thread{
	public synchronized void run(){
		for(int i=0;i<2;i++){
			System.out.println("this is the "+i+" thread of third class");
		}
	}
}
public class SleepThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	/*	Runnable rObj=new FirstThread();
		Thread nObj=new Thread(rObj);
		Runnable rObj2=new SecondThread();
		Thread nObj2=new Thread(rObj2);
		*/
		FirstThread fnf=new FirstThread();
		
		SecondThread sns=new SecondThread();
		//nObj.start();
		//nObj2.start();
		fnf.start();
		sns.start();
	}

}
