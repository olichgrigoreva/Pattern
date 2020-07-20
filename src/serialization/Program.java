package serialization;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("apple", "green");
        Fruit fruit2 = new Fruit("apple", "red");

        //System.out.println(fruit);

        //запись объекта в файл
        try (OutputStream os = new FileOutputStream("fruit.dat");
             ObjectOutputStream oos = new ObjectOutputStream(os) //т.к. записываем объект в файл
        ) {
            oos.writeObject(fruit);
            oos.writeObject(fruit2);

        } catch (IOException ex) {

        }

        //чтение объекта из файла
        try (InputStream is = new FileInputStream("fruit.dat");
             ObjectInputStream ois = new ObjectInputStream(is) //т.к. записываем объект в файл
        ) {
            //Object object = ois.readObject(); //без getName
            while (is.available() > 0) { //пока во входном потоке есть данные
                Fruit object = (Fruit) ois.readObject();
                System.out.println(object);
                System.out.println(object.getName());
            }

        } catch (IOException | ClassNotFoundException ex) { //когда запускаемая программа (другая) не знает такого класса Фрукт - не сможет десериализовать

        }
    }
}
