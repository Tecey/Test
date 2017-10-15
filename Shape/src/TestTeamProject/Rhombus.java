package TestTeamProject;

public class Rhombus implements Constructable {
    private int heightRhombus;
    private int angle;

    public int getHeightRhombus() {
        return heightRhombus;
    }

    public void setHeightRhombus(int heightRhombus) {
        this.heightRhombus = heightRhombus;
    }

    @Override
    public double areaShape() {
        return (heightRhombus * heightRhombus * Math.sin(angle));
    }

    @Override
    public double perimetrShape() {
        return heightRhombus * 4;
    }

    @Override
    public void paintingShape() {
        System.out.println("You painting ~@NPG@~'s Rhombus");
    }
}
