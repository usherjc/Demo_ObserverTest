package com.usher.observertest_demo.observer;

/**
 * Created by UsherChen on 2017/8/11.
 * Details
 */

public class Observer1 implements BaseObserver {

    private OnGetInfoFromSubjectListener listener;

    @Override
    public void update(String info) {
        if (listener != null) {
            listener.onGetInfo(info + "observer1");
        }
    }

    public void setOnGetInfoFromSubjectListener(OnGetInfoFromSubjectListener listener) {
        this.listener = listener;
    }
}
