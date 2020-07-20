package com.gokcedx;

/**
 * chain-of-responsibility-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 13.07.2020
 */
public class HandlerChain {

    private ProblemHandler teamLeaderHandler = new TeamLeaderHandler();
    private ProblemHandler projectManagerHandler = new ProjectManagerHandler();
    private ProblemHandler departmentManagerHandler = new DepartmentManagerHandler();
    private ProblemHandler ceoHandler = new CeoHandler();

    // chain of responsibility
    public HandlerChain() {
        teamLeaderHandler.setNextHandler(
                projectManagerHandler.setNextHandler(
                        departmentManagerHandler.setNextHandler(
                                ceoHandler
                        )));
    }

    public void solve(EnumProblem problem) {
        teamLeaderHandler.solve(problem);
    }
}
