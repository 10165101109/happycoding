package world_clock;

public abstract class clock {
	protected int utcOffset;//与utc标准时间的时间差
	
	public abstract int getTime();

}
