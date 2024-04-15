package day0415.Classpre;

public class SongMain {

	public static void main(String[] args) {
	
		Song song = new Song(null, null, 0, null);
	
		song.title= "Dancing Queen";
		song.artist ="ABBA";
		song.year = 1978;
		song.country= "스웨덴";
		
		song.show();

	}

}
