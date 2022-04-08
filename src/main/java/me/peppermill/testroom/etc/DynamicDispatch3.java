package me.peppermill.testroom.etc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class DynamicDispatch3 {

    interface Post {
        void postOn(SNS sns);
    }

    interface SNS {
        void post(Text post);
        void post(Picture post);
    }

    static class Face implements SNS {

        @Override
        public void post(Text post) {
            System.out.println("text - face");
        }

        @Override
        public void post(Picture post) {
            System.out.println("picture - face");
        }
    }

    static class Twit implements SNS {

        @Override
        public void post(Text post) {
            System.out.println("text - twit");
        }

        @Override
        public void post(Picture post) {
            System.out.println("picture - twit");
        }
    }

    static class Text implements Post {

        @Override
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }

    static class Picture implements Post {

        @Override
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Picture(), new Text());
        List<SNS> sns = Arrays.asList(new Face(), new Twit());

        posts.forEach(p -> sns.forEach(s -> p.postOn(s)));
    }

}
