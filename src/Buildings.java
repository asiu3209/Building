public class Buildings {
    private String name; String address; int age;
    public Buildings(String name, String address, int age){
        this.name = name; this.address = address; this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress(){
        return address;
    }
}
