
public class OperatingSystem implements Build{
	
	@Override
    public void putTogetherDevice() 
    { 
        System.out.println("The operating system has been installed"); 
    }

	@Override
	public void upgradeDevice() {
		System.out.println("The OS has been upgraded");
		
	} 
	
	@Override
	public void installBettterSpeaker() {
		
		System.out.println("A new Bose speaker has been installed");
	} 

}