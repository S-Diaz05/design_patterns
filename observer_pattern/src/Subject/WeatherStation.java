package Subject;

import Observers.Observer;
import Subject.Subject;

import java.util.ArrayList;

public class WeatherStation implements Subject {
    private float temperature;
    private float windSpeed;
    private float pressure;
    private ArrayList<Observer> observers;
    public WeatherStation(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o: observers){
            o.updateValues(this.temperature, this.pressure, this.windSpeed);
        }
    }

    @Override
    public void setWindSpeed(float w) {
        this.windSpeed = w;
        notifyObserver();
    }

    @Override
    public void setPressure(float p) {
        this.pressure = p;
        notifyObserver();
    }

    @Override
    public void setTemperature(float t) {
        this.temperature = t;
        notifyObserver();
    }


}
