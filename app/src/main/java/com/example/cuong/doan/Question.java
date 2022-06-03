package com.example.cuong.doan;

import static android.R.attr.id;

/**
 * Created by Cuong on 5/8/2017.
 */

public class Question {
    private int id;
    private String content;

    public Question(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
