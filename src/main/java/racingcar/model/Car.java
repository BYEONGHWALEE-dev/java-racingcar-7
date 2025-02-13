package racingcar.model;

public class Car {

    private String name;
    private int position;

    public Car(String name){
        this.name = name;
        this.position = 0;
    }

    public void move(){
        position++;
    }

    // getter / setter method
    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
