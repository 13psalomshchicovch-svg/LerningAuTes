package stepkin.les42;

import java.io.InputStream;

public class moveRobot {


    public static void moveRobott(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int i = 0;
        for ( ;i < 3; i++) {
        try(RobotConnection robotConnection = robotConnectionManager.getConnection() ){
            robotConnection.moveRobotTo(toX,toY);
            i = 3;
            }
        catch (RobotConnectionException e){
            if (i == 2) {
                throw e = new RobotConnectionException("error connect");
            }
        }
    }

    }
}
