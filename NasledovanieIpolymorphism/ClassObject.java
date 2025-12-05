package NasledovanieIpolymorphism;

public class ClassObject {
    public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }

        
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Point other = (Point) obj;
        return (x == other.x) && (y == other.y);
    }
    //надо еще переопределить hashCode
    @Override
    public int hashCode() {
        return 31 * x + y;
    }
    
}
}
/*
    1. Рефлексивность
    2. Симметричность
    3. Транзитивность
    4. Согласованность
    5. Любой ненулевой объект не равен null
 */
