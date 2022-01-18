package ch03_decorator.decorator;

/**
 * <p>
 *   THE DECORATOR PATTERN attaches additional responsibilities to an object
 *   dynamically. Decorators provide a flexible alternative to subclassing for
 *   extending functionality.
 * </p><p>
 *   <b>装饰器模式</b>为对象动态添加新的职责。装饰器提供了比生成子类更灵活的添加功能的方式。
 * </p>
 *
 */
public class StarbuzzCoffee {

  public static void main(String[] args) {
    Beverage beverage1 = new Espresso();
    System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    Beverage beverage2 = new Whip(new Mocha(new Mocha(new DarkRoast())));
    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())));
    System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
  }
}
