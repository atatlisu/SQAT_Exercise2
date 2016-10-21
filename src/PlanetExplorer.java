
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	private int x;
	private int y;
	private String obstacles;
	private int actualx;
	private int actualy;
	private String way;
	// getters and setters
	public String getWay() {
		return way;
	}
	public void setWay(String way) {
		this.way = way;
	}
	public int getActualx() {
		return actualx;
	}
	public void setActualx(int actualx) {
		this.actualx = actualx;
	}
	public int getActualy() {
		return actualy;
	}
	public void setActualy(int actualy) {
		this.actualy = actualy;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getObstacles() {
		return obstacles;
	}
	public void setObstacles(String obstacles) {
		this.obstacles = obstacles;
	}
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		this.x=x;
		this.y=y;
		this.obstacles=obstacles;
		actualx=0;
		actualy=0;
		way="N";
		
	}
	public PlanetExplorer(int x, int y){
		this.x=x;
		this.y=y;
		actualx=0;
		actualy=0;
		way="N";
		
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		// turning
		if(command=="r"){
			if(way=="N"){
				way="E";
			}else if(way=="E"){
				way="S";
			}else if(way=="S"){
				way="W";
			}else if(way=="W"){
				way="N";
			}
		}else if(command=="l"){
			if(way=="N"){
				way="W";
			}else if(way=="W"){
				way="S";
			}else if(way=="S"){
				way="E";
			}else if(way=="E"){
				way="N";
			}
		}
		// moving
		
		if(command=="f"){
			if(way=="N"){
				actualy++;
			}else if(way=="E"){
				actualx++;
			}else if(way=="S"){
				actualy--;
			}else if(way=="W"){
				actualx--;
			}
		}else if(command=="b"){
			if(way=="N"){
				actualy--;
			}else if(way=="E"){
				actualx--;
			}else if(way=="S"){
				actualy++;
			}else if(way=="W"){
				actualx++;
			}
		}
		
		return null;
	}
	
	public void asd(){
	System.out.println(x);
	}
}
