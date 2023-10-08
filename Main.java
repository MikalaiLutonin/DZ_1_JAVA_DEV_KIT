public class Main {
    public static void main(String[] args) {
        ClientGUI clientGUI = new ClientGUI();
        clientGUI.setVisible(true);

        ServerWindow serverWindow = new ServerWindow();
        serverWindow.setVisible(true);

        Thread thread = new Thread(new Runnable() {
            public void run() {
                serverWindow.listen();
            }
        });
        thread.start();
    }
}
