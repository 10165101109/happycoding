package world_clock;
import java.util.ArrayList;

public class hello_world_clock_system {
	//时钟系统牵涉到若干cityClock
private ArrayList<cityClock> cityClocks = new ArrayList<cityClock>();
	
//将cityClock纳入时钟系统
public void attach(cityClock cc) {
	this.cityClocks.add(cc);
}

//判断时钟系统有哪些cityClock
public ArrayList<cityClock> getClocks()
{
	
	return this.cityClocks;
}
}
