package alternative.singleton;

public class Main {

	
	public static void main(String[] args) {
		Singleton newSingleton1 = Singleton.getInstance();
		System.out.println("Default name is:"+newSingleton1.getNameOfSingleton()+"\n");
		newSingleton1.setNameOfSingleton("modified name one time by newSingleton1\n ");
		
		Singleton newSingleton2 = Singleton.getInstance();
		System.out.println("The new instance have: "+newSingleton2.getNameOfSingleton());

		newSingleton2.setNameOfSingleton("modified name one time by newSingleton2\n ");
		Singleton newSingleton3 = Singleton.getInstance();
		System.out.println("The new instance have: "+newSingleton3.getNameOfSingleton());
		
	}

}
