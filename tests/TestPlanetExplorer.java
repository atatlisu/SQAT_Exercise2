import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	

	@Test
	public void test_PlanetExplorer90x100() {
		PlanetExplorer explorer = new PlanetExplorer(90,100);
		assertTrue(explorer.getX()==90 && explorer.getY()==100);
	}
	@Test
	public void test_FirstLanding(){
		PlanetExplorer explorer = new PlanetExplorer(90,100);
		assertTrue(explorer.executeCommand("").equals("(0,0,N)"));
	}
	@Test
	public void test_executeCommand() {
		PlanetExplorer explorer = new PlanetExplorer(90,100);
		explorer.executeCommand("l");
		assertTrue(explorer.getdirection()=="W");
	}
	@Test
	public void test_executeCommand2() {
		PlanetExplorer explorer = new PlanetExplorer(90,100);
		assertTrue(explorer.executeCommand("r").equals("(0,0,E)"));
	}
	@Test
	public void test_executeCommand3() {
		PlanetExplorer explorer = new PlanetExplorer(90,100);
		explorer.setActualx(7);
		explorer.setActualy(6);
		explorer.setdirection("N");
		assertTrue(explorer.executeCommand("f").equals("(7,7,N)"));
	}
	@Test
	public void test_executeCommand_combined() {
		PlanetExplorer explorer = new PlanetExplorer(90,100);
		assertTrue(explorer.executeCommand("ffrff").equals("(2,2,E)"));
	}@Test
	public void test_Wrapping() {
		PlanetExplorer explorer = new PlanetExplorer(100,100);
		assertTrue(explorer.executeCommand("b").equals("(0,99,N)"));
			
	}
	
	
	
	
	
	
}
