package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    List<String> teacher = List.of("若林", "春日", "さとみつ", "設楽", "日村", "オークラ",
        "ケンコバ",
        "ジュリー", "ノブ", "大吾", "川島", "有吉", "長谷川", "渡辺", "どろぼう");
    for (String name : teacher) {
      if (name.length() >= 3) {
        System.out.println(name);
      }
    }

    Map<Integer, String> studentMap = new HashMap<>(
        Map.of(1, "せいや", 2, "粗品", 3, "亜生", 4, "昴生", 5,
            "R指定", 6, "DJ松永", 7, "ヒコロヒー", 8,
            "イワクラ", 9, "きょん", 10, "西村"));
    studentMap.entrySet().removeIf(entry -> entry.getKey() % 2 == 0);
    System.out.println(studentMap);

  }
}