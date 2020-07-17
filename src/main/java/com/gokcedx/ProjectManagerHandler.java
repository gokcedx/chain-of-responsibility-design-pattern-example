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
    }

    @Override
    public void solve(EnumProblem problem) {
        System.out.println("- Project Manager -");
        if (getEnumProblem().equals(problem)) {
            System.out.println("Problem solved by Project Manager!\n");
        } else if (getNextHandler() != null) {
            System.out.println("Problem redirect.");
            // redirect to next handler
            getNextHandler().solve(problem);
        } else {
            System.out.println("This problem is unsolvable. Maybe good reason to quit your job?");
        }
    }
}
