package ch03_decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.io.StringReader;

public class InputTest {

  public static void main(String[] args) {
    String input = "I know the Decorator Pattern therefore I RULE!";

    try (InputStream in = new LowerCaseInputStream(
        new BufferedInputStream(
            new StringBufferInputStream(input)))) {
      int c;
      while ((c = in.read()) >= 0) {
        System.out.print((char) c);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
