package pc;

public class ComputerCase {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private String dimensions;

    public ComputerCase(String model, String manufacturer, String powerSupply, String dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getDimensions() {
        return dimensions;
    }


    public void pressPowerButton(String onButton){
        System.out.println("Power button pressed" + onButton);
    }


    @Override
    public String toString() {
        return "ComputerCase{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimensions='" + dimensions + '\'' +
                '}';
    }



}
