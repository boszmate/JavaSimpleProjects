package com.mateusz.validator;

import com.mateusz.exception.HumanLastNameWrongFormatException;
import com.mateusz.exception.HumanNameWrongFormatException;

public class HumanValidator {

    public static boolean isHumanNameCorrect(String name) throws HumanNameWrongFormatException {
        if (name.length() > 3) {
            return true;
        }
        throw new HumanNameWrongFormatException(name + " has wrong format!");
    }

    public static boolean isHumanLastNameCorrect(String lastName) throws HumanLastNameWrongFormatException {
        if (lastName.length() > 5) {
            return true;
        }
        throw new HumanLastNameWrongFormatException(lastName + " has wrong format!");
    }
}
