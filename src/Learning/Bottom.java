package Learning;

import java.util.ArrayList;

public class Bottom {

    ArrayList<String> Bottom = new ArrayList<String>();

    String stuffed = "Stuffed Crust";
    String cracker = "Cracker Crust";
    String flat = "Flat Bread Crust";
    String thin = "Thin Crust";
    String cheesy = "Cheese Crust";
    String thick = "Thick Crust";
    String wrapping = "Wrapping It Up";

    Bottom (String stuffed) {
        this.stuffed = stuffed;

    }

    Bottom (String cracker) {
        this.cracker = cracker;
    }
    Bottom( String flat) {
        this.flat = flat;
    }
    Bottom( String thin) {
        this.thin = thin;
    }
    Bottom( String cheesy) {
        this.cheesy = cheesy;
    }
    Bottom(String thick) {
        this.thick = thick;
    }
    Bottom(String wrapping) {
        this.wrapping = wrapping;
    }

}
