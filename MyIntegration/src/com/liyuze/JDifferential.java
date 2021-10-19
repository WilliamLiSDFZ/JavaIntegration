package com.liyuze;

/**
 * @author WilliamLi
 * @version 1.0
 * @date 2021/2/24 11:29
 */
public abstract class JDifferential {

    private static final double dx = 0.00000001;

    public abstract double f(double x);

    public final double process(double x0){
        return (f(x0+dx)-f(x0))/dx;
    }
}
