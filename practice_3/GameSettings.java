package practice_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName = "CodeRun";
    int currentPlayers;

    public GameSettings(int maxPlayers,int currentPlayers){
        GameSettings.maxPlayers = maxPlayers;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int maxPlayers) {
        GameSettings.maxPlayers = maxPlayers;
    }
    public void addPlayer(){
        currentPlayers++;
    }
    public void printGameStatus(){
        System.out.println("Статус игры: Текущее количество игроков "+ currentPlayers + " I " + " Максимальное количество игроков: " + maxPlayers);
    }
}
