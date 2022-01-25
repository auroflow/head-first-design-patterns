package ch05_singleton.classimpl;

public class ChocolateBoiler {

  private volatile static ChocolateBoiler uniqueInstance;

  private boolean empty;
  private boolean boiled;

  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  public static ChocolateBoiler getInstance() {
    if (uniqueInstance == null) {
      synchronized (ChocolateBoiler.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new ChocolateBoiler();
        }
      }
    }
    return uniqueInstance;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
      System.out.println("Filled!");
    }
  }

  public void drain() {
    if (!isEmpty() && isBoiled()) {
      empty = true;
      System.out.println("Drained!");
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      boiled = true;
      System.out.println("Boiled!");
    }
  }

  public boolean isBoiled() {
    return boiled;
  }

  public boolean isEmpty() {
    return empty;
  }
}

