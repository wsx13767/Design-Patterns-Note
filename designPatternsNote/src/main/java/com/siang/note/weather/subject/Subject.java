package com.siang.note.weather.subject;

import com.siang.note.weather.observer.Observer;

public interface Subject {
    /**
     * 註冊觀察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除觀察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知觀察者
     */
    void notifyObserver();
}
