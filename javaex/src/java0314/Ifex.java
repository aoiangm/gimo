package java0314;

public class Ifex {
    public static void onlyif(int age) {
        int charge;
        if (age < 8) {
            charge = 1000;
            System.out.println("취학전 아동입니다");
        }  if (age <14) {
            charge = 2000;
            System.out.println("초등학생입니다");
        }  if (age < 20) {
            charge = 3000;
            System.out.println("중고등학생입니다");
        } else {
            charge = 4000;
            System.out.println("성인입니다");
        }
        System.out.println("입장료는 " + charge + "원 입니다" );
    }
    public static void main(String[] args) {
        int age = 40;
        int charge;

        if (age < 8) {
            charge = 1000;
            System.out.println("취학전 아동입니다");
        } else if (age >= 9 && age <14) {
            charge = 2000;
            System.out.println("초등학생입니다");
        } else if (age < 20) {
            charge = 3000;
            System.out.println("중고등학생입니다");
        } else {
            charge = 4000;
        }
        System.out.println("입장료는 " + charge + "원 입니다" );

        onlyif(age);
    }
}
