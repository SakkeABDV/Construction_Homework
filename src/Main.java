import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

       /** MyClass деген класс тузунуз
        Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
        Параметри эки башка болгон эки конструктор тузунуз
        MyClassтын 2 объектисин тузуп, конструктор аркылуу мааани бериниз
        Эки объектке эки башка конструктор иштесин.
        Объекттердин маанилерин консольго чыгарыныз.*/


       MyClass myClass = new MyClass("Sanzhar","Abdymomunov", (byte) 19, new String[]{"Java","Soft Skills"},"Beshbarmak");
        myClass.showInfo();
        System.out.println();
       MyClass myClass1 = new MyClass();
       myClass1.setName("Ilim");
       myClass1.setSurname("Shabdanov");
       myClass1.setAge((byte) 19);
       myClass1.setCourses(new String[]{"Java","English","Event","Soft Skills"});
       myClass1.setFavoriteDish("Bean soup");
       myClass1.showInfo();





    }
}