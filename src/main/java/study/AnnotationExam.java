package study;

import java.lang.reflect.Method;

public class AnnotationExam {

    Box box = new Box();

    // getClass 해당 인스턴스를 만들 때 사용한 클래스 정보 리턴
    // getDeclaredMethod : 클래스에 대한 정보를 얻고 그 정보로 부터 parameter 메소드에 대한 정보 리턴
    Method method;

    {
        try {
            method = box.getClass().getDeclaredMethod("setObj");

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }


}
