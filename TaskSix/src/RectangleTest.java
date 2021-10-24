import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    void areaTestPositive() {
        Rectangle rectangle = new Rectangle(5,6);
        assertEquals(30,rectangle.area());
    }

    @org.junit.jupiter.api.Test
    void areaTestNegative() {
        Rectangle rectangle = new Rectangle(-5,-6);
        assertEquals(0,rectangle.area());
    }

    @org.junit.jupiter.api.Test
    void areaTestZero() {
        Rectangle rectangle = new Rectangle(0,0);
        assertEquals(0,rectangle.area());
    }

    @org.junit.jupiter.api.Test
    void perimeterTestPositive() {
        Rectangle rectangle = new Rectangle(9,8);
        assertEquals(34,rectangle.perimeter());
    }

    @org.junit.jupiter.api.Test
    void perimeterTestNegative() {
        Rectangle rectangle = new Rectangle(-7,-8);
        assertEquals(0,rectangle.perimeter());
    }

    @org.junit.jupiter.api.Test
    void perimeterTestZero() {
        Rectangle rectangle = new Rectangle(0,0);
        assertEquals(0,rectangle.perimeter());
    }
}