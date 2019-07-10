import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	
	public static void main(String[] args) {
		
World world = new World();
world.show();
//

//creating flower
Flower flower2 = new Flower(Color.red);
Bug bug3 = new Bug(Color.green);

//turning green bug
bug3.turn();
bug3.turn();
bug3.turn();
//creating bugs
Bug bug = new Bug(Color.red);
Bug bug2 = new Bug(Color.BLUE);

for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10; j++) {
		Location locationNew = new Location(i,j);
		
		world.add(locationNew, flower2);
	}
}

for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10; j++) {
		
		 if(i==j) {
			
			Location locationNueve = new Location(i,j);
		
			world.add(locationNueve, bug3);
		 }
		}
		}
int j =9;
for (int i = 0; i <10; i++) {
	
			//(0,4)(1,3)(2,2)(3,1)(4,0)
			Location locationOcho = new Location(i,j);
		
			world.add(locationOcho, bug2);
			j--;
		
		}


//creating flower
Flower flower = new Flower(Color.white);

//random
Random ran = new Random();


int row =  ran.nextInt(10);
int column = ran.nextInt(10);

//location
Location location = new Location(row,column);
Location locationleft = new Location(row,column -1);
Location locationright = new Location(row,column +1);

//adding
world.add(location,bug);
world.add(locationleft, flower);
world.add(locationright, flower);


//turning bug
bug2.turn();



//http://level1.jointheleague.org/Mod3Recipes/gridworld.html

}

}