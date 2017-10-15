package TestTeamProject;

public class Square implements Constructable {
    private int heigthSquare;

    public int getHeigthSquare() {
        return heigthSquare;
    }

    public void setHeigthSquare(int heigthSquare) {
        this.heigthSquare = heigthSquare;
    }

    Square(int heigthSquare) {
        this.heigthSquare = heigthSquare;
    }


    @Override
    public double areaShape() {
        return heigthSquare * heigthSquare;
    }

    @Override
    public double perimetrShape() {
 	return heigthSquare + heigthSquare + heigthSquare + heigthSquare;
    }

    @Override
    public void paintingShape() {
        System.out.println("You painting my square");
    }
}
