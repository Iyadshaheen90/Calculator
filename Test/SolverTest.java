import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;

public class SolverTest {

    @Test
    public void getResultFromExpression() {
        Solver solve = new Solver();
        String sum = "";
        sum = solve.getResult("1+2+3");
        assertEquals("6", sum);

        sum = solve.getResult("1+2-3");
        assertEquals("0", sum);

        sum = solve.getResult("1+2*3-1");
        assertEquals("6", sum);

        sum = solve.getResult("(3*2)%4");
        assertEquals("2", sum);

        sum = solve.getResult("4/4*2/2");
        assertEquals("1", sum);

        sum = solve.getResult(")(");
        assertEquals("ERR", sum);

        sum = solve.getResult("(1+2+3)/0");
        assertEquals("ERR", sum);

        sum = solve.getResult("1+2");
        assertEquals("3", sum);

        sum = solve.getResult("2%2");
        assertEquals("0", sum);

        sum = solve.getResult("16/8+(6-2)");
        assertEquals("6", sum);

        sum = solve.getResult("9*9+19-50");
        assertEquals("50", sum);

        sum = solve.getResult("2%0");
        assertEquals("ERR", sum);
    }
}