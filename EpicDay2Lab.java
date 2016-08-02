package day2lab;

public class EpicDay2Lab {

	public static void main(String[] args) {
	
	    int favRows = 4;
	    int favCols = 3;
	
	    //Foods, albums, books, movies
	    String[][] aFewOfMyFavoriteThings = new String[favRows][favCols];
	    //Food row
	    aFewOfMyFavoriteThings[0][0] = "Indian food";  
	    aFewOfMyFavoriteThings[0][1] = "buffalo chicken anything";
	    aFewOfMyFavoriteThings[0][2] = "pizza";
	    //Albums row
	    aFewOfMyFavoriteThings[1][0] = "You Forgot it in People - Broken Social Scene";
	    aFewOfMyFavoriteThings[1][1] = "iii - Miike Snow";
	    aFewOfMyFavoriteThings[1][2] = "S/T - Electric President";
	    //Books row
	    aFewOfMyFavoriteThings[2][0] = "A Game of Thrones - George RR Martin";
	    aFewOfMyFavoriteThings[2][1] = "The Way of Kings - Brandon Sanderson";
	    aFewOfMyFavoriteThings[2][2] = "I really don't read enough books....";
	    //Movies row
	    aFewOfMyFavoriteThings[3][0] = "The Life Aquatic";
	    aFewOfMyFavoriteThings[3][1] = "The Big Lebowski";
	    aFewOfMyFavoriteThings[3][2] = "The Royal Tenebaums";
	
		//Favorite foods print now:
		System.out.println("My favorite foods include: ");
		for (int i = 0; i < favCols; i++) {
			System.out.println(aFewOfMyFavoriteThings[0][i] + " ");
		}
		//Favorite albums print now:
		System.out.println(" ");
		System.out.println("My favorite albums include: ");
		for (int i = 0; i < favCols; i++) {
			System.out.println(aFewOfMyFavoriteThings[1][i] + " ");
		}
		//Favorite books print now:
		System.out.println(" ");
		System.out.println("My favorite books include: ");
		for (int i = 0; i < favCols; i++) {
			System.out.println(aFewOfMyFavoriteThings[2][i] + " ");
		}
		//Favorite movies print now:
		System.out.println(" ");
		System.out.println("My favorite movies include: ");
		for (int i = 0; i < favCols; i++) {
			System.out.println(aFewOfMyFavoriteThings[3][i] + " ");
		}
	}
}
	
