package ch04_factory.factory;

/**
 * <p>THE ABSTRACT FACTORY PATTERN provides an interface for creating families
 * of related of dependent objects without specifying their concrete classes.
 * </p>
 *
 * <p><b>抽象工厂模式</b>提供创建一系列相关或互相依赖的对象的接口，而不必指明它们的具体类型。</p>
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
