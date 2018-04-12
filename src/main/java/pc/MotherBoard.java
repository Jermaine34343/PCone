package pc;

public class MotherBoard {
    private String model;
    private String Manufacture;
    private String ramSlots;
    private String cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacture, String ramSlots, String cardSlots, String bios) {
        this.model = model;
        this.Manufacture = manufacture;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public String getRamSlots() {
        return ramSlots;
    }

    public String getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "model='" + model + '\'' +
                ", Manufacture='" + Manufacture + '\'' +
                ", ramSlots='" + ramSlots + '\'' +
                ", cardSlots='" + cardSlots + '\'' +
                ", bios='" + bios + '\'' +
                '}';
    }

    public void loadProgram(String programName){
        System.out.println("Microsoft is now running" + programName);
    }



}