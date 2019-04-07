
abstract class Device {

	protected Build device1; 
    protected Build device2; 
  
    protected Device(Build device1, Build device2) 
    { 
        this.device1 = device1; 
        this.device2 = device2; 
    } 
  
    abstract public void manufacture(); 
    
    abstract public void upgrade();
    
    abstract public void installSpeaker();
	
}
