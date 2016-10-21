import java.util.ArrayList;
import java.util.Vector;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	private int x;
	private int y;
	private String obstacles;
	private int positionx;
	private int positiony;
	private String direction;
	
	ArrayList obstaclesList = new ArrayList();
	

	public String getdirection() {
		return direction;
	}

	public void setdirection(String direction) {
		this.direction = direction;
	}

	public int getpositionx() {
		return positionx;
	}

	public void setpositionx(int positionx) {
		this.positionx = positionx;
	}

	public int getpositiony() {
		return positiony;
	}

	public void setpositiony(int positiony) {
		this.positiony = positiony;
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
		positionx = 0;
		positiony = 0;
		direction = "N";
		if(!obstacles.isEmpty()){
			obstaclesList.add(Integer.getInteger(	obstacles.substring(1,obstacles.indexOf(","))));
			obstaclesList.add(Integer.getInteger(	obstacles.substring(obstacles.indexOf(",")+1,obstacles.indexOf(")"))));
		}

	}

	public PlanetExplorer(int x, int y) {
		this.x = x;
		this.y = y;
		positionx = 0;
		positiony = 0;
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
						positiony++;
					} else if (direction == "E") {
						positionx++;
					} else if (direction == "S") {
						positiony--;
					} else if (direction == "W") {
						positionx--;
					}
				} else if (ch=='b') {
					if (direction == "N") {
						positiony--;
					} else if (direction == "E") {
						positionx--;
					} else if (direction == "S") {
						positiony++;
					} else if (direction == "W") {
						positionx++;
					}
				}
				// obstacles
				
				for(int i=0 ; i<obstaclesList.size()-2 ; i++){
					//while(obstaclesList.)
					if(obstaclesList.get(i).equals(positionx) && obstaclesList.get(i+1).equals(positiony)){
						System.out.println("(" + positionx + "," + positiony + "," + direction + ")" + "(" + obstaclesList.get(i) +
								"," + obstaclesList.get(i+1) + ")");
					
						return "(" + positionx + "," + positiony + "," + direction + ")" + "(" + obstaclesList.get(i) +
								"," + obstaclesList.get(i+1) + ")";
					}
				}
				
				
				
				
				
				// wrapping
				if(positionx<0){
					positionx=x-1;
				} else if(positionx>x){
					positionx=1;
				}
				
				if(positiony<0){
					positiony=y-1;
				}else if(positiony>y){
					positiony=1;
				}
			    
				command = command.substring(1);
			
		}
		
		
		return "(" + positionx + "," + positiony + "," + direction + ")";
	}

	public void asd() {
		System.out.println(positionx);
		System.out.println(positiony);
		System.out.println(direction);
	}
}
