import java.lang.*;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private MyDate dateOrdered = new MyDate();
	public MyDate getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(MyDate dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public boolean setLength(int length) {
		if(length > 0) {
			this.length = length;
			return true;
		}
		else
			return false;
	}
	public float getCost() {
		return cost;
	}
	public boolean setCost(float cost) {
		if(cost > 0) {
			this.cost = cost;
			return true;
		}
		else
			return false;
	}
	public DigitalVideoDisc() {
		this.title = "Unknow";
		this.category = "Unknown";
		this.director = "Unknown";
		this.length = 0;
		this.cost = 0.0f;
		this.dateOrdered = new MyDate();
	}
	
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost,
			MyDate dateOrdered) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.dateOrdered = dateOrdered;
	}
}