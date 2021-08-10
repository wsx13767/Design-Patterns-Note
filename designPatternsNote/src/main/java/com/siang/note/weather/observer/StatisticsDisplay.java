package com.siang.note.weather.observer;

import com.siang.note.weather.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }
}
