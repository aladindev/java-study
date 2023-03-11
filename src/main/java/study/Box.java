package study;

public class Box<E> { // Box class는 가상 클래스 E를 받을 수 있도록 제네릭 선언
    private E obj;

    public void setObj(E obj) {
        this.obj = obj;
    }

    public E getObj() {
        return obj;
    }
}
