package com.example.buildermode_demo;

/**
 * Created by 张金瑞 on 2017/11/22.
 */

public abstract class Builder {
    //设置主机
    public abstract void buildBoard(String board);
    //设置显示器
    public abstract void buildDisplay(String display);
    //设置系统
    public abstract void buildOs();
    //创建computer
    public abstract Computer create();

}
