package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public static int getNbDigitalVideoDiscs() {
	        return nbDigitalVideoDiscs;
	    }

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		//this.title = title;
		this.setTitle(title);
		//this.category = category;
		this.setCategory(category);
		this.director = director;
		this.length = length;
		//this.cost = cost;
		this.setCost(cost);
		nbDigitalVideoDiscs++;
	    //this.id = nbDigitalVideoDiscs;
		this.setId(nbDigitalVideoDiscs);
	}
	public DigitalVideoDisc(String title) {
		super();
		//this.title=title;
		this.setTitle(title);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}
	
public void play() {
	System.out.println("Playing DVD: " + this.getTitle());
    System.out.println("DVD length: " + this.getLength() + " minutes");
}
@Override
public String toString() {
    return "DVD - " + super.toString() + ", Director: " + director + ", Length: " + length + " mins";
}

	
}
