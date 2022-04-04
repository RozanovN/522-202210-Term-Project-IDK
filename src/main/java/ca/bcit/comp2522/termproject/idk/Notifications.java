package ca.bcit.comp2522.termproject.idk;

import javafx.scene.input.KeyCode;

import static com.almasb.fxgl.dsl.FXGL.*;

/**
 * Add various notifications to the user.
 *
 * @author Prince Chabveka
 * @version 2022
 */
    public class Notifications {

    public Notifications() {
    }

    /**
         * Greet user with notification
         */
        protected void notification() {
            onKeyDown(KeyCode.N, "Notify", () -> getNotificationService().pushNotification("Hello Prince")
            );
        }

}
