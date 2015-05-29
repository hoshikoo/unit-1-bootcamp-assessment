/** * Created by Hoshiko on 5/28/15. */public class MyObject{    private String name;    private int age;    public MyObject(String name, int age)    {        this.name = name;        this.age = age;    }    public String getName()    {        return this.name;    }    public int getAge()    {        return this.age;    }    public void setName(String name)    {        this.name = name;    }    public void setAge(int age)    {        this.age = age;    }    public static boolean sameObj(MyObject obj1, MyObject obj2){        return obj1.getName().equals(obj2.getName()) && obj1.getAge() == obj2.getAge();    }    public static void main(String[] args) {        MyObject obj1 = new MyObject("Bobby", 12);        MyObject obj2 = new MyObject("Bobby", 12);        MyObject obj3 = new MyObject("Bobby", 14);        MyObject obj4 = new MyObject("Suzy", 12);        MyObject obj5 = new MyObject("Suzy", 14);        //test getName and getAge        if (obj1.getAge() ==12 && obj1.getName().equals("Bobby")){            System.out.println("getAge and getName Test Past");        }        else {            System.out.println("getAge and getName Test Failed");;        }        //test setName and setAge        obj5.setAge(5);        obj5.setName("Mary");        if (obj5.getAge() ==5 && obj5.getName().equals("Mary")){            System.out.println("setName and setAge Test Past");        }        else {            System.out.println("getAge and getName Test Failed");;        }        //test Boolean        if (sameObj(obj1, obj2)==true ){            System.out.println("Boolean Test Past");        }        else {            System.out.println("Boolean Test Failed");;        }        if (sameObj(obj1, obj3)==false){            System.out.println("Boolean Test Past");        }else {            System.out.println("Boolean Test Failed");;        }        if (sameObj(obj3, obj4)==false){            System.out.println("Boolean Test Past");        }else {            System.out.println("Boolean Test Failed");;        }        if (sameObj(obj4, obj5)==false){            System.out.println("Boolean Test Past");        }else {            System.out.println("Boolean Test Failed");;        }    }}