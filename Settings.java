public class Settings {
    private static Settings settings = new Settings(); // Step 1

    private Settings() { } // Step 2

    public static Settings getSettings() { // Step 3
        return settings;
    }

    // Content
    Keymap selectedKeymap = new Keymap();
    Theme selectedTheme = new Theme();

    public void setTheme(String theme){
        selectedTheme.setTheme(theme);
    }
    public String getTheme() {
        return selectedTheme.getTheme();
    }
    public void setKeymap(String keymap) {
        selectedKeymap.setKeymap(keymap);
    }
    public String getKeymap(){
        return selectedKeymap.getKeymap();
    }
}