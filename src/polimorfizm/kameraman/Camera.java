package polimorfizm.kameraman;

public class Camera implements ICamera{
	private String name;
	public Camera(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	

	@Override
	public void kayitAl() {
		System.out.println("Kayıt başladı "+this.name);
		
	}

	@Override
	public void stop() {
		System.out.println("Kayıt sonlandırıldı "+this.name);
		
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return null;
	}

}
