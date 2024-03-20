public class DroneAdapter implements Duck{
    Drone drone;
    public DroneAdapter(Drone drone){
            this.drone = drone;
    }
    @Override
    public void quack() {
        drone.beep();
    }

    @Override
    public void fly() {
        for(int i =0; i < 4; i++)
            drone.spin_rotors();

        drone.take_off();
    }
}
