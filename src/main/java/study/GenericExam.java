package study;

public class GenericExam {
    public static void main(String[] args) {
//        Box box = new Box(); // 인스턴스화
//        box.setObj(new Object());
//        Object obj = box.getObj();
//
//        box.setObj("Example");
//        String str = (String)box.getObj();
//
//        box.setObj(1);
//        int value = (int)box.getObj();

        // Type instance를 명시함으로써 컴파일 단계에서 에러를 사전 방지할 수 있다.
        Box<String> box = new Box<>();
        box.setObj(new String("1"));
    }
}
