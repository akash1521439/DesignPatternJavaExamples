package design.creational.singleton;

class Thread1 implements Runnable{
	@Override
	public void run() {
		SingletonDPThreadSafe singletonTs = SingletonDPThreadSafe.getInstance("Hello I am thread safe singleton dp from thread 1");
		singletonTs.displayMsg();
	}
	
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		SingletonDPThreadSafe singletonTs = SingletonDPThreadSafe.getInstance("Hello I am thread safe singleton dp from thread 2");
		singletonTs.displayMsg();
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		SingletonDesignPatternLazy singleLazy = SingletonDesignPatternLazy.getInstance();
		
		singleLazy.displayMsg();
		
		SingletonDesignPatternEager singleEager = SingletonDesignPatternEager.getInstance();
		singleEager.displayMsg();
		
		Thread thread1 = new Thread(new Thread1());
		Thread thread2 = new Thread(new Thread2());
		
		thread1.start();
		thread2.start();
		
	}
	
	

}
