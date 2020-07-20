package com.gokcedx;

/**
 * chain-of-responsibility-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 13.07.2020
 */
public class TeamLeaderHandler extends ProblemHandler {

    public TeamLeaderHandler() {
        // Team Leader just handle the level_one problem
        super(EnumProblem.LEVEL_ONE);
        setHandlerName("Team Leader");
    }
}
