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
		assertTrue(explorer.getActualx()==0 && explorer.getActualy()==0 && explorer.getWay().equals("N"));	
	}
	@Test
	public void test_executeCommand() {
		PlanetExplorer explorer = new PlanetExplorer(90,100);
		explorer.executeCommand("l");
		assertTrue(explorer.getWay()=="W");
	}
	@Test
	public void test_executeCommand2() {
		PlanetExplorer explorer = new PlanetExplorer(90,100);
		explorer.executeCommand("r");
		assertTrue(explorer.getWay()=="E");
	}
	@Test
	public void test_executeCommand3() {
		PlanetExplorer explorer = new PlanetExplorer(90,100);
		explorer.setActualx(7);
		explorer.setActualy(6);
		explorer.setWay("N");
		explorer.executeCommand("f");
		assertTrue(explorer.getActualx()==7 && explorer.getActualy()==7 && explorer.getWay().equals("N"));	
	}
	
	
	
}
