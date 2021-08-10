package com.siang.note.weather.observer;

import com.siang.note.weather.subject.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    /**
     * 建立觀察者，帶入訂閱的主題
     * @param weatherData
     */
    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degress and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
}
