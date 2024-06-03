package polimorfizm.kameraman;

public class Cameraman {
	private String name;
	private Camera camera;
	public Cameraman(String name) {
		super();
		this.name = name;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	
	public void takeVideo(ICamera camera) {
		if(camera instanceof Camera) {
			Camera cam=(Camera) camera;
			this.camera=cam;
			System.out.println(this.camera.getName()+" ile video kaydı başlatıldı");
		}else {
			System.out.println(camera.info()+" ile video kaydı başlatıldı");
		}
	}

}
