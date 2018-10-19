package victor.morgant.tp1;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ExceptionTest extends TestCase {
	public void test() {
		Zoo z=new Zoo(0);
		try {
			z.nouveauVisiteur();
			fail("Should throw exception when adding a visiteur over limit");
		}
		catch(LimiteVisiteurException lve) {
			assert(lve.getMessage().contains("La limite de visiteur est dépassée"));
		}
	}
}
