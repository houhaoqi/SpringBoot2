package com.haoqi.IOC;

import org.junit.Test;

/**
 * @author haoqi
 * @Date 2022/3/3 - 14:42
 */

//https://www.jianshu.com/p/ad05cfe7868e 《Spring》IOC实现原理

public class egsIOC {

    @Test
    public  void test() {
        // 建造车辆
        // 初始化
        int size = 30;
        Tire tire = new Tire(size);
        Bottom bottom = new Bottom(tire);
        Framework framework = new Framework(bottom);
        Car car = new Car(framework);
        car.run();
    }

}


//汽车模型
class Car{
    private Framework framework;
    Car(Framework framework){
        this.framework = framework;
    }
    public void run(){
        System.out.println("依赖注入：车辆运行。。。");
    }
}

//汽车框架
class Framework{
    private Bottom bottom;
    Framework(Bottom bottom){
        this.bottom = bottom;
    }
}

//汽车底盘
class Bottom{
    private Tire tire;
    Bottom(Tire tire){
        this.tire = tire;
    }
}

//汽车轮胎
class Tire{
    private int size; //尺寸
    Tire(int size){
        this.size = size;
        System.out.println("依赖注入动态：轮胎的尺寸："+size);
    }
}
