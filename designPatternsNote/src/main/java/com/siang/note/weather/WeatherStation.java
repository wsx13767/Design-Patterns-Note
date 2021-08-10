package com.siang.note.weather;

import com.siang.note.weather.observer.CurrentConditionDisplay;
import com.siang.note.weather.observer.HeatIndexDisplay;
import com.siang.note.weather.observer.StatisticsDisplay;
import com.siang.note.weather.subject.WeatherData;


public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);


        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
