package ch02_observer.pull;

/**
 * 保存状态的对象。
 */
public interface Subject {

  void registerObserver(Observer o);
  void removeObserver(Observer o);
  void notifyObservers();
}
