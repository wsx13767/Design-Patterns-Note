# Design-Patterns-Note

## Duck
> behavior盡量以HAS-A(有一個)，而不是用繼承
>
> Strategy Pattern 策略模式
```java
public abstract class Duck {
  // 叫聲 interface
  QuackBehavior quackBehavior;
  // 飛行行為 interface
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
