package org.koans;

import static org.junit.Assert.assertEquals;

import java.util.function.Function;

import org.junit.Test;
import org.koans.helpers.Koans;

public class Lesson2Lambdas extends Koans
{
  public static String staticGoodNews(String name)
  {
    return "Good News " + name;
  }
  @Test
  public void annomousFunctionPointers()
  {
    Function<String, String> goodNews = Lesson2Lambdas::staticGoodNews;
    assertEquals("Good News Everybody", goodNews.apply("Everybody"));
  }
  public String goodNews(String name)
  {
    return "Good News " + name;
  }
  @Test
  public void annomousFunctionPointersOnObjects()
  {
    Function<String, String> goodNews = this::goodNews;
    assertEquals("Good News Everybody", goodNews.apply("Everybody"));
  }
  @Test
  public void annomousClasses()
  {
    Function<String, String> hi = new Function<String, String>()
    {
      @Override
      public String apply(String name)
      {
        return "Hi " + name;
      }
    };
    assertEquals("Hi Norm", hi.apply("Norm"));
  }
  @Test
  public void annomousLambda()
  {
    Function<String, String> hi = (String name) -> {
      return "Hi " + name;
    };
    assertEquals("Hi Norm", hi.apply("Norm"));
  }
  @Test
  public void smallerLambda1()
  {
    Function<String, String> hi = (String name) -> {
      return "Hi " + name;
    };
    assertEquals("Hi Norm", hi.apply("Norm"));
  }
  @Test
  public void smallerLambda2()
  {
    Function<String, String> hi = (n) -> "Hi " + n;
    assertEquals("Hi Norm", hi.apply("Norm"));
  }
  @Test
  public void smallerLambda3()
  {
    Function<String, String> hi = n -> "Hi " + n;
    assertEquals("Hi Norm", hi.apply("Norm"));
  }
  public static interface Hello
  {
    public String greet(String name);
  }
  @Test
  public void anySingleMethodInterface()
  {
    Hello hi = n -> "Hi " + n;
    assertEquals("Hi Norm", hi.greet("Norm"));
  }
  /********************************** helper code below ********************/
  /**
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   */
  String name = "Please fill in the blank";
  public String _______(String s)
  {
    return ___;
  }
  Function<String, String> ______ = n -> ___;
  public static String ____(String name)
  {
    return ___;
  }
}
