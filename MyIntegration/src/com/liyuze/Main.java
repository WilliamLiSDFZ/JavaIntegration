package com.liyuze;

/**
 * @author WilliamLi
 * @version 1.0
 * @date 2021/2/24 10:01
 */
public class Main {
    public static void main(String[] args) {
        JIntegration ji = new JIntegration() {
            @Override
            public double f(double x) {
                return x*x+2*x+6;
            }
        };
        System.out.println(ji.process(1,10,10000));
    }
}
