package world_clock;

public class phoneClock extends clock{

	//修改phoneClock时间，cityClock跟着变，因此hello_world_clock_system类是phneClock的属性
	private hello_world_clock_system hwcs;
	private int time;
	
	//phoneClock是北京时间，也有时差
	public phoneClock(int utcOffset){
	super.utcOffset = utcOffset;
}

	//修改phoneClock时间，所有cityClock对象时间跟着变
public void setTime(int time) {
	this.time=time;
	
	//判断系统中有无cityClock对象。若有，通过修改cityClock的utc标准时间（手机时间减去手机时差）
	//cityClock的getTime返回值会相应改变
	if(this.hwcs == null) return;
	for(cityClock cc : this.hwcs.getClocks()) {
		cc.setUtcZeroTime(time-super.utcOffset);
	}
}

//初始化时钟系统这个属性
public void setHotelWorldClockSystem(hello_world_clock_system hwcs) {
	this.hwcs = hwcs;
}
@Override
public int getTime()
{
	return this.time;
}


}
