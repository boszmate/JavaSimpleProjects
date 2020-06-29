package com.mateusz;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
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

        // Exercise 2
        // create EnumSet with elements
        EnumSet<Operations> computerOperations = EnumSet.of(Operations.ON, Operations.OFF, Operations.HIBERNATE, Operations.COPY, Operations.CUT, Operations.PASTE);

        // create enumSet via add
        EnumSet<Operations> textEditorOperations = EnumSet.noneOf(Operations.class);
        textEditorOperations.add(Operations.CREATE);
        textEditorOperations.add(Operations.COPY);
        textEditorOperations.add(Operations.CUT);
        textEditorOperations.add(Operations.PASTE);
        textEditorOperations.add(Operations.SAVE);

        // create EnumSet with all elements of enum
        EnumSet<Operations> allOperations = EnumSet.allOf(Operations.class);
        allOperations.remove(Operations.CREATE);
        allOperations.remove(Operations.COPY);
        allOperations.remove(Operations.CLOSE);

        System.out.println("Size of computerOperations: " + computerOperations.size() + " and elements of computerOperations: " + computerOperations.toString());
        System.out.println("Size of textEditorOperations: " + textEditorOperations.size() + " and elements of textEditorOperations: " + textEditorOperations.toString());
        System.out.println("Size of allOperations: " + allOperations.size() + " and elements of allOperations: " + allOperations.toString());
    }
}
