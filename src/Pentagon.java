package com.TestProjectTeam; //Комментарий Андрей: одинаковое название пакета проекта

public class Pentagon implements SimpleInterface { //Комментарий Андрей: подключаем интерфейс
    private int heightPentagon= xy;

    public int getHeightPentagon(){
        return heightPentagon;
    }

    public void setHeightPentagon(int heightPentagon){ //Комментарий Андрей: добавил тип значения int heightPentagon
        this.heightPentagon=heightPentagon;
    }

    @Override
    public double areaShape(){
        return (heightPentagon * heightPentagon)/4 * (Math.sqrt(25+10 * Math.sqrt(5)));
    }
    @Override
    public double perimetrShape(){
        return heightPentagon * 5;
    }
    public void paintingShape(){
        System.out.println("You painting my pentagon");
    }
}
