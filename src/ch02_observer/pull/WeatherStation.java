package ch02_observer.pull;

/**
 * <p>
 *   THE OBSERVER PATTERN defines a one-to-many dependency between objects so
 *   that when one object changes state, all of its dependencies are notified
 *   and updated automatically.
 * </p><p>
 *   <strong>观察者模式</strong>定义了对象之间一对多的依赖关系，当一个对象改变状态时，所有依赖
 *   于它的对象都收到通知并自动更新。
 * </p>
 */
public class WeatherStation {

  public static void main(String[] args) {

    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay =
        new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);
  }
}
