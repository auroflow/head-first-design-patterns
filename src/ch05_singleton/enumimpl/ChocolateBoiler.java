package ch05_singleton.enumimpl;

public enum ChocolateBoiler {

  UNIQUE_INSTANCE;

  private boolean empty;
  private boolean boiled;

  ChocolateBoiler() {
    empty = true;
    boiled = false;
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
