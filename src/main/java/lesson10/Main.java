package lesson10;

import lesson10.impl.DogServiceImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DogService dogService = new DogServiceImpl();

        DogServiceImpl dogService1 = new DogServiceImpl();

        System.out.println(dogService instanceof DogService);
        System.out.println(dogService1 instanceof DogService);
        FunctionalInterfaceExample functionalInterfaceExample = String::hashCode;

        System.out.println(functionalInterfaceExample.getName("Jack"));

        int[] array = new int[]{4, 2, 3, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
