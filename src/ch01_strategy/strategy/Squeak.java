package ch01_strategy.strategy;

public class Squeak implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
