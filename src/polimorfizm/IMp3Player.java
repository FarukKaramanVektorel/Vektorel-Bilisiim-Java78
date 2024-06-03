package polimorfizm;

public interface IMp3Player {
	
	public void sesAc();
	public void sesKis();
	public void nextMp3();
	public void ffMp3();
	public void play()throws InterruptedException;
	public void play(Mp3[] mp3s) throws InterruptedException;
	

}
