package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;
//excute the annotation or methods according to priority
public class Flag4 {
  @Test
  public void f() {
	  Reporter.log("F method",true);
  }
  @Test
  public void a() {
	  Reporter.log("A method",true);
  }
  @Test
  public void b() {
	  Reporter.log("B method",true);
  }
  @Test()
  public void c() {
	  Reporter.log("C method",true);
  }
  @Test
  public void d() {
	  Reporter.log("D method",true);
  }
  @Test(priority = 1)
  public void e() {
	  Reporter.log("E method",true);
  }
  @Test(priority = 1)
  public void i() {
	  Reporter.log("I method",true);
  }
  @Test
  public void g() {
	  Reporter.log("G method",true);
  }
  @Test
  public void h() {
	  Reporter.log("H method",true);
  }
}
