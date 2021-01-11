package com.gildedrose;

import static com.gildedrose.Constant.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class TexttestFixture {
  public static void main(String[] args) {
    String outputString = getItemsString();
    System.out.println(outputString);
  }

  public static String getItemsString() {
    OutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);
    printStream.println("OMGHAI!");

    Item[] items = new Item[]{
        new Item("+5 Dexterity Vest", 10, 20), //
        new AgedBrieItem(AGED_BRIE, 2, 0), //
        new Item("Elixir of the Mongoose", 5, 7), //
        new SulfurasItem(SULFURAS_HAND_OF_RAGNAROS, 0, 80), //
        new SulfurasItem(SULFURAS_HAND_OF_RAGNAROS, -1, 80),
        new BackstagePasssesItem(BACKSTAGE_PASSSES_TO_A_TAFKAL80ETC_CONCERT, 15, 20),
        new BackstagePasssesItem(BACKSTAGE_PASSSES_TO_A_TAFKAL80ETC_CONCERT, 10, 49),
        new BackstagePasssesItem(BACKSTAGE_PASSSES_TO_A_TAFKAL80ETC_CONCERT, 5, 49),
        new BackstagePasssesItem(BACKSTAGE_PASSSES_TO_A_TAFKAL80ETC_CONCERT, 1, 20),
        new Item("Conjured Mana Cake", 3, 6)};

    GildedRose app = new GildedRose(items);

    int days = 3;
    for (int i = 0; i < days; i++) {
      printStream.println("-------- day " + i + " --------");
      printStream.println("name, sellIn, quality");
      for (Item item : items) {
        printStream.println(item);
      }
      printStream.println();
      app.updateQuality();
    }
    return outputStream.toString();
  }
}
