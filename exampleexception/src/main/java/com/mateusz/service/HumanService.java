package com.mateusz.service;

import com.mateusz.exception.HumanLastNameWrongFormatException;
import com.mateusz.exception.HumanNameWrongFormatException;
import com.mateusz.exception.HumanNotFoundException;
import com.mateusz.model.Human;
import com.mateusz.validator.HumanValidator;

import java.util.ArrayList;
import java.util.List;

import static com.mateusz.validator.HumanValidator.isHumanLastNameCorrect;

public class HumanService {
    List<Human> humans;

    public HumanService() {
        humans = new ArrayList<>();
    }

    public void addHuman(String name, String lastName) throws HumanNameWrongFormatException, HumanLastNameWrongFormatException {
        if (HumanValidator.isHumanNameCorrect(name) && isHumanLastNameCorrect(lastName)) {
            Human human = new Human(getNextHumanId(), name, lastName);
            humans.add(human);
        }
    }

    public int getNextHumanId() {
        return humans.size() + 1;
    }

    public Human getHumanByLastName(String lastName) throws HumanNotFoundException{
        for (Human human : humans) {
            if (human.getLastname().equals(lastName)) {
                return human;
            }
        }
        throw new HumanNotFoundException(lastName + " not found!");
    }

    public Human getHumanById(int id) throws HumanNotFoundException{
        for (Human human : humans) {
            if (human.getId() == id) {
                return human;
            }
        }
        throw new HumanNotFoundException( id + " not found!");
    }
}
