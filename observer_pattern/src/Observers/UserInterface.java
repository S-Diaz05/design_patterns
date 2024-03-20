package Observers;

public class UserInterface implements Observer{
    private float temperature;
    private float pressure;
    private float windSpeed;
    public UserInterface(){
        temperature = 0;
        pressure = 0;
        windSpeed = 0;
    }
    @Override
    public void updateValues(float t, float p, float w) {
        this.pressure = p;
        this.temperature = t;
        this.windSpeed = w;

        display();
    }
    public void display(){
        System.out.println("Hello from user interface");
        System.out.println("Temperature: "+ temperature);
        System.out.println("Pressure: "+ pressure);
        System.out.println("Wind speed: "+ windSpeed);
    }
}
