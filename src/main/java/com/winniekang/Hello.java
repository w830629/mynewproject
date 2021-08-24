package com.winniekang;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person p = new Person("Winnie",66.5f, 1.7f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score < 80 ||  score>90);
        char c = 'A';  // 大寫A字元值是65
        System.out.println(c > 'a');  // 小寫a字元值是97
//        int age = 19;
//        Integer age2 = 19;
//        char c  = '哈';
//        Character c2 = 'A';
//        byte b = 120;
//        float weight = 52.5f;
//        float height = 1.65f;
//        boolean adult = true;
//        boolean enroll = false;
//        String name = "Happy";

    }
}
