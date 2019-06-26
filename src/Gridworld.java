import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		
	
World w = new World();
w.show();

Bug b = new Bug();
Bug b2 = new Bug();
Random ran = new Random(100);
Location l = new Location(0,0);
//http://level1.jointheleague.org/Mod3Recipes/gridworld.html
//fix random location of bug

//b2.setColor();
b2.turn();
}
}