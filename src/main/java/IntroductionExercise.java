public class IntroductionExercise {
    public static void main(String[] args) {
        int[] v1 = {1,2,3};
        int[] v2 = {-1,2,3};
        int innerProduct = getInnerProduct(v1,v2);
            System.out.println(innerProduct);

    }
    public static int getInnerProduct(int[] vec1, int[] vec2) {
        if (vec1 == null || vec2 == null) {
            throw new IllegalArgumentException("Vektoren dürfen nicht null sein.");
        }

        if (vec1.length != vec2.length) {
            throw new IllegalArgumentException("Vektoren müssen gleich lang sein.");
        }

        int innerProduct=0;
        for(int i=0; i<vec1.length; i++){
                innerProduct+= vec1[i]*vec2[i];

        }

        return innerProduct;
    }

}
