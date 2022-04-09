package teacher;

class Teacher{
    int age = 30;
}

class Child extends Teacher{
    int age = 10;
}

class Main
{
 public static void main(String[] args)
 {
        Teacher obj  = new Child();
        System.out.println(obj.age);
    }
}