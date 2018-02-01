package appModules;


import org.junit.Assert;
import org.testng.annotations.Test;

import utility.Constant;
import utility.psUtility;

public class SetEnvironment extends psUtility {

	@Test
	public static void Execute() throws Exception {
		setEnvironment(Constant.InternalURL);
		

	}
}
