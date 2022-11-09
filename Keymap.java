public class Keymap {
    private String selectedKeyMap = "Inverted controls";

    public void setKeymap(String selection) {
        selectedKeyMap = selection;
    }

    public String getKeymap() {
        return selectedKeyMap;
    }
}
