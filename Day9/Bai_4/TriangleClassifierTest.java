import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testClassifyTriangle() {
        String result = TriangleClassifier.classifyTriangle(2, 2, 2);
        Assertions.assertEquals("tam giac deu", result);

    }

    @Test
    void testClassifyTriangle1() {
        String result = TriangleClassifier.classifyTriangle(2, 2, 3);
        Assertions.assertEquals("tam giac can", result);

    }

    @Test
    void testClassifyTriangle2() {
        String result = TriangleClassifier.classifyTriangle(3, 4, 5);
        Assertions.assertEquals("tam giac thuong", result);

    }
    @Test
    void testClassifyTriangle3() {
        String result = TriangleClassifier.classifyTriangle(8, 2, 3);
        Assertions.assertEquals("ko phai tam giac", result);

    }
    @Test
    void testClassifyTriangle4() {
        String result = TriangleClassifier.classifyTriangle(-1, 2, 1);
        Assertions.assertEquals("ko phai tam giac", result);

    }
    @Test
    void testClassifyTriangle5() {
        String result = TriangleClassifier.classifyTriangle(0, 1, 1);
        Assertions.assertEquals("ko phai tam giac", result);
    }

}

