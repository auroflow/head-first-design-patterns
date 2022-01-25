package ch05_singleton.enumimpl;

public class ChocolateFactory {

  public static void main(String[] args) {
    ChocolateBoiler boiler = ChocolateBoiler.UNIQUE_INSTANCE;
    boiler.fill();
    boiler.boil();
    boiler.drain();
  }
}
