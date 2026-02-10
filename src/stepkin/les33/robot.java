package stepkin.les33;

public class robot {
    int x0 = 2;
    int x;
    int y0 = 1;
    int y;
    Direction d;


    robot (int x, int y){
        this.x = x;
        this.y = y;
        this.d = d;
    }

    public Direction getDirection() {
        return d;
    }

    public int getX() {
        x = x - x0;
        return x;
    }

    public int getY() {
        y = y - y0;
        return y;
    }

    public void turnLeft() {
        switch (d){
            case UP:
                d = Direction.LEFT;
                break;
            case LEFT:
                d = Direction.DOWN;
                break;
            case DOWN:
                d = Direction.RIGHT;
                break;
            case RIGHT:
                d = Direction.UP;
                break;
            default:
                System.out.println("No direction");
        }

    }

    public void turnRight() {
        switch (d){
            case UP:
                d = Direction.RIGHT;
                break;
            case RIGHT:
                d = Direction.DOWN;
                break;
            case DOWN:
                d = Direction.LEFT;
                break;
            case LEFT:
                d = Direction.UP;
                break;
            default:
                System.out.println("No direction");
        }
    }

    public void stepForward() {

            switch (d) {

                case RIGHT:
                    x0++;
                    break;
                case UP:
                    y0++;
                    break;
                case DOWN:
                    y0--;
                    break;
                case LEFT:
                    x0--;
                    break;
                default:
                    System.out.println("No move");
                }
            x = x0;
            y = y0;
            }





    public static void main(String[] args) {

        int toX;
        int toY;
        Direction toD;

        robot r1= new robot(-5,-5);


        toX = r1.getX();

        toY = r1.getY();

        switch (r1.d){
            case LEFT:
                r1.turnRight();
                break;
            case RIGHT:
                r1.turnLeft();
                break;
            case DOWN:
                r1.turnRight();
                r1.turnRight();
                break;
        }
        if (toX >0) {
                    r1.turnRight();
                    for (int i = 0; i < Math.abs(toX); ) {
                        i++;
                        r1.stepForward();
                    }
                    r1.turnLeft();
                }
                else {
                    r1.turnLeft();
                    for (int i = 0; i < Math.abs(toX); ) {
                        i++;
                        r1.stepForward();

                    }
                    r1.turnRight();
                }



        if (toY >0) {

                    for (int i = 0; i < Math.abs(toY); ) {
                        i++;
                        r1.stepForward();
                    }

                }
                else {
                    r1.turnLeft();
                    r1.turnLeft();
                    for (int i = 0; i < Math.abs(toY); ) {
                        i++;
                        r1.stepForward();

                    }
                    r1.turnLeft();
                    r1.turnLeft();
                }




    }
}


