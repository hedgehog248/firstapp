package in.techcamp.firstapp;

import lombok.AllArgsConstructor;
import lombok.Data;

// @AllArgsConstructor => すべての変数を初期化するコンストラクタを自動生成するアノテーション
// @Data => ゲッターとセッターを自動生成するアノテーション
@AllArgsConstructor
@Data
public class PostEntity {
    //変数としてidとmemoを宣言

    private long id;
    private String memo;
}
