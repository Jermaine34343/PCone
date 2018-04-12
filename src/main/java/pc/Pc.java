package pc;

public class Pc {

    private MotherBoard motherBoard;
    private Monitor monitor;
    private ComputerCase computerCase;

    public Pc(MotherBoard motherBoard, Monitor monitor, ComputerCase dell) {
        this.motherBoard = motherBoard;
        this.monitor = monitor;
        this.computerCase = computerCase;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public ComputerCase getCase() {
        return computerCase;
    }

    private void drawLogo(){
        monitor.showLogo(3, 9, "Red");

    }

    private void powerUp(){
        drawLogo();
        computerCase.pressPowerButton("Turn on");
    }

    @Override
    public String toString() {
        return "Pc{" +
                "motherBoard='" + motherBoard + '\'' +
                ", monitor='" + monitor + '\'' +
                ", ComputerCase='" + computerCase + '\'' +
                '}';
    }

}
