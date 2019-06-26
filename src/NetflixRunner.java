
public class NetflixRunner {
	
public static void main(String[] args) {
	
Movie m1 = new Movie("0.0",2);
Movie m2 = new Movie("Twilight",1);
Movie m3 = new Movie("Coco",5);
Movie m4 = new Movie("A Silent Voice",4);
Movie m5 = new Movie("Your Name",4);


m1.getTicketPrice();

NetflixQueue n = new NetflixQueue();

n.addMovie(m5);
n.addMovie(m4);
n.addMovie(m3);
n.addMovie(m2);
n.addMovie(m1);

n.printMovies();

System.out.println("The best movie is " + n.getBestMovie());
System.out.println("The second best movie is " + n.getMovie(2));
}

}
