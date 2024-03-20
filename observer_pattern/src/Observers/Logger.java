package Observers;

public class Logger implements Observer{
    private float temperature;
    private float pressure;
    private float windSpeed;
    public Logger(){
        temperature = 0;
        pressure = 0;
        windSpeed = 0;
    }
    @Override
    public void updateValues(float t, float p, float w) {
        this.pressure = p;
        this.temperature = t;
        this.windSpeed = w;

        log();
    }
    public void log(){
        System.out.println("Hello from logger");
        System.out.println("Temperature: "+ temperature);
        System.out.println("Pressure: "+ pressure);
        System.out.println("Wind speed: "+ windSpeed);
    }
}
