package design.creational.factory;

public class TestFactory {

	public static void main(String[] args) {
		 
		Computer pc = ComputerFactory.getComputer("pc", "2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("Server","4 GB","1500 GB","3.4 GHz");
		
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);

	}

}
