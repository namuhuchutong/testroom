package me.peppermill.testroom.ch16;

public class MyPage {

    private InputBox input;

    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUI();
        myPage.pressKey();
    }

    private void pressKey() {
        this.input.listener.onKeyUp();
        this.input.listener.onKeyDown();
    }

    public void setUI() {
        this.input = new InputBox();
        this.input.setListener(new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("Key Up");
            }
        });
    }
}
