import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	
	@Test
	public void test_executeCommand() {
		
	}
	@Test
	public void test_PlanetExplorer90x100() {
		PlanetExplorer explorer = new PlanetExplorer(90,100);
		assertTrue(explorer.getX()==90 && explorer.getY()==100);
	}
	@Test
	public void test_Landing(){
		PlanetExplorer explorer = new PlanetExplorer(90,100);
		assertTrue(explorer.getActualx()==0 && explorer.getActualy()==0 && explorer.getWay().equals("N"));	
		}
	
}
