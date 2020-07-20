package com.gokcedx;

/**
 * chain-of-responsibility-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 13.07.2020
 */
public abstract class ProblemHandler {

    private EnumProblem enumProblem;
    private String handlerName;
    private ProblemHandler nextHandler = null;

    public ProblemHandler(EnumProblem enumProblem) {
        this.enumProblem = enumProblem;
    }

    // next handler has been set
    public ProblemHandler setNextHandler(ProblemHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    public ProblemHandler getNextHandler() {
        return nextHandler;
    }

    public void solve(EnumProblem problem) {
        System.out.println("- " + getHandlerName() + " -");
        if (getEnumProblem().equals(problem)) {
            System.out.println("Problem solved by " + getHandlerName() + "!\n");
        } else if (getNextHandler() != null) {
            System.out.println("Problem redirect.");
            // redirect to next handler
            getNextHandler().solve(problem);
        } else {
            System.out.println("This problem is unsolvable. Maybe, good reason to quit your job??");
        }
    }

    public EnumProblem getEnumProblem() {
        return enumProblem;
    }

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }
}
