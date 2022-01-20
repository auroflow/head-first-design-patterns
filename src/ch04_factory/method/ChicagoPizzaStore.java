package ch04_factory.method;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    return switch (type) {
      case "cheese"    -> new ChicagoStyleCheesePizza();
      case "veggie"    -> new ChicagoStyleVeggiePizza();
      case "clam"      -> new ChicagoStyleClamPizza();
      case "pepperoni" -> new ChicagoStylePepperoniPizza();
      default          -> null;
    };
  }
}
