package design.creational.singleton;

public class SingletonDPThreadSafe {
	
	private static volatile SingletonDPThreadSafe singletonTS;
	
	private String msg;
	private SingletonDPThreadSafe(String msg) {
		this.msg = msg;
	}
	
	public static SingletonDPThreadSafe getInstance(String msg) {
		if(singletonTS == null) {
			synchronized (SingletonDPThreadSafe.class) {
				if(singletonTS == null) {
					singletonTS = new SingletonDPThreadSafe(msg);
				}
			}
		}
		return singletonTS;
	}
	public void displayMsg() {
		System.out.println(msg);
		System.out.println("Something DP thread safe");
	}

}
