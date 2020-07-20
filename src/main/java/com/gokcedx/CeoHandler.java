package com.gokcedx;

/**
 * chain-of-responsibility-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 13.07.2020
 */
public class CeoHandler extends ProblemHandler {

    public CeoHandler() {
        // CEO just handle the level_four problem
        super(EnumProblem.LEVEL_FOUR);
        setHandlerName("CEO");
    }
}
