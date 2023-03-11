package study;

public class GenericExam {
    public static void main(String[] args) {
        Box box = new Box(); // 인스턴스화
        box.setObj(new Object());
        Object obj = box.getObj();

        box.setObj("Example");
        String str = (String)box.getObj();

        box.setObj(1);
        int value = (int)box.getObj();
    }
}
