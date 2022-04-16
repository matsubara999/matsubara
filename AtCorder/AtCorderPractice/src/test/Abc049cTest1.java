package test;

import org.junit.Assert;
import org.junit.Test;

import atcorder.Abc049c;

public class Abc049cTest1 {

	@Test
	public void testMain() {

		Abc049c abc049c = new Abc049c("dream");
		Assert.assertEquals(abc049c.exec(), "YES");
	}

}
