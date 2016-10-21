import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		PlanetExplorer explorer = new PlanetExplorer(90,100,"(5,5)(7,8)");
		assertTrue(explorer.getX()==90 && explorer.getY()==100);
	}
}
