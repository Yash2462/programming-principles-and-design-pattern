package design_patterns.behavioural.observer.problem;

// WeatherStation.java
public class WeatherStation {
    private int temperature;
    private PhoneDisplay phoneDisplay;
    private TVDisplay tvDisplay;

    public WeatherStation(PhoneDisplay phone, TVDisplay tv) {
        this.phoneDisplay = phone;
        this.tvDisplay = tv;
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        phoneDisplay.update(temp);
        tvDisplay.update(temp);
    }
}
//WeatherStation is tightly coupled to specific display types.
//Adding a new display requires modifying WeatherStation.

