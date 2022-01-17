package ch01_strategy.strategy;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack");
  }
}
