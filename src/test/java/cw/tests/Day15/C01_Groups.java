package cw.tests.Day15;

import org.testng.annotations.Test;

public class C01_Groups {
    @Test(groups = {"smoke"})
    public void smokeTest(){
        System.out.println("smoke test is running");

    }

    @Test(groups = {"regression"})
    public void regressionTest(){
        System.out.println("regression test is running");

    }
    @Test(groups = {"smoke","regression"})
    public void smokeRegressionTest(){
        System.out.println("smoke and regression test is running");

    }
}
