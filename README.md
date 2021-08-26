[TOC]



# Design-Patterns-Note

> * 封裝
> * 繼承
> * 多型
> * 抽象

## 策略模式
> Duck 鴨子行為範例
>
> behavior盡量以HAS-A(有一個)，而不是用繼承
>
> Strategy Pattern 策略模式
```mermaid
classDiagram
Duck *.. FlyBehavior
Duck *.. QuackBehavior

class Duck {
 <<abstract>>
 #QuackBehavior quackBehavior
 #FlyBehavior flyBehavior
 +performFly()
 +performQuack()
}
QuackBehavior <|.. MuteQuack
class QuackBehavior {
 <<interface>>
 +quack()
}
class MuteQuack {
 +quack()
}
FlyBehavior <|.. FlyWithWings
FlyBehavior <|.. FlyNoWay
class FlyBehavior {
  <<interface>>
  +fly()
}
class FlyWithWings {
 +fly()
}

class FlyNoWay {
 +fly()
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
Subject ..* CurrentConditionDisplay
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

## 工廠方法模式

> 於抽象類別定義抽象方法，將實際運作的方式交給次類別實踐

```mermaid
classDiagram

NYStylePizza --o NYStylePizzaStore

class NYStylePizzaStore {
  createPizza() Pizza
}

Pizza <|-- NYStylePizza
class Pizza {
 <<abstract>>
}
class NYStylePizza

PizzaStore <|-- NYStylePizzaStore

class PizzaStore {
 <<abstract>>
 +orderPizza() Pizza
 #createPizza()* Pizza
}

```



## 抽象工廠模式

> 建立介面、方法回傳的值也皆為介面，由實作物件去實踐這些方法、回傳的實際物件

```mermaid
classDiagram

PizzaIngredientFactory <|.. NYPizzaIngredientFactory
NYPizzaIngredientFactory --> ThinCrustDough
NYPizzaIngredientFactory --> MarinaraSauce

class PizzaIngredientFactory {
  <<interface>>
  +createDough()* Dough
  +createSauce()* Sauce
}
class NYPizzaIngredientFactory {
  +createDough() Dough
  +createSauce() Sauce
}

Dough <|.. ThinCrustDough

class Dough {
<<interface>>
}
class ThinCrustDough

Sauce <|.. MarinaraSauce
class Sauce {
  <<interface>>
}
class MarinaraSauce

Pizza <|-- ClamPizza

class Pizza {
  <<abstract>>
  String name;
  Dough dough;
  Sauce sauce;
  #prepare()*
  bake()
  cut()
  box()
  setName(String name)
  getName() String
}
class ClamPizza {
  PizzaIngredientFactory ingredientFactory
  +ClamPizza(PizzaIngredientFactory ingredientFactory)
  prepare()
}
ClamPizza --* NYPizzaStore
Pizza --* PizzaStore
PizzaStore <|-- NYPizzaStore
NYPizzaStore --> Sauce
NYPizzaStore --> Dough
NYPizzaStore --> PizzaIngredientFactory
class PizzaStore {
  <<abstract>>
  +orderPizza(String type) Pizza
  #createPizza(String type)* Pizza
}

class NYPizzaStore {
  #createPizza(String type)
}
```

```mermaid
sequenceDiagram
participant customer as 客戶
participant pizzaStore as 披薩店
participant ingredientFactory as 原物料工廠
customer ->>+ pizzaStore: order pizza
loop
pizzaStore ->>+ ingredientFactory: get ingredient(Dough,Sauce...)
ingredientFactory ->>- pizzaStore: give ingredient
end
pizzaStore ->>- customer: give pizza
```

## 獨體模式(singleton)

> 只能有一個實例

## 命令模式

> 將請求封裝為物件

```mermaid
classDiagram
SimpleRemoteControl --> Command
SimpleRemoteControl --> Light
Command <|.. LightOnCommand

class Command {
 <<interface>>
 +execute()* void
 +undo()* void
}

class Light {
  +on() void
  +off() void
}

class LightOnCommand {
  Light light
  +LightOnCommand(Light light)
  +execute()
}

class SimpleRemoteControl {
  -Command slot
  +setCommand(Command command) void
  +buttonWasPressed() void
}
```

