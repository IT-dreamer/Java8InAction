package lambdasinaction.common;

public class AppleSimpleFormatter implements AppleFormatter {
  public String accept(Apple apple){
    return "an apple of" + apple.getWeight() + " g";
  }
}
