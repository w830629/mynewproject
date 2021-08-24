package com.winniekang;

public class Person  {
    String name;
    float weight;  // Person 屬性裡的field
    float height;
    public Person(float weight,float height) {
        this.weight = weight; //把傳進來的屬性 + this
        this.height = height;
    }
    public Person(String name, float weight, float height) {
        this(weight, height);//this()一定要在建構子的第一行
        this.name = name;

    }


    public float bmi(){
        float bmi = weight / (height*height);
        return bmi;
    }


    public void hello() {

        System.out.println("Hello world");
    }
}