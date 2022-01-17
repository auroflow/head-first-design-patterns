package ch02_observer.observer;

/**
 * 依赖于 {@code Subject} 的观察者对象。
 */
public interface Observer {

  /**
   * 信息被「推送」（push）到各个 observer
   * @param temp 温度
   * @param humidity 湿度
   * @param pressure 气压
   */
  void update(float temp, float humidity, float pressure);
}
