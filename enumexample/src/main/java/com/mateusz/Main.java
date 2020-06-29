package com.mateusz;

public class Main {
    public static void main(String[] args) {
        for (TShirtSize size : TShirtSize.values()) {
            System.out.println(size.ordinal() + ". " + size.name() + ", height: " + size.getHeight() +
                    ", chest length: " + size.getChestLength() + ", waist length: " + size.getWaistLength());
        }

        TShirtSize sizeL = TShirtSize.L;

        switch (sizeL) {
            case XS:
                System.out.println(TShirtSize.XS.ordinal() + " " + TShirtSize.XS.name());
                break;
            case S:
                System.out.println(TShirtSize.S.ordinal() + " " + TShirtSize.S.name());
                break;
            case M:
                System.out.println(TShirtSize.M.ordinal() + " " + TShirtSize.M.name());
                break;
            case L:
                System.out.println(TShirtSize.L.ordinal() + ". " + TShirtSize.L.name());
                break;
            case XL:
                System.out.println(TShirtSize.XL.ordinal() + " " + TShirtSize.XL.name());
                break;
        }
    }
}
