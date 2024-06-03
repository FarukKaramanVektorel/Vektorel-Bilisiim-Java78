package polimorfizm.kameraman;

public class Canon extends Camera{
	private String model;
	private Lens lens;

	public Canon(String name) {
		super(name);
		this.lens=lens;
		this.model=model;
	}

}
