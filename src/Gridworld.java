import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	
	public static void main(String[] args) {
///This is long and i will condense it
		
		
		
		
World w = new World();
w.show();
//
//creating bugs
Bug b = new Bug(Color.red);
Bug b2 = new Bug(Color.BLUE);

//creating flower
Flower f = new Flower(Color.white);
Flower f1 = new Flower(Color.red);
Flower f2 = new Flower(Color.pink);
Flower f3 = new Flower(Color.white);
Flower f4 = new Flower(Color.blue);
Flower f5 = new Flower(Color.cyan);
Flower f6 = new Flower(Color.MAGENTA);
Flower f7 = new Flower(Color.orange);
Flower f8 = new Flower(Color.yellow);
Flower f9 = new Flower(Color.pink);
Flower flower = new Flower(Color.GREEN);

//random
Random ran = new Random();
int randy =  ran.nextInt(10);
int rand =  ran.nextInt(10);
int brock = ran.nextInt(10);
int ash = ran.nextInt(10);
int ser = ran.nextInt(10);
int moto = ran.nextInt(10);
int lit = ran.nextInt(10);
int who = ran.nextInt(10);
int are = ran.nextInt(10);
int you = ran.nextInt(10);
int hehe = ran.nextInt(10);
int black = ran.nextInt(10);
int pink = ran.nextInt(10);

int randy1 =  ran.nextInt(10);
int rand1 =  ran.nextInt(10);
int brock1 = ran.nextInt(10);
int ash1 = ran.nextInt(10);
int ser1 = ran.nextInt(10);
int moto1 = ran.nextInt(10);
int lit1 = ran.nextInt(10);
int who1 = ran.nextInt(10);
int are1 = ran.nextInt(10);
int you1 = ran.nextInt(10);
int hehe1 = ran.nextInt(10);
int black1 = ran.nextInt(10);
int pink1 = ran.nextInt(10);

//location
Location l = new Location(randy,randy1);
Location l2 = new Location(rand,rand1);
Location l4 = new Location(brock,brock1);
Location l5 = new Location(ash,ash1);
Location l6 = new Location(ser,ser1);
Location l7 = new Location(moto,moto1);
Location l8 = new Location(lit,lit1);
Location l9 = new Location(who,who1);
Location loco = new Location(are,are1);
Location violeta = new Location(you,you1);
Location voice = new Location(hehe,hehe1);
Location fireworks = new Location(black,black1);
Location july = new Location(pink,pink1);

//adding
w.add(l,b);
w.add(l2,b2);
w.add(l4, f);
w.add(l5, f1);
w.add(l6, f2);
w.add(l7, f3);
w.add(l8, f4);
w.add(l9, f5);
w.add(loco, f6);
w.add(violeta, f7);
w.add(voice, f8);
w.add(fireworks, f9);
w.add(july, flower);
//turning bug
b2.turn();



//http://level1.jointheleague.org/Mod3Recipes/gridworld.html

}

}