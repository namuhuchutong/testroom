package me.peppermill.testroom.etc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class DynamicDispatch2 {

    interface Post {
        void postOn(SNS sns);
//        void postOn(Face sns);
//        void postOn(Twit sns);
    }

    interface SNS {
    }

    static class Text implements Post {
        @Override
        public void postOn(SNS sns) {

        }

//        @Override
//        public void postOn(SNS sns) {
//            bad
//            if (sns instanceof Face) {
//                System.out.println("text - sns is face");
//            }
//
//            if (sns instanceof Twit) {
//                System.out.println("text - sns is twit");
//            }
//        }


//        public void postOn(Face sns) {
//            System.out.println("face sns = " + sns.getClass().getSimpleName());
//        }
//        public void postOn(Twit sns) {
//            System.out.println("twit sns = " + sns.getClass().getSimpleName());
//        }

    }

    static class Picture implements Post {
        @Override
        public void postOn(SNS sns) {

        }

//        @Override
//        public void postOn(SNS sns) {
//            //bad
//            if (sns instanceof Face) {
//                System.out.println("text - sns is face");
//            }
//
//            if (sns instanceof Twit) {
//                System.out.println("text - sns is twit");
//            }
//        }
//        public void postOn(Face sns) {
//            System.out.println("face sns = " + sns.getClass().getSimpleName());
//        }
//        public void postOn(Twit sns) {
//            System.out.println("twit sns = " + sns.getClass().getSimpleName());
//        }
    }

    static class Face implements SNS {

    }

    static class Twit implements SNS {

    }

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Face(), new Twit());

        // old
        for(Post p : posts) {
            for(SNS s : sns) {
                p.postOn(s);
            }
        }

        System.out.println();

        // java 8
        // 컴파일 시점에 결정을 안하고 런타임 시점에서 결정됨.
        // p를 알고 그 다음 s를 안다
        posts.forEach(p -> sns.forEach(s -> p.postOn(s)));

    }
}
