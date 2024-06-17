package lambdasinaction.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lambdasinaction.common.Apple;

public class InventoryInitializer {

  int count;
  List<Apple> inventory = new ArrayList<>();

  public static void main(String[] args) {
    System.out.println("Run InventoryInitializer");
  }

  public InventoryInitializer() {
    count = 5;
    inventory = Stream.of(
        new Apple("aaa", 80, "green"),
        new Apple("bbb", 100, "red"),
        new Apple("ccc", 120, "yellow"),
        new Apple("ddd", 160, "blue"),
        new Apple("eee", 135, "gray")
    ).collect(Collectors.toList());
  }
}
