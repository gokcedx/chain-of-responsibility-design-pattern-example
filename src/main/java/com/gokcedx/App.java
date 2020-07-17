package com.gokcedx;

/**
 * chain-of-responsibility-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 13.07.2020
 */
public class App {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();

        System.out.println("(LEVEL ONE PROBLEM CHAIN)");
        handlerChain.solve(EnumProblem.LEVEL_ONE);

        System.out.println("---------------------\n");

        System.out.println("(LEVEL TWO PROBLEM CHAIN)");
        handlerChain.solve(EnumProblem.LEVEL_TWO);

        System.out.println("---------------------\n");

        System.out.println("(LEVEL THREE PROBLEM CHAIN)");
        handlerChain.solve(EnumProblem.LEVEL_THREE);

        System.out.println("---------------------\n");

        System.out.println("(LEVEL FOUR PROBLEM CHAIN)");
        handlerChain.solve(EnumProblem.LEVEL_FOUR);

        System.out.println("---------------------\n");

        System.out.println("(LEVEL FIVE PROBLEM CHAIN)");
        handlerChain.solve(EnumProblem.LEVEL_FIVE);

    }
}
