package pc;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution resolution;

    public Monitor(String model, String manufacturer, int size, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void showLogo(int location , int amountOf, String color){
        System.out.println("showing logo at " + location + " by " + amountOf + " in color " + color);
    }


    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", size='" + size + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
                }



        }
