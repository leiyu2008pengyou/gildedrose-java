package com.gildedrose;

import static com.google.common.base.Charsets.UTF_8;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.google.common.io.Files;

public class GildedRoseTest {

  @Test
  public void foo() throws IOException {
    String itemsString = TexttestFixture.getItemsString();
    File file = new File("src/test/java/com/gildedrose/correctoutput.txt");
    String resultString = Files.toString(file, UTF_8);
    if (itemsString.trim().equals(resultString.trim())) {
      System.out.println("out put right");
    } else {
      System.out.println("out put wrong");
    }
  }
}
