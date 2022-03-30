package me.peppermill.testroom.godofjava.ch21;

public class GenericSample {

    public static void main(String[] args) {
        GenericSample test = new GenericSample();
        test.run();
    }

    private void run() {
        CastingDTO<StringBuffer> dto1 = new CastingDTO<>();
        dto1.setObject(new StringBuffer());
        CastingDTO<StringBuilder> dto2 = new CastingDTO<>();
        dto2.setObject(new StringBuilder());
        CastingDTO<String> dto3 = new CastingDTO<>();
        dto3.setObject("");
    }
}
