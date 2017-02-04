
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Try {

    public static void main(String[] args) {
        try {
//            Class c = "try".getClass();
//            System.out.println(c);
//
//            System.out.println(java.lang.String.class);
//
//            System.out.println(Class.forName("java.lang.String"));

//            Class<?> c = Test.class;
//            Field[] field = c.getDeclaredFields();
//            for (int i = 0; i < field.length; i++) {
//                int mo = field[i].getModifiers();
//                String priv = Modifier.toString(mo);
//
//                Class<?> type = field[i].getType();
//                System.out.println(priv + " " + type.getName() + " " + field[i].getName());
//            }
            List list = new ArrayList();
            list.add("qqyumidi");
            list.add("corn");
            list.add(100);

            for (int i = 0; i < list.size(); i++) {
                String name = (String) list.get(i); // 1
                System.out.println("name:" + name);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Test {

    private String a = "1";
    public String b = "2";
    public String c = "3";

    private void f1() {
        System.out.println("f1");
    }

    private void f3() {
        System.out.println("f3");
    }

    public void f2() {
        System.out.println("f2");
    }
}
