package ablazzing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


public class Circle {

    private String color;

    public Circle(String color) {

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                '}';
    }
}
