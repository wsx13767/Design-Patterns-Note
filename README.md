# Design-Patterns-Note

## 策略模式
> Duck 鴨子行為範例
>
> behavior盡量以HAS-A(有一個)，而不是用繼承
>
> Strategy Pattern 策略模式
```java
public abstract class Duck {
  // HAS-A 叫聲 interface
  QuackBehavior quackBehavior;
  // HAS-A 飛行行為 interface
  FlyBehavior flyBehavior;
  // 外觀
  public abstract void display();
  
  // 執行飛行
  public void performFly() {
    quackBehavior.fly();
  }
  
  // 執行叫
  public void performQuack() {
    quackBehavior.quack();
  }
}
```

## 觀察者模式

> Weather 天氣觀測站範例

```mermaid
classDiagram

Subject <|.. WeatherData

class Subject {
	<<interface>>
	+registerObserver(Observer observer)*
	+removeObserver()*
	+notifyObserver()*
}

class WeatherData {
	-List~Observer~ observers
	-float temperature
	-float humidity
	-float pressure
	+registerObserver(Observer observer)
	+removeObserver()
	+notifyObserver()
}

DisplayElement <|.. CurrentConditionDisplay
Observer <|.. CurrentConditionDisplay
Subject *.. CurrentConditionDisplay
class DisplayElement {
	<<interface>>
	+display()
}

class Observer {
	<<interface>>
	+update(float temp, float humidity, float pressure)
}

class CurrentConditionDisplay {
	-float temperature
	-float humidity
	-float pressure
	-Subject weatherData
	+CurrentConditionDisplay(WeatherData weatherData)
	+display()
	+update(float temp, float humidity, float pressure)
}

```



## 裝飾者模式

> Beverage 飲料販賣範例

```mermaid
classDiagram
Beverage <|-- CondimentDecorator
Beverage <|-- Espresso
Beverage <|-- DarkRoast
class Beverage {
 <<abstract>>
 #String description
 +cost()* double
 +getDescription() String
}

class Espresso {
  cost() double
}
class DarkRoast {
	cost() double
}


CondimentDecorator <|-- Mocha
CondimentDecorator <|-- Whip
class CondimentDecorator {
 <<abstract>>
 +getDescription()* String
}

class Mocha {
-Beverage beverage
+Mocha(Beverage beverage)
+cost() double
}
class Whip {
-Beverage beverage
+Mocha(Beverage beverage)
+cost() double
}
```
