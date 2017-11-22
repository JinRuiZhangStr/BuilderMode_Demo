package com.example.buildermode_demo;

/**
 * Created by 张金瑞 on 2017/11/22.
 */

public class Director {

    Builder mBuilder = null;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    public void construct(String board,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOs();
    }
}
