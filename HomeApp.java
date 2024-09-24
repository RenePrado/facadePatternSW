public class HomeApp {
    public static void main (String [] args) {
       HomeService light = new Light();
       HomeService tv = new TV();
       HomeService airConditioning = new AirConditioning();

       HomeInterface homeInterface = new HomeInterface(light, tv, airConditioning);

       homeInterface.turnOnAll();
       homeInterface.turnOffAll();
    }
}
