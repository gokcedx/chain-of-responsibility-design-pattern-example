package com.gokcedx;

/**
 * chain-of-responsibility-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 13.07.2020
 */
public abstract class ProblemHandler {
    private EnumProblem enumProblem;
    private ProblemHandler nextHandler = null;

    public ProblemHandler(EnumProblem enumProblem) {
        this.enumProblem = enumProblem;
    }

    public ProblemHandler getNextHandler() {
        return nextHandler;
    }

    // next handler has been set
    public ProblemHandler setNextHandler(ProblemHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    public EnumProblem getEnumProblem() {
        return enumProblem;
    }

    public abstract void solve(EnumProblem enumProblem);

}
