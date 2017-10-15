package com.TestProjectTeam; //Комментарий Андрей: одинаковое название пакета проекта

public class Rectangle implements SimpleInterface{

    private int heightRectangle;
    private int widthRectangle;

    public int getWidthRectangle(){
        return widthRectangle;
    }

    public void setWidthRectangle(int widthRectangle){
        this.widthRectangle=widthRectangle;
    }

    public int getHeightRectangle(){
        return heightRectangle;
    }

    public void setHeightRectangle(int heightRectangle){
        this.heightRectangle=heightRectangle;
    }

    @Override
    public double areaShape(){
        return (heightRectangle * widthRectangle);
    }
    @Override
    public double perimetrShape(){
        return (heightRectangle+heightRectangle+widthRectangle+widthRectangle);
    }
    public void paintingShape(){
        System.out.println("You painting my Rectangle");
    }
}