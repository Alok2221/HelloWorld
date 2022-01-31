package Learning;

public class Bottom {

    private String stuffed;
    private String cracker;
    private String flat;
    private String thin;
    private String cheesy;
    private String thick;
    private String wrapping;

    public Bottom() {
    }

    public String getStuffed() {
        return stuffed;
    }

    public void setStuffed(String stuffed) {
        this.stuffed = stuffed;
    }

    public String getCracker() {
        return cracker;
    }

    public void setCracker(String cracker) {
        this.cracker = cracker;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getThin() {
        return thin;
    }

    public void setThin(String thin) {
        this.thin = thin;
    }

    public String getCheesy() {
        return cheesy;
    }

    public void setCheesy(String cheesy) {
        this.cheesy = cheesy;
    }

    public String getThick() {
        return thick;
    }

    public void setThick(String thick) {
        this.thick = thick;
    }

    public String getWrapping() {
        return wrapping;
    }

    public void setWrapping(String wrapping) {
        this.wrapping = wrapping;
    }

    @Override
    public String toString() {
        return "Bottom" +
                ", stuffed='" + stuffed + '\'' +
                ", cracker='" + cracker + '\'' +
                ", flat='" + flat + '\'' +
                ", thin='" + thin + '\'' +
                ", cheesy='" + cheesy + '\'' +
                ", thick='" + thick + '\'' +
                ", wrapping='" + wrapping + '\'';
    }
}

