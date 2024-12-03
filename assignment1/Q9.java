public class Q9 {
    int score;
    public Q9(int score){
        this.score=score;
    }
}
class hello{
    public static void main(String[] args) {
        Q9[] A={
                new Q9(100),
                new Q9(200),
                new Q9(300),
                new Q9(400),
                new Q9(500),

        };
        Q9[] B=A.clone();
        A[4].score=550;
        System.out.println("A[4].score: "+A[4].score);
        System.out.println("B[4].score: "+B[4].score);
    }
}
