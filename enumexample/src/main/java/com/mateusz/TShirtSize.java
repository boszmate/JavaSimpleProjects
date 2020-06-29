package com.mateusz;

public enum TShirtSize implements Size{
    XS(110, 50, 55),
    S(120, 55, 60),
    M(130, 60, 65),
    L(140, 65, 70),
    XL(140, 70, 75);

    private int height;
    private int chestLength;
    private int waistLength;

    TShirtSize(int height, int chestLength, int waistLength) {
        this.height = height;
        this.chestLength = chestLength;
        this.waistLength = waistLength;
    }

    public int getHeight() {
        return height;
    }

    public int getChestLength() {
        return chestLength;
    }

    public int getWaistLength() {
        return waistLength;
    }

}
