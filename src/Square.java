package com.TestProjectTeam; //Комментарий Андрей: одинаковое название пакета проекта

public class Square implements SimpleInterface { //Комментарий Андрей: подключаем интерфейс
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
        return heigthSquare + heigthSquare + heigthSquare + heigthSquare;
    }

    @Override
    public double perimetrShape() {
        return heigthSquare * heigthSquare;
    }

    @Override
    public void paintingShape() {
        System.out.println("You painting my square");
    }
}
