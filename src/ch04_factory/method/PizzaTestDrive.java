package ch04_factory.method;

/**
 * <p>THE FACTORY METHOD PATTERN defines an interface for creating an object,
 * but lets subclasses "decide" which class to instantiate. Factory Method lets
 * a class defer instantiation to subclasses. </p>
 *
 * <p>By "decide" we do not mean the subclasses themselves decide, but rather
 * that the decision comes down to which subclass is used.</p>
 *
 * <p><b>工厂方法模式</b>为对象的创建定义接口，但让子类<em>决定</em>应该实例化哪个类。工厂方法
 * 模式使得实例化推迟到子类中进行。</p>
 *
 * <p>这里的<em>决定</em>不是指子类自己决定，而是指由选择使用哪个子类决定。</p>
 */
public class PizzaTestDrive {

  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");

    pizza = nyStore.orderPizza("clam");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    pizza = chicagoStore.orderPizza("clam");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");

    pizza = nyStore.orderPizza("pepperoni");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    pizza = chicagoStore.orderPizza("pepperoni");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");

    pizza = nyStore.orderPizza("veggie");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    pizza = chicagoStore.orderPizza("veggie");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
  }
}
