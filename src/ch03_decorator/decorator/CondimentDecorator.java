package ch03_decorator.decorator;

public abstract class CondimentDecorator extends Beverage {

  /**
   * 装饰器包裹的 Beverage 对象。注意这里的类型是超类 Beverage，它可以包裹任何饮料。
   */
  protected Beverage beverage;

  /**
   * 要求装饰器重写 getDescription 方法。
   * @return description
   */
  @Override
  public abstract String getDescription();
}
