package design.creational.singleton;

public class SingletonDesignPatternLazy {
	
	private static SingletonDesignPatternLazy singleton;
	
	private String msg;
	
	private SingletonDesignPatternLazy() {
		msg = "Hello! I am Lazy singleton";
	}
	
	public static SingletonDesignPatternLazy getInstance() {
		if(singleton == null) {
			singleton = new SingletonDesignPatternLazy();
		}
		return singleton;
	}
	
	public void displayMsg() {
		System.out.println(msg);
		System.out.println("Something");
	}

}
