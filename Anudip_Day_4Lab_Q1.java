package anudip_day_4lab_q1;
/**
 * @author Shubham Kumar
 */
class HillStations {

    // Method to be overridden
    public void location() {
        System.out.println("This is a hill station.");
    }

    // Method to be overridden
    public void famousFor() {
        System.out.println("Famous for its scenic beauty.");
    }
}
 class Manali extends HillStations {

    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is famous for its snow-capped mountains and adventure sports.");
    }
}
class Mussoorie extends HillStations {

    @Override
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its colonial heritage and scenic views.");
    }
}
class Gulmarg extends HillStations {

    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for its ski resorts and meadows.");
    }
}
public class Anudip_Day_4Lab_Q1 {
    public static void main(String[] args) {
        // Creating objects of subclasses
        HillStations manali = new Manali();
        HillStations mussoorie = new Mussoorie();
        HillStations gulmarg = new Gulmarg();

        // Calling methods of the subclass using the superclass reference
        System.out.println("Calling methods using superclass reference:");

        manali.location();
        manali.famousFor();

        mussoorie.location();
        mussoorie.famousFor();

        gulmarg.location();
        gulmarg.famousFor();

        // Calling methods of the subclass directly
        System.out.println("\nCalling methods using subclass references:");

        Manali manaliDirect = new Manali();
        Mussoorie mussoorieDirect = new Mussoorie();
        Gulmarg gulmargDirect = new Gulmarg();

        manaliDirect.location();
        manaliDirect.famousFor();

        mussoorieDirect.location();
        mussoorieDirect.famousFor();

        gulmargDirect.location();
        gulmargDirect.famousFor();
    }  
}
