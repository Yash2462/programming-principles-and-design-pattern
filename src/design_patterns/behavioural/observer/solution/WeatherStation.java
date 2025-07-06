package design_patterns.behavioural.observer.solution;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private int temperature;
    private List<Display> displays = new ArrayList<>();

    public void addDisplay(Display display) {
        displays.add(display);
    }

    public void removeDisplay(Display display) {
        displays.remove(display);
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        notifyDisplays();
    }

    private void notifyDisplays() {
        for (Display d : displays) {
            d.update(temperature);
        }
    }

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        station.addDisplay(new TVDisplay());
        station.addDisplay(new PhoneDisplay());

        station.setTemperature(25);
    }
}
