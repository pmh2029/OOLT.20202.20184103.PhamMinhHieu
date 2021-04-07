package media;

public class Media {
    
    private String title;
    private String category;
    private float cost;
    

    //************************************* Constructors *************************************
    //Defalut Constructor
    public Media () {
    }

    public Media(String title) {
        this.title = title;
        this.category = "unknown";
        this.cost = 0.0f;
    }

    public Media(String title, String category) {
        this.title = title;
        this.category = category;
        this.cost = 0.0f;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    //********************************* Setter and Getter methods **********************************
    
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
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    
}