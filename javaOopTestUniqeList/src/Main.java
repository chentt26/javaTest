public class Main {
    public static void main(String[] args) {
        MyUniuqeList list = new MyUniuqeList("secret");
        list.add("yoav");
        list.add("hodi");
        list.add("jenia");
        list.add("ori");
        list.add("shimi");
        list.add("shimi");
        System.out.println(list.toString());
        try {
            list.sort("secret");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list.toString());
        try {
            list.removeAt(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list.toString());

        try {
            list.remove("hodi");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list.toString());

        for (var i:list) {
            System.out.println("checking for each");
        }
        try {
            list.clear("secret");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list.toString());



    }
}