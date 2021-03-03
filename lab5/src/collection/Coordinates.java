package collection;

public class Coordinates {
    private float x; //Значение поля должно быть больше -164
    private Integer y; //Поле не может быть null

    public Coordinates(float x, Integer y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x){
        this.x = x;
    }
    public void setY(Integer y){
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public Integer getY(){
        return y;
    }

    @Override
    public String toString(){
        return "collection.Coordinates{" + "x=" + x + " y=" + y + "}";
    }
}
