package com.gokcedx;

/**
 * chain-of-responsibility-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 13.07.2020
 */
public enum EnumProblem {

    LEVEL_ONE("Level 1 Problem"), //team lader
    LEVEL_TWO("Level 2 Problem"), //project manager
    LEVEL_THREE("Level 3 Problem"), //department manager
    LEVEL_FOUR("Level 4 Problem"), //ceo
    LEVEL_FIVE("Level 5 Problem"); //unsolvable

    private String level;

    EnumProblem(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return level;
    }
}
