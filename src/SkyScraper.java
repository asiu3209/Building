public class SkyScraper extends Buildings {
    private int height; String material;

    public SkyScraper(String name, String address, int age, int height, String material){
        super(name, address, age);
        this.height = height;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public int getHeight() {
        return height;
    }
}
