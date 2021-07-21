package org.jobrad.challenge;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {

  static String[] readWordlist() {
    try {
      return new String(
        Files.readAllBytes(
          Paths.get(
            App.class.getClassLoader().getResource("wordlist.txt").toURI()
          )
        )
      )
      .split("\n");
    } catch (IOException | URISyntaxException e) {
      return new String[0];
    }
  }

  public static void main(String[] args) {
    String[] wordlist = readWordlist();
    System.out.println(wordlist.length);
  }
}
