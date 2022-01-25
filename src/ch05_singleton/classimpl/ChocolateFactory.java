package ch05_singleton.classimpl;

public class ChocolateFactory {

  public static void main(String[] args) {
    ChocolateBoiler boiler = ChocolateBoiler.getInstance();
    boiler.fill();
    boiler.boil();
    boiler.drain();
  }
}
