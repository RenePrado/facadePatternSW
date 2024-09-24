public class TV implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("TV is now on");
    }
    public void turnOff() {
        System.out.println("TV is now off");
    }
}
