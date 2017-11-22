package com.example.buildermode_demo;

/**
 * Created by 张金瑞 on 2017/11/22.
 */

public class MacbookBuilder extends Builder {

    private Computer computer = new Macbook();
    @Override
    public void buildBoard(String board) {
        computer.setmBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        computer.setmDisplay(display);
    }

    @Override
    public void buildOs() {
        computer.setmOs();
    }

    @Override
    public Computer create() {
        return computer;
    }
}
