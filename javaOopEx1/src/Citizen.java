public class Citizen {
    private String id;
    private String name, sub1, sub2;
    private int firstNum, seconedNum;

    public Citizen(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void idChange() {
        firstNum = Integer.parseInt(String.valueOf(id.charAt(8)));
        seconedNum = Integer.parseInt(String.valueOf(id.charAt(7)));
        sub1 = id.substring(0, seconedNum + 1);
        sub2 = id.substring(seconedNum + 1, id.length());
        id = sub1 + firstNum + sub2;
        System.out.println("Citizen id" + id + " his name is " + name);
    }
}
