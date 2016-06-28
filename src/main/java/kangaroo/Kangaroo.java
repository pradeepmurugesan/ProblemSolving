package kangaroo;

public class Kangaroo {
    int x1;
    int x2;
    int v1;
    int v2;

    public  Kangaroo(int x1, int v1, int x2, int v2) {
        this.x1 = x1;
        this.x2 = x2;
        this.v1 = v1;
        this.v2 = v2;
    }
    public String canMeet() {
        String result = "NO";
        if( (x1 > x2 && v1 > v2) || (x2 > x1 && v2 > v1)) {
            result = "NO";
        } else if(x1 != x2 && v1 == v2) {
            result = "NO";
        } else {
            int distance1 = x1 + v1;
            int distance2 = x2 + v2;
            if(distance1 == distance2) {
                result = "YES";
            } else if(distance2 < distance1) {
                int tempDistance = distance1;
                distance1 = distance2;
                distance2 = tempDistance;
                int tempVelocity = v1;
                v1 = v2;
                v2 = v1;
            }
            while(distance2 > distance1 && result != "YES") {
                distance1 += v1;
                distance2 += v2;
                if(distance1 == distance2) {
                    System.out.println("Meets @ " + distance1);
                    result = "YES";
                    break;
                }
            }
        }
        return result;
    }
}
