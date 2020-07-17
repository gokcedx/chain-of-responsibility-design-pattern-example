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
    }

    @Override
    public void solve(EnumProblem problem) {
        System.out.println("- CEO -");
        if (getEnumProblem().equals(problem)) {
            System.out.println("Problem solved by CEO!\n");
        } else if (getNextHandler() != null) {
            System.out.println("Problem redirect.");
            // redirect to next handler
            getNextHandler().solve(problem);
        } else {
            System.out.println("This problem is unsolvable. Maybe good reason to quit your job?");
        }
    }
}
