package racingcar;

public class Car {
    private String name;
    private Integer score;

    public Car(String name) {
        this.name = name;
        this.score = 0;
    }

    public void move(){
        score += 1;
    }

    public int getScore(){
        return score;
    }
}
