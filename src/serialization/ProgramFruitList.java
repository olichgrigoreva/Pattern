package serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProgramFruitList {
    public static void main(String[] args) {

//        List<Fruit> fruits = new ArrayList<>();
//
//        fruits.add(new Fruit("banana", "yellow"));
//        fruits.add(new Fruit("orange", "orange"));
//        fruits.add(new Fruit("apple", "red"));
//
//        //запись объекта в файл
//        try (OutputStream os = new FileOutputStream("fruitList.dat");
//             ObjectOutputStream oos = new ObjectOutputStream(os) //т.к. записываем объект в файл
//        ) {
//            oos.writeObject(fruits);
//
//        } catch (IOException ex) {
//
//        }

        //чтение объекта из файла
        List<Fruit> fruitList = getFruits("fruitList.dat");;
            for (Fruit fruit:fruitList) {
                System.out.println(fruit);
            }
    }

    private static List<Fruit> getFruits(String fileName) {
        if (new File(fileName).exists()) { //если файл существует
            try (InputStream is = new FileInputStream(fileName);
                 ObjectInputStream ois = new ObjectInputStream(is) //т.к. записываем объект в файл
            ) {
                return (List<Fruit>) ois.readObject();
            } catch (IOException | ClassNotFoundException ex) { //когда запускаемая программа (другая) не знает такого класса Фрукт - не сможет десериализовать

            }
        }
        System.out.println("не удалось найти файлб инициализируем пустым списком");
        return new ArrayList<>();
    }
}
