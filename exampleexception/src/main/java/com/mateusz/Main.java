package com.mateusz;

import com.mateusz.exception.HumanLastNameWrongFormatException;
import com.mateusz.exception.HumanNameWrongFormatException;
import com.mateusz.exception.HumanNotFoundException;
import com.mateusz.model.Human;
import com.mateusz.service.HumanService;

public class Main {
    public static void main(String[] args) {

        // exercise 1
        int [] numbers = {1, 2, 4, 6, 9, 13};
        try {
            for (int i = 0; i < numbers.length + 1; i++) {
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("WARNING: Array index out of bounds!");
        }

        HumanService humanService = new HumanService();

        // exercise 2
        try {
            Human human = humanService.getHumanByLastName("Taylor");
        } catch (HumanNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Human human = humanService.getHumanById(3);
        } catch (HumanNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // exercise 3
        try {
            humanService.addHuman("Thomas", "Keller");
        } catch (HumanNameWrongFormatException eName) {
            System.out.println(eName.getMessage());
        } catch (HumanLastNameWrongFormatException eLastName) {
            System.out.println(eLastName.getMessage());
        }

        try {
            humanService.addHuman("Ki", "Muller");
        } catch (HumanNameWrongFormatException eName) {
            System.out.println(eName.getMessage());
        } catch (HumanLastNameWrongFormatException eLastName) {
            System.out.println(eLastName.getMessage());
        }

        // Java >= 7 - one catch block for few exceptions
        try {
            humanService.addHuman("Thomas", "Mu");
        } catch (HumanNameWrongFormatException | HumanLastNameWrongFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
