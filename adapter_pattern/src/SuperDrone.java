public class SuperDrone implements Drone{

    @Override
    public void beep() {
        System.out.println("Beep veep beep");
    }

    @Override
    public void spin_rotors() {
        System.out.println("Rotors are spining" );
    }

    @Override
    public void take_off() {
        System.out.println("Taking off");
    }
}
