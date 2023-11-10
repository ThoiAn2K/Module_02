public class TriangleClassifier {
    public static String classifyTriangle(int length1, int length2, int length3) {

        if (length1 <= 0 || length2 <= 0 || length3 <= 0) {
            return "ko phai tam giac";
        }
        if (length1 == length2 && length2 == length3) {
            return "tam giac deu";
        } else if (length1 == length2 || length2 == length3 || length1 == length3) {
            return "tam giac can";
        } else if (length1 + length2 > length3 && length2 + length3 > length1 && length1 + length3 > length2) {
            return "tam giac thuong";
        } else {
            return "ko phai tam giac";
        }
    }
}
