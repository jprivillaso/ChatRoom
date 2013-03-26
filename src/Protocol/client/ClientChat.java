/**
 * March 2013
 * Chat Server
 */
package Protocol.client;

import GUI.PanelClientGUI;
import java.net.Socket;

/**
 * Client Chat Class. Create the window, establishes the
 * connection and do the controller instance.
 *
 * @author Santiago Moreno and Juan Rivillas
 *
 */
public class ClientChat {

    /**
     * Server Socket Chat
     */
    private Socket socket;

    /**
     * Create the window, establishes the connection and
     * do the controller instance.
     */
    public ClientChat(int port, String nick) {
        try {
            PanelClientGUI panelClientGUI = new PanelClientGUI(nick);
            panelClientGUI.setVisible(true);

            socket = new Socket("localhost", port);
            ControlClient control =
                    new ControlClient(socket, panelClientGUI, nick);
            control.setNick(nick);

        } catch (Exception e) {
            e.getMessage();
        }
    }
}
