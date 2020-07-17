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
    }

    @Override
    public void solve(EnumProblem problem) {
        System.out.println("- Team Leader -");
        if (getEnumProblem().equals(problem)) {
            System.out.println("Problem solved by Team Leader!\n");
        } else if (getNextHandler() != null) {
            System.out.println("Problem redirect.");
            // redirect to next handler
            getNextHandler().solve(problem);
        } else {
            System.out.println("This problem is unsolvable. Maybe good reason to quit your job?");
        }
    }
}
