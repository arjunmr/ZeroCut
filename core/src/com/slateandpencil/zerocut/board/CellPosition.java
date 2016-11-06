package com.slateandpencil.zerocut.board;

/**
 * Created by Akhil on 06-11-2016.
 */

public class CellPosition {
    public static final String TAG = CellPosition.class.getName();
    int sub_r;
    int sub_c;
    int r;
    int c;

    public CellPosition(CellPosition position) {
        this.sub_r = position.sub_r;
        this.sub_c = position.sub_c;
        this.r = position.r;
        this.c = position.c;
    }

    public CellPosition(int sub_r, int sub_c, int r, int c) {
        this.sub_r = r;
        this.sub_c = c;
        this.r = r;
        this.c = c;
    }

    @Override
    public String toString() {
        return "sub_r:" + sub_r + ", sub_c: " + sub_c + ", r: " + r + ", c: "+c;
    }

    public int getSubRow() {
        return sub_r;
    }

    public int getSubColumn() {
        return sub_c;
    }

    public int getRow() {
        return r;
    }

    public int getColumn() {
        return c;
    }
}
