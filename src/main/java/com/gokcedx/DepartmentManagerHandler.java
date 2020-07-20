package com.gokcedx;

/**
 * chain-of-responsibility-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 13.07.2020
 */
public class DepartmentManagerHandler extends ProblemHandler {

    public DepartmentManagerHandler() {
        // Department Manager just handle the level_three problem
        super(EnumProblem.LEVEL_THREE);
        setHandlerName("Department Manager");
    }
}
