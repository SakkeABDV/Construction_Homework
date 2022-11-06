import java.lang.reflect.Array;

public class MyClass {
    private String name;
    private String surname;
    private byte age;
    private String [] courses;
    private  String favoriteDish;


    public  MyClass (String name,String surname, byte age,String [] courses , String favoriteDish){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.courses = courses;
        this.favoriteDish = favoriteDish;
    }


    public MyClass (){
    }




    void setName (String name){
        this.name = name;
    }
    void  setSurname (String surname){
        this.surname = surname;
    }
    void setAge (byte age){
        this.age = age;
    }
    void  setCourses (String [] courses){
        this.courses = courses;
    }
    void setFavoriteDish (String favoriteDish){
        this.favoriteDish = favoriteDish;
    }

    String getName (){
        return name;
    }
    String getSurname (){
        return surname;
    }
    byte getAge (){
        return age;
    }


    String  [] getCourses (){
        return courses;
    }

    String getFavoriteDish (){
        return favoriteDish;
    }

    void  showInfo (){
        System.out.println(getName());
        System.out.println(getSurname());
        System.out.println(getAge());
        for (int i = 0; i < getCourses().length ; i++) {
            System.out.print(getCourses()[i] + " ");
            System.out.println();
        }
        System.out.println(favoriteDish);
    }

}
