package com.orangehrmpluging;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups="admin")
	public void adminModule1()
	{
		System.out.println("Executing Admin module");
	}
	
	@Test(groups="admin")
	public void adminModule2()
	{
		System.out.println("Executing Admin module");
	}

	@Test(groups="admin")
	public void leaveModule1()
	{
		System.out.println("Executing Leave module");
	}

	@Test(groups="admin")
	public void leaveModule2()
	{
		System.out.println("Executing Leave module");
	}

}
