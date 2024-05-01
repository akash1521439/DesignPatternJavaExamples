package design.creational.singleton;

public class SingletonDesignPatternEager {
	
	private static SingletonDesignPatternEager  singleton= new SingletonDesignPatternEager();
	private String msg;
	private SingletonDesignPatternEager() {
		msg = "Hello! I am Eager singleton";
	}
	
	public static SingletonDesignPatternEager getInstance() {
		return singleton;
	}
	
	public void displayMsg() {
		System.out.println(msg);
		System.out.println("Something");
	}

}
