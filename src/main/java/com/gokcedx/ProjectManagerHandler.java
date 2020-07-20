package com.gokcedx;

/**
 * chain-of-responsibility-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 13.07.2020
 */
public class ProjectManagerHandler extends ProblemHandler {

    public ProjectManagerHandler() {
        // Project Manager just handle the level_two problem
        super(EnumProblem.LEVEL_TWO);
        setHandlerName("Project Manager");
    }
}
