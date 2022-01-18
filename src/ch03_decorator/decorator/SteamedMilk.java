package ch03_decorator.decorator;

public class SteamedMilk extends CondimentDecorator {

  public SteamedMilk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Steamed milk";
  }

  @Override
  public double cost() {
    return beverage.cost() + .10;
  }
}
