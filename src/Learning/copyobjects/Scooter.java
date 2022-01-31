package Learning.copyobjects;

public class Scooter {
    private String make;
    private String model;
    private int year;

     Scooter(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Scooter(Scooter x) {
         this.copy(x);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
     }

    public void copy(Scooter x) {
         this.setMake(x.getMake());
         this.setModel(x.getModel());
         this.setYear(x.getYear());
    }
}