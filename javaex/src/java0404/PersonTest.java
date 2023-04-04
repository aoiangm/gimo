package java0404;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person(); // 디폴트 생성자
        person.name = "김유신";
        person.height = 180.0f;
        person.weight = 85.5f;

        Person personKim = new Person( "김춘추");

        Person personLee = new Person("이순신", 180, 80.1f);

        System.out.println(person.name);
        System.out.println(personKim.name);
        System.out.println(personLee.name);
    }
}
