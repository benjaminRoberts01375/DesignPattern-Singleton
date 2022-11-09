public class MainWindow {
    public static void main(String[] args) {
        private Settings settings = Settings.getSettings();
        System.out.println("Theme at boot: " + settings.getTheme());
        System.out.println("Keymap at boot: " + settings.getKeymap());

        BrowserWindow browserWindow = new BrowserWindow();
        browserWindow.testInteraction(); // Changes Theme

        SettingsWindow settingsWindow = new SettingsWindow();
        settingsWindow.testInteraction(); // Changes Keymap

        System.out.println("New theme: " + settings.getTheme());
        System.out.println("New keymap: " + settings.getKeymap());
    }
}
