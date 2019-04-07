
public class BridgePattern {

	public static void main(String[] args) {
	    { 
	        Device phone = new Phone(new OperatingSystem(), new Software()); 
	        phone.manufacture(); 
	        phone.upgrade();
	        phone.installSpeaker();
	        
	        System.out.println();
	        
	        Device laptop = new Laptop(new OperatingSystem(), new Software()); 
	        laptop.manufacture(); 
	        laptop.upgrade();
	        laptop.installSpeaker();
	    } 

	}

}
