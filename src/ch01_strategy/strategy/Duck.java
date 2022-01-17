package ch01_strategy.strategy;

public abstract class Duck {

  // Fly 和 quack 的「算法」这两个策略类中，可以通过下面的 set 函数插拔。
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {}

  public abstract void display();

  // Duck 类将 fly 这个行为「代理」（delegate）给策略对象。
  public void performFly() {
    flyBehavior.fly();
  }

  // 支持运行时改变对象行为。
  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}
