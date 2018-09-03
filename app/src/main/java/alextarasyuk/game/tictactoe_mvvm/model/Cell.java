package alextarasyuk.game.tictactoe_mvvm.model;


import alextarasyuk.game.tictactoe_mvvm.utilities.StringUtility;

public class Cell {

    public Player player;

    public Cell(Player player) {
        this.player = player;
    }

    public boolean isEmpty() {
        return player == null || StringUtility.isNullOrEmpty(player.value);
    }
}
