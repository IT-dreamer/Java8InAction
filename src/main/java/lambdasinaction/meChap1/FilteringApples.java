package lambdasinaction.meChap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lambdasinaction.common.Apple;

public class FilteringApples {

  public static void main(String[] args) {
    List<Apple> inventory = Stream.of(
            new Apple("aaa", 80, "green"),
            new Apple("bbb", 100, "red"),
            new Apple("ccc", 120, "yellow"))
        .collect(Collectors.toList());

    List<Apple> greenApples = filterApplesByPredicate(inventory, FilteringApples::isGreenApple);
    List<Apple> redApples = filterApplesByPredicate(inventory, (Apple a) -> a.getColor().equals("red"));
    System.out.println(greenApples);
  }

  public static boolean isGreenApple(Apple apple) {
    return "green".equals(apple.getColor());
  }

  public static boolean isRedApple(Apple apple) {
    return "red".equals(apple.getColor());
  }

  public static boolean isYellowApple(Apple apple) {
    return "yellow".equals(apple.getColor());
  }

  public static boolean isBlueApple(Apple apple) {
    return "blue".equals(apple.getColor());
  }

  public static boolean isHeavyApple(Apple apple) {
    return apple.getWeight() > 110;
  }

  public static List<Apple> filterApplesByValue(List<Apple> inventory) {
    List<Apple> filteredApples = new ArrayList<>();
    for (Apple apple : inventory) {
      if (isGreenApple(apple)) {
        filteredApples.add(apple);
      }
    }
    return filteredApples;
  }

  public static List<Apple> filterApplesByPredicate(List<Apple> inventory, Predicate<Apple> predicate) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (predicate.test(apple)) {
        result.add(apple);
      }
    }
    return result;
  }
}
