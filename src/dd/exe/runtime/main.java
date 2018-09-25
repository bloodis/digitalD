package dd.exe.runtime;

import dd.gui.userInterface.controller.MainFrameController;
import dd.gui.userInterface.view.TestFrame;

import static javafx.application.Application.launch;

public class main {

    public static void main(String[] args) {

/*        MainFrameController mainFrameController = new MainFrameController();
        mainFrameController.showMainFrame();*/

        TestFrame frame = new TestFrame();

        frame.appLaunch(args);
    }
}
