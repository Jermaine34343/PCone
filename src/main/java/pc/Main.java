package pc;

public class Main {
    public static void main(String[] args) {
        Pc hp = new Pc(new MotherBoard("dv 2112", "Hp", 5, 8, "b.s.76"),
                new Monitor("HP 24UH 24-INCH LED BACKLIT MONITOR", "hp", 10, new Resolution(10,20)),
                new ComputerCase("6zx78", "Dell", "112v", new Dimensions(9, 6)));

        System.out.println(hp);
        System.out.println("=========================================================================================================================================================");
        hp.getMotherBoard().loadProgram("Halo");
        System.out.println("===========================================================================================================================================================");
        hp.getMonitor().showLogo(89,89,"green");

    }
}