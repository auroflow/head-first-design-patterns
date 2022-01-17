package ch01_strategy.strategy;

public class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
