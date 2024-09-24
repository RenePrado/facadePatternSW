public class Light implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Light is now on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is now off");
    }
}
