
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	private int x;
	private int y;
	private String obstacles;
	private int actualx;
	private int actualy;
	private String direction;

	// getters and setters

	public String getdirection() {
		return direction;
	}

	public void setdirection(String direction) {
		this.direction = direction;
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

	public PlanetExplorer(int x, int y, String obstacles) {
		/*
		 * x and y represent the size of the grid. Obstacles is a String
		 * formatted as follows:
		 * "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white
		 * spaces.
		 * 
		 * Example use: For a 100x100 grid with two obstacles at coordinates
		 * (5,5) and (7,8) PlanetExplorer explorer = new
		 * PlanetExplorer(100,100,"(5,5)(7,8)")
		 * 
		 */
		this.x = x;
		this.y = y;
		this.obstacles = obstacles;
		actualx = 0;
		actualy = 0;
		direction = "N";

	}

	public PlanetExplorer(int x, int y) {
		this.x = x;
		this.y = y;
		actualx = 0;
		actualy = 0;
		direction = "N";

	}

	public String executeCommand(String command) {

		/*
		 * The command string is composed of "f" (forward), "b" (backward), "l"
		 * (left) and "r" (right) Example: The explorer is on a 100x100 grid at
		 * location (0, 0) and facing NORTH. The explorer is given the commands
		 * "ffrff" and should end up at (2, 2) facing East.
		 * 
		 * The return string is in the format:
		 * "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)"
		 * Where pos_x and pos_y are the final coordinates, facing is the
		 * current direction the explorer is pointing to (N,S,W,E). The return
		 * string should also contain a list of coordinates of the encountered
		 * obstacles. No white spaces.
		 */

		// turning
		
		while (!command.isEmpty()) {
		
                char ch= command.charAt(0);
				if (ch=='r') {
					if (direction == "N") {
						direction = "E";
					} else if (direction == "E") {
						direction = "S";
					} else if (direction == "S") {
						direction = "W";
					} else if (direction == "W") {
						direction = "N";
					}
				} else if (ch=='l') {
					if (direction == "N") {
						direction = "W";
					} else if (direction == "W") {
						direction = "S";
					} else if (direction == "S") {
						direction = "E";
					} else if (direction == "E") {
						direction = "N";
					}
				}
				// moving

				if (ch=='f') {
					if (direction == "N") {
						actualy++;
					} else if (direction == "E") {
						actualx++;
					} else if (direction == "S") {
						actualy--;
					} else if (direction == "W") {
						actualx--;
					}
				} else if (ch=='b') {
					if (direction == "N") {
						actualy--;
					} else if (direction == "E") {
						actualx--;
					} else if (direction == "S") {
						actualy++;
					} else if (direction == "W") {
						actualx++;
					}
				}
				// wrapping
				if(actualx<0){
					actualx=99;
				} else if(actualx>100){
					actualx=1;
				}
				
				if(actualy<0){
					actualy=99;
				}else if(actualy>100){
					actualy=1;
				}
			
				command = command.substring(1);
			
		}
		
		
		return "(" + actualx + "," + actualy + "," + direction + ")";
	}

	public void asd() {
		System.out.println(actualx);
		System.out.println(actualy);
		System.out.println(direction);
	}
}
