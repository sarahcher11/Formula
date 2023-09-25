package curve;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import formula.Sum;
import formula.Variable;

public class CurveTest {

    @Test
    void test() throws IOException {
        Variable variable = new Variable("variable", 0);
        Function function = new Function(new Sum(variable, variable), variable);
        double startValue = -1;
        double endValue = 1;
        double step = 0.1;
        Curve curve = new Curve(function, startValue, endValue, step);
        Writer writer = new StringWriter();
        curve.writePoints(writer);
        writer.close();

        StringBuilder stringBuilder = new StringBuilder();
        for (double value = startValue; value <= endValue; value += step) {
            stringBuilder.append(value).append(" ").append(2 * value).append("\n");
        }

        assertThat(writer.toString()).isEqualTo(stringBuilder.toString());
    }

}
