package ch01_strategy;

/**
 * <p>
 *   THE STRATEGY PATTERN defines a family of algorithms, encapsulates each one,
 *   and makes them interchangeable. Strategy lets the algorithm vary
 *   independently of clients that use it.
 * </p><p>
 *   <strong>策略模式</strong>定义了一系列算法，把每个算法封装起来，并使它们可以互相替代。
 *   策略模式可以让算法独立于使用它的对象而改变。
 * </p>
 */
public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
