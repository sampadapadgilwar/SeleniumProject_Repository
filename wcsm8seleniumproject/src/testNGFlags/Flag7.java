package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

//it is used to perform group execution
public class Flag7 {
	@Test(groups = "Functional testing")
	public void ft1() {
		Reporter.log("FTC1", true);
	}

	@Test(groups = "Smoke testing")
	public void st1() {
		Reporter.log("STC1", true);
	}

	@Test(groups = "Integration testing")
	public void it1() {
		Reporter.log("ITC1", true);
	}
	// ----------------------------------------------------------------

	@Test(groups = "Functional testing")
	public void ft2() {
		Reporter.log("FTC2", true);
	}

	@Test(groups = "Smoke testing")
	public void st2() {
		Reporter.log("STC2", true);
	}

	@Test(groups = "Integration testing")
	public void it2() {
		Reporter.log("ITC2", true);
	}
	// ---------------------------------------------------------------------

	@Test(groups = "Functional testing")
	public void ft3() {
		Reporter.log("FTC3", true);
	}

	@Test(groups = "Smoke testing")
	public void st3() {
		Reporter.log("STC3", true);
	}

	@Test(groups = "Integration testing")
	public void it3() {
		Reporter.log("ITC3", true);
	}
	// ------------------------------------------------------------------------

	@Test(groups = "Functional testing")
	public void ft4() {
		Reporter.log("FTC4", true);
	}

	@Test(groups = "Smoke testing")
	public void st4() {
		Reporter.log("STC4", true);
	}

	@Test(groups = "Integration testing")
	public void it4() {
		Reporter.log("ITC4", true);
	}
	// ------------------------------------------------------------------------

	@Test(groups = "Functional testing")
	public void ft5() {
		Reporter.log("FTC5", true);
	}

	@Test(groups = "Smoke testing")
	public void st5() {
		Reporter.log("STC5", true);
	}

	@Test(groups = "Integration testing")
	public void it5() {
		Reporter.log("ITC5", true);
	}
	// -----------------------------------------------------------------------

	@Test(groups = "Functional testing")
	public void ft6() {
		Reporter.log("FTC6", true);
	}

	@Test(groups = "Smoke testing")
	public void st6() {
		Reporter.log("STC6", true);
	}

	@Test(groups = "Integration testing")
	public void it6() {
		Reporter.log("ITC6", true);
	}
}
