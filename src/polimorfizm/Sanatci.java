package polimorfizm;

public class Sanatci {
	private String name;	
	
	public Sanatci(String name) {
		this.name=name;
	}
	
	
	public void info() {
		System.out.println("Sanatçı Adı: "+this.name);
	}
	
	public String getName() {
		return name;
	}


}

