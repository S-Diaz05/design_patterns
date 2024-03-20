public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        testDuck(mallardDuck);

        Drone superDrone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(superDrone);

        testDuck(droneAdapter);

    }
    static void testDuck(Duck duck){
        duck.quack(); duck.fly();
    }
}
