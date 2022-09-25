import com.sun.jdi.IntegerValue;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*int value = 33;
        changeValue(value);*/
        Integer[] value = new Integer[]{3, 4};
        changeValue(value);
        /*Arrays.stream(value).forEach(System.out::print);*/
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
        Person person = new Person("Lyapis", "Trubeckoi");
        changePerson(person);
        System.out.println(person.toString());
        changePerson1(person);
        System.out.println(person.toString());


    }

    static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
        System.out.println(person.toString());
    }


    static void changePerson1(Person person){
        person.setName(" Ilya");
        person.setSurname(" Lagutenko");

    }


    static void changeValue(Integer[] value) {
        value[0] = 99;


    }


   /* public static void changeValue (int value){
        value = 22;
        System.out.println(value);
    }*/
}