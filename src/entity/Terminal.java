package entity;

public class Terminal {

    private String id;

    private String terminalNo;

    private String card;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "id='" + id + '\'' +
                ", terminalNo='" + terminalNo + '\'' +
                ", card='" + card + '\'' +
                '}';
    }
}
