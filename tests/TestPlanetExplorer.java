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
		assertTrue(explorer.getActualx()==0 && explorer.getActualy()==0 && explorer.getdirection().equals("N"));	
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
		explorer.executeCommand("r");
		assertTrue(explorer.getdirection()=="E");
	}
	@Test
	public void test_executeCommand3() {
		PlanetExplorer explorer = new PlanetExplorer(90,100);
		explorer.setActualx(7);
		explorer.setActualy(6);
		explorer.setdirection("N");
		explorer.executeCommand("f");
		assertTrue(explorer.getActualx()==7 && explorer.getActualy()==7 && explorer.getdirection().equals("N"));	
	}
	@Test
	public void test_executeCommand_combined() {
		PlanetExplorer explorer = new PlanetExplorer(90,100);
		explorer.executeCommand("ffrff");
		
		assertTrue(explorer.getActualx()==2 && explorer.getActualy()==2 && explorer.getdirection().equals("E"));	
	}@Test
	public void test_Wrapping() {
		PlanetExplorer explorer = new PlanetExplorer(100,100);
		assertTrue(explorer.executeCommand("b").equals("(0,99,N)"));
			
	}
	
	
	
	
	
	
}
