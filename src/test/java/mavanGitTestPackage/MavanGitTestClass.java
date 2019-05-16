package mavanGitTestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MavanGitTestClass {

	@Test
	public void test1() {
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, false);
	
	}

}
