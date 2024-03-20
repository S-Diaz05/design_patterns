package Observers;

public class AlertSystem implements Observer{
    private float temperature;
    private float pressure;
    private float windSpeed;
    public AlertSystem(){
        temperature = 0;
        pressure = 0;
        windSpeed = 0;
    }
    @Override
    public void updateValues(float t, float p, float w) {
        this.pressure = p;
        this.temperature = t;
        this.windSpeed = w;

        alert();
    }
    public void alert(){
        System.out.println("Hello from alert system");
        System.out.println("Temperature: "+ temperature);
        System.out.println("Pressure: "+ pressure);
        System.out.println("Wind speed: "+ windSpeed);
    }
}
