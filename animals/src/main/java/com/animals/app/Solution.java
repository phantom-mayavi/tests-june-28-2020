package com.animals.app;

import com.animals.Bird;
import com.animals.Chicken;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        Chicken.Rooster rooster = new Chicken.Rooster();
        rooster.sing();
    }
}
