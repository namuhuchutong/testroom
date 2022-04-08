package me.peppermill.testroom.etc;

@FunctionalInterface
interface TestroomApplication {

    void a();

    static void b() {

    }

    default void c() {

    }


}

class sdafasfsadf {
    TestroomApplication a = () -> {};
    TestroomApplication asdf = new TestroomApplication() {
        @Override
        public void a() {
        }
    };

}