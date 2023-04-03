public class ArrayExample {

    public static void main(String[] args) {

        // 배열

        int [] price = {10000, 9000, 18000};
        String [] mbti = {"ISFJ", "ENTP", "ISFP"};

        System.out.println("price = "+ price[0]);
        System.out.println("mbti = " + mbti[0]);

        for(int i=0;i<mbti.length;i++) {
            System.out.println("mbti = " + mbti[i]);
        }

        for(String me : mbti) {
            System.out.println(me);
        }
    }


}
