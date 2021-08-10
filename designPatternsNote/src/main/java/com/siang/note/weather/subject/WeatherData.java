package com.siang.note.weather.subject;

import com.siang.note.weather.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 當氣象站得到新數據時，通知觀察者
     */
    public void measurementsChanged() {
        notifyObserver();
    }

    /**
     * 更新數據，並通知觀察者
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
