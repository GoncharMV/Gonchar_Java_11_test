package com.grettastic;

import com.grettastic.brackets.BracketController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BracketControllerTest {

    private final BracketController bc = new BracketController();

    @Test
    void isValidBracketSequence_true() {
        String sequence = "{[()]}";

        Assertions.assertTrue(bc.isValidBracketSequence(sequence), "Validation successful");
    }

    @Test
    void isValidBracketSequence_false() {
        String sequence = "[((())()(())]]";

        Assertions.assertFalse(bc.isValidBracketSequence(sequence), "Validation unsuccessful");
    }

    @Test
    void fixBracketSequenceTest() {
        String sequence1 = "[((())()(())]]";
        String sequence2 = "[[]())";

        Assertions.assertEquals("(())()(())", bc.fixBracketSequence(sequence1), "Sequence does not match");
        Assertions.assertEquals("[]()", bc.fixBracketSequence(sequence2), "Sequence does not match");
        Assertions.assertTrue(bc.isValidBracketSequence(bc.fixBracketSequence(sequence1)),"Fixer is not working");
    }

}