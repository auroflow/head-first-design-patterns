package ch02_observer.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

  // Is it better to get those two below directly from weatherData?
  private float temperature;
  private float humidity;
  private WeatherData weatherData;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    display();
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and "
        + humidity + "% humidity");
  }
}
