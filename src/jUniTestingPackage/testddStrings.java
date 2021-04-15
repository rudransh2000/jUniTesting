package jUniTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testddStrings {

	@Test
	public void test() {
		jUnitFunction junitstring = new jUnitFunction();
		String result = junitstring.addString("labassignmnet", "project");
		assertEquals ("labassignmnet9project", result);
	}

}
