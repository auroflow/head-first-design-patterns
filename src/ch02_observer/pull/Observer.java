package ch02_observer.pull;

/**
 * 依赖于 {@code Subject} 的观察者对象。
 */
public interface Observer {

  /**
   * 只是通知各个 observer 状态已更新，由 observer 自己获取
   */
  void update();
}
