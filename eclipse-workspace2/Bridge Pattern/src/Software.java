
public class Software implements Build{

	@Override
    public void putTogetherDevice() 
    { 
        System.out.println("The software has been updated");  
    }

	@Override
	public void upgradeDevice() {
		
		System.out.println("Software has been upgraded");
	}

	@Override
	public void installBettterSpeaker() {
		
		System.out.println("A new Sony speaker has been installed");
	} 
	
}
