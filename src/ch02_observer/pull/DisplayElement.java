package ch02_observer.pull;

/**
 * 本程序里所有的 {@code Observer} 都有显示信息的功能，因此也要实现这个接口。
 */
public interface DisplayElement {

  void display();
}
