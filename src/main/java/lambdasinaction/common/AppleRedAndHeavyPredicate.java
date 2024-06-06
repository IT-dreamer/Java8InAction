package lambdasinaction.common;
public class AppleRedAndHeavyPredicate implements ApplePredicate{
  public boolean test(Apple apple) {
    return "red".equals(apple.getColor()) && apple.getWeight() > 100;
  }
}
