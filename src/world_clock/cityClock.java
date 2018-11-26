package world_clock;

public class cityClock extends clock{
private int utcZeroTime;//utc标准时间

//构造函数，虽然cityClock有2个属性，但是new的时候只需要把utcOffset初始化
//cityClock的属性中，只有utcOffset是不变的
public cityClock(int utcOffset)
{
	super.utcOffset=utcOffset;
	
}

//设置utc标准时间，修改cityClock时间是通过修改utcZeriTime实现的
public void setUtcZeroTime(int utcZeroTime)
{
	this.utcZeroTime = utcZeroTime;
}

public int getUtcZeroTime()
{
	return utcZeroTime;
}

//根据utc标准时间和utcOffset得到该cityClock当前时间
@Override
public int getTime()
{
	//若该cityClock比utc标准时间晚，比如是utc标准时间的前一天，当前时间可能为负
	//加上24再取模
	return (super.utcOffset + this.utcZeroTime+24)%24;
}

public int getUtcOffset()
{
	//若该cityClock比utc标准时间晚，比如是utc标准时间的前一天，当前时间可能为负
	//加上24再取模
	return super.utcOffset;
}

}
