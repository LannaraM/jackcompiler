package br.ufma.ecp;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

import br.ufma.ecp.token.Token;
import br.ufma.ecp.token.TokenType;

public class CodeGenerator extends TestSupport{
    @Test
    public void testInt () {
        var input = """
            10
            """;

        var parser = new Parser(input.getBytes(StandardCharsets.UTF_8));
        parser.parseExpression();
        String actual = parser.VMOutput();
        String expected = """
                push constant 10       
                    """;
            assertEquals(expected, actual);
    }

}