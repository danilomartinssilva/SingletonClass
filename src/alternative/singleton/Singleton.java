package alternative.singleton;

public class Singleton {
	
	private static Singleton instance;
	private String nameOfSingleton="null";
	
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		if(instance==null)instance=new Singleton();
		return instance;
	}
	
	public String getNameOfSingleton() {
		return nameOfSingleton;
	}
	public void setNameOfSingleton(String nameOfSingleton) {
		this.nameOfSingleton = nameOfSingleton;
	}
	


}
