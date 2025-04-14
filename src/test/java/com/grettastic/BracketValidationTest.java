package com.grettastic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BracketValidationTest {

    @Test
    void isValidBracketSequence_true() {
        String sequence = "{(())}";

        Assertions.assertTrue(BracketValidation.isValidBracketSequence(sequence), "Validation successful");
    }

    @Test
    void isValidBracketSequence_false() {
        String sequence = "[((())()(())]]";

        Assertions.assertFalse(BracketValidation.isValidBracketSequence(sequence), "Validation unsuccessful");
    }

}