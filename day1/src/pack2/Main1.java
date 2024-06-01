package pack2;

// 字符串格式化
//public class Main1 {
//    public static void main(String[] args) {
//        String s = "Hi %s, your score is %d!";
//        System.out.println(s.formatted("Alice", 80));
//        System.out.println(String.format("Hi %s, your score is %d!", "Bob", 80));
//    }
//}

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();
    }
}

class Score {
    private int[] scores;
    public Score(int[] scores) {
        this.scores = scores;
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}

//[88, 77, 51, 66]
//[88, 77, 99, 66]
//观察两次输出，由于Score内部直接引用了外部传入的int[]数组，这会造成外部代码对int[]数组的修改，
//影响到Score类的字段。如果外部代码不可信，这就会造成安全隐患。

