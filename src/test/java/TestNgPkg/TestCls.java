package TestNgPkg;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups="all test")

public class TestCls {
  @Test(groups={"smoke"})
  public void f() {
	  Assert.assertTrue(false);
  }

  @Test(groups={"ravi"})
  public void f1() {
  }
  @Test(groups= {"sanity"})
  public void f2() {
	  Assert.assertTrue(false);
  }
  @Test(groups= {"ravi"})
  public void f3() {
  }
  @Test(groups={"ravi1.smoke"})
  public void f4() {
  }
  @Test(groups= {"smoke","ravi","sanity"})
  public void f5() {
  }




}
