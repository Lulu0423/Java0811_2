package com.pcschool.ocp.d08;

import java.util.Arrays;

public class BallStore2 {
    public static void main(String[] args) {
        final Ball target = new Ball("Red", 100);
        Ball[] balls = {
            new Ball("Red", 100),
            new Ball("Blue", 100),
            new Ball("Red", 100),
            new Ball("Yellow", 300),
            new Ball("Red", 200),
        };
        // 請將符合 target 的 Ball 列出 ?
        Arrays.stream(balls)
                .filter(b -> b.equals(target)).forEach(System.out::println);
    }
}
