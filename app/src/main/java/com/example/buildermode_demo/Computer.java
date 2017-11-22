package com.example.buildermode_demo;

/**
 * Created by 张金瑞 on 2017/11/22.
 */

public abstract class Computer {

    private String mBoard; //cpu核心数
    private String mDisplay; //内存
    public static String mOs; //操作系统


    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setmOs();

    @Override
    public String toString() {
        return "Computer [mBoard="+mBoard+", mDisplay="+mDisplay+",mOs="+mOs+"]";
    }
}
