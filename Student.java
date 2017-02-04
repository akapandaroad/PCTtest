/**
 * Created by akapandaroad on 2017/2/3.
 */
public class Student {

private static int id;
private static String name;

    public  Student(int id,String name) {

        this.id=id;
        this.name=name;

    }

    public Student() {

        name="woshinibaba";

    }


    public String toString() {

    return  "name" +name;
    }



    public static <T> T[] func(T[] arg){
        return arg;
    }
}
