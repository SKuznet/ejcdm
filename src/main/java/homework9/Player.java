package homework9;

public class Player {
    private int id;
    private int money;
    private int bet = 0;
    private String favorite = "";
    private boolean win;

    public Player(){
        id = 0;
        money = 5000;
        win = false;
    }

    public Player(int id){
        this.id = id;
        money = 5000;
        win = false;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }

    public int getBet() {
        return bet;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean getWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }
}
