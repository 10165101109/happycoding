package world_clock;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class Test_world_clock_test {
private hello_world_clock_system hwcs;//需要时钟系统勾连所有cityClock对象，因此有一个属性是时钟系统
private phoneClock pc;//utc标准时间是通过修改当前手机时间来设定的，因此还需要属性：phoneClock

//提取所有测试的准备工作：初始化属性
@Before
public void initialize() {
	this.hwcs = new hello_world_clock_system();
	this.pc = new phoneClock(8);
}

/*实现需求，代码核心是phoneClock类的setTime方法
 * public void setTime(int time) {
	this.time=time;
	
	//判断系统中有无cityClock对象。若有，通过修改cityClock的utc标准时间（手机时间减去手机时差）
	//cityClock的getTime返回值会相应改变
	if(this.hwcs == null) return;
	for(cityClock cc : this.hwcs.getClocks()) {
		cc.setUtcZeroTime(time-super.utcOffset);
	}
}
 * 下面测试setTime方法的各个环节是否正确
 * 环节1：设定手机时间的代码是否有误
 * 环节2:将cityClock纳入时钟系统的代码是否有误
 * 环节3；设定cityClock的utc标准时间的代码是否有误
 * 环节4:手机时间设定后，纳入时钟系统的cityClock对象，其utcZeroTime是否成功设定
 * 环节4:通过utcZeroTime和utcOffset计算cityClock_time的代码是否有误
 * 总的：手机时间设定后，时钟系统中的cityClock的显示时间是否相应调整
 */

//测试手机时间设定是否成功
@Test
public void the_time_of_the_phone_clock_should_be_set_correctly_after_its_setTime_method_is_invoked() {
  // Arrange
  // Act
  pc.setTime(9);

  // Assert
  assertEquals(9, pc.getTime());
}

//测试cityClock是否被纳入时钟系统中
@Test
public void clock_london_should_be_in_WorldHotelSystem_after_calling_method_attach() {
	//Arrange
	//Act
	cityClock londonclock = new cityClock(0);
	hwcs.attach(londonclock);
	
	//Assert
	ArrayList<cityClock> cclist = hwcs.getClocks();
	assertEquals(0,cclist.get(0).getUtcOffset());
	
}

@Test
public void clock_beijing_should_be_in_WorldHotelSystem_after_calling_method_attach() {
	//Arrange
	//Act
	cityClock beijingclock = new cityClock(8);
	hwcs.attach(beijingclock);
	
	//Assert
	ArrayList<cityClock> cclist = hwcs.getClocks();
	assertEquals(8,cclist.get(0).getUtcOffset());
	
}

@Test
public void clock_Sydney_should_be_in_WorldHotelSystem_after_calling_method_attach() {
	//Arrange
	//Act
	cityClock Sydneyclock = new cityClock(10);
	hwcs.attach(Sydneyclock);
	
	
	//Assert
	ArrayList<cityClock> cclist = hwcs.getClocks();
	assertEquals(10,cclist.get(0).getUtcOffset());
	
}

//测试cityClock是否分别被纳入时钟系统
@Test
public void clock_london_and_clock_newyork_should_be_respectively_in_WorldHotelSystem_after_calling_method_attach() {
	//Arrange
	//Act
	cityClock londonclock = new cityClock(0);
	hwcs.attach(londonclock);
	cityClock newyorkclock = new cityClock(-5);
	hwcs.attach(newyorkclock);
	
	//Assert
	ArrayList<cityClock> cclist = hwcs.getClocks();
	assertEquals(0,cclist.get(0).getUtcOffset());
	assertEquals(-5,cclist.get(1).getUtcOffset());
	
}

@Test
public void clock_london_and_clock_newyork_and_clock_beijing_should_be_respectively_in_WorldHotelSystem_after_calling_method_attach() {
	//Arrange
	//Act
	cityClock londonclock = new cityClock(0);
	hwcs.attach(londonclock);
	cityClock newyorkclock = new cityClock(-5);
	hwcs.attach(newyorkclock);
	cityClock beijingclock = new cityClock(8);
	hwcs.attach(beijingclock);
	
	//Assert
	ArrayList<cityClock> cclist = hwcs.getClocks();
	assertEquals(0,cclist.get(0).getUtcOffset());
	assertEquals(-5,cclist.get(1).getUtcOffset());
	assertEquals(8,cclist.get(2).getUtcOffset());
	
}

//测试cityClock类，utc标准时间设定的代码是否有误
@Test
public void the_utcZerotime_of_clock_london_should_be_1_after_the_utcZeroTime_is_set_to_1() {
	//Arrange
	cityClock londonclock = new cityClock(0);
	
	//Act
	londonclock.setUtcZeroTime(1);
	
	//Assert
	assertEquals(1,londonclock.getUtcZeroTime());
}

@Test
public void the_utcZerotime_of_clock_sydney_should_be_1_after_the_utcZeroTime_is_set_to_1() {
	//Arrange
	cityClock sydneyclock = new cityClock(10);
	
	//Act
	sydneyclock.setUtcZeroTime(1);
	
	//Assert
	assertEquals(1,sydneyclock.getUtcZeroTime());
}


//测试手机时间设定后，时钟系统中的cityClock的utc标准时间是否相应间接设定
@Test
public void the_utcZerotime_of_clock_london_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
	//Arrange
	cityClock londonclock = new cityClock(0);
	hwcs.attach(londonclock);
	
	//Act
	pc.setHotelWorldClockSystem(hwcs);
	pc.setTime(9);
	
	//Assert
	assertEquals(1,londonclock.getUtcZeroTime());
}

@Test
public void the_utcZerotime_of_clock_Beijing_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
	//Arrange
	cityClock beijingclock = new cityClock(8);
	hwcs.attach(beijingclock);
	
	//Act
	pc.setHotelWorldClockSystem(hwcs);
	pc.setTime(9);
	
	//Assert
	assertEquals(1,beijingclock.getUtcZeroTime());
}

@Test
public void the_utcZerotime_of_clock_Moscow_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
	//Arrange
	cityClock Moscowclock = new cityClock(4);
	hwcs.attach(Moscowclock);
	
	//Act
	pc.setHotelWorldClockSystem(hwcs);
	pc.setTime(9);
	
	//Assert
	assertEquals(1,Moscowclock.getUtcZeroTime());
}

//测试utc标准时间设定后，cityClock的时间是否相应调整
@Test
public void the_time_of_clock_london_should_be_1_after_the_utcZeroTime_is_set_to_1() {
	//Arrange
	cityClock londonclock = new cityClock(0);
	
	//Act
	londonclock.setUtcZeroTime(1);
	
	//Assert
	assertEquals(1,londonclock.getTime());
}

@Test
public void the_time_of_clock_Beijing_should_be_9_after_the_utcZeroTime_is_set_to_1() {
	//Arrange
	cityClock beijingclock = new cityClock(8);
	
	//Act
	beijingclock.setUtcZeroTime(1);
	
	//Assert
	assertEquals(9,beijingclock.getTime());
}

@Test
public void the_time_of_clock_Moscow_should_be_5_after_the_utcZeroTime_is_set_to_1() {
	//Arrange
	cityClock moscowclock = new cityClock(4);
	
	//Act
	moscowclock.setUtcZeroTime(1);
	
	//Assert
	assertEquals(5,moscowclock.getTime());
}

//测试手机时间设定后，时钟系统中的cityClock时间是否相应调整
@Test
public void the_time_of_clock_london_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
	//Arrange
	cityClock londonclock = new cityClock(0);
	hwcs.attach(londonclock);
	
	//Act
	pc.setHotelWorldClockSystem(hwcs);
	pc.setTime(9);
	
	//Assert
	assertEquals(1,londonclock.getTime());
	
}

@Test
public void the_time_of_clock_NewYork_should_be_20_after_the_phone_clock_is_set_to_9_Beijing_time() {
	//Arrange
	cityClock newyorkclock = new cityClock(-5);
	hwcs.attach(newyorkclock);
	
	//Act
	pc.setHotelWorldClockSystem(hwcs);
	pc.setTime(9);
	
	//Assert
	assertEquals(20,newyorkclock.getTime());
	
}

@Test
public void the_time_of_clock_Moscow_should_be_5_after_the_phone_clock_is_set_to_9_Beijing_time() {
    // Arrange
    cityClock moscowClock = new cityClock(4);
    hwcs.attach(moscowClock);
    // Act
    pc.setHotelWorldClockSystem(hwcs);
    pc.setTime(9);

    // Assert
    assertEquals(5, moscowClock.getTime());
}

@Test
public void the_time_of_clock_Sydney_should_be_5_after_the_phone_clock_is_set_to_9_Beijing_time() {
    // Arrange
    cityClock sydneyClock = new cityClock(10);
    hwcs.attach(sydneyClock);

    // Act
    pc.setHotelWorldClockSystem(hwcs);
    pc.setTime(9);

    // Assert
    assertEquals(11, sydneyClock.getTime());
}

@Test
public void the_time_of_clock_beijing_should_be_9_after_the_phone_clock_is_set_to_9_Beijing_time() {
    // Arrange
    cityClock beijingClock = new cityClock(8);
    hwcs.attach(beijingClock);

    // Act
    pc.setHotelWorldClockSystem(hwcs);
    pc.setTime(9);

    // Assert
    assertEquals(9, beijingClock.getTime());
}

//测试手机时间设定后，若时钟系统有多个cityClock对象，它们的显示时间是否均调整
@Test
public void the_time_of_clock_London_and_NewYork_should_be_1_and_9_respectively_after_the_phone_clock_is_set_to_9_Beijing_time() {
	//Arrange
	cityClock londonclock = new cityClock(0);
	cityClock newyorkclock = new cityClock(-5);
	hwcs.attach(londonclock);
	hwcs.attach(newyorkclock);
	
	
	//Act
	pc.setHotelWorldClockSystem(hwcs);
	pc.setTime(9);
	
	//Assert
	assertEquals(1,londonclock.getTime());
	assertEquals(20,newyorkclock.getTime());
	}

}
