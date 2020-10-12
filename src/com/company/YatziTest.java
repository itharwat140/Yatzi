package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {

    @Test
    void CheckIfYatziDontWork() {
        Dice[] dices = new Dice[5];
        for (int i = 0; i < dices.length; i++) {
            dices[i] = new Dice();
            dices[i].setValue(2);
        }
        dices[4].setValue(1);
        assertFalse(YatziMain.YatziOrNot(dices));
    }

    @Test
    void CheckIfYatziWorks() {
        Dice[] dices = new Dice[5];
        for (int i = 0; i < dices.length; i++) {
            dices[i] = new Dice();
            dices[i].setValue(6);
        }
        assertTrue(YatziMain.YatziOrNot(dices));
    }



    @Test
    void Yatzi() {
        Dice[] allDices = {new Dice(),new Dice(), new Dice(), new Dice(), new Dice()};
        for (Dice Dice : allDices) {
            Dice.setValue(6);
        }
        assertTrue(YatziMain.YatziOrNot(allDices));
    }
}


