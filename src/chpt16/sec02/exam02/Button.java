package chpt16.sec02.exam02;

public class Button {
    //정적 멤버 인터페이스
    @FunctionalInterface
    public static interface ClickListner {
        //추상 메소드
        void onClick();
    }

    //필드
    private ClickListner clickListner;

    //메소드
    public void setClickListner(ClickListner clickListner) {
        this.clickListner = clickListner;
    }

    public void click() {
        this.clickListner.onClick();
    }
}
