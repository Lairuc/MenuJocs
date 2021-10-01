package COR.M03;

public interface Menu {
    int option = 0;
    public default void showMenu(Player player) {}
    public default void setOption(int opt) {}
    public default int getOption() {
        return option;
    }
}
