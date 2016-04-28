
public class Feld {
	public static int id = 0;
	int nummer;
	Content.contents inhalt;
	int abstandZumZiel;
	Feld nachbarn[];
	int x, y, breite, hoehe;
	
	public Feld() {
		nummer = id;
		id++;
		inhalt = Content.contents.EMPTY;
	}
	
	public Feld(Content.contents content, int distance, int rechtswert, int untenwert, int width, int height) {//Feld ...felds ) {
		super();
		inhalt = content;
		/*int i = 0;
		for (Feld nachbar:felds) {
			nachbarn[i] = nachbar;
			i++;
		}*/
		abstandZumZiel = distance;
		x = rechtswert;
		y = untenwert;
		breite = width;
		hoehe = height;
	}
	
	public enum contents {
		RED,
		GREEN,
		YELLOW,
		BLUE,
		EMPTY,
		BLOCK;
	}
	public static void initFelder(){
		//erstelle Felder
	}
	
}
