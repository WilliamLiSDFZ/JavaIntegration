package com.liyuze;

/**
 * @author WilliamLi
 * @version 1.0
 * @date 2021/2/24 9:54
 */
public abstract class JIntegration {

    public abstract double f(double x);

    public final double process(double a,double b,long accuracy){
        double section = (b-a)/accuracy * 0.5;
        double currentX = a;
        double result = 0;
        for (int i=0;i<accuracy;i++){
            currentX += section;
            result += f(currentX) * section * 2;
            currentX += section;
        }
        return result;
    }
}
