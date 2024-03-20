package Subject;

import Observers.Observer;

public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
    public void setWindSpeed(float w);
    public void setPressure(float p);
    public void setTemperature(float t);


}
