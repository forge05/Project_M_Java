
public class Player {

	String name;
	Content.contents inhalt;
	private Feld[] myFields;
	
	public Player(String gamerName, Content.contents content, Feld[] myF) {
		name = gamerName;
		inhalt = content;
		myFields = myF;
	}
	
	public Feld[] getMyFields(){
		return myFields;
	}
}



