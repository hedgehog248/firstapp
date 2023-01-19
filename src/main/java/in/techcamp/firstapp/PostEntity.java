package in.techcamp.firstapp;

public class PostEntity {
    //変数としてidとmemoを宣言

    private long id;
    private String memo;

    // すべての変数を初期化するコンストラクタ
    public PostEntity(long id, String memo) {
        this.id = id;
        this.memo = memo;
    }

    // 各変数のゲッターとセッター
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
