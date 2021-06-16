package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestaCalc {
    @Test
    public void testarSomarDoisNumeros(){
        // 1 - Prepara - Configurar - Given
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;
        
        // 2 - Executar - When
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado é " + resultadoEsperado + "\nO resultado atual foi " + resultadoAtual);

        assertEquals(resultadoEsperado, resultadoAtual);
    }
    @Test
    public void subtrairDoisNumeros(){
        // 1 - Prepara - Configurar - Given
        int num1 = 10;
        int num2 = 2;
        int resultadoEsperado = 8;

        // 2 - Executar - When
        int resultadoAtual = Calc.subtrairDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado é " + resultadoEsperado + "\nO resultado atual foi " + resultadoAtual);

        assertEquals(resultadoEsperado, resultadoAtual);
    }
    @Test
    public void multiplicarDoisNumeros(){
        // 1 - Prepara - Configurar - Given
        int num1 = 10;
        int num2 = 2;
        int resultadoEsperado = 20;

        // 2 - Executar - When
        int resultadoAtual = Calc.multiplicarDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado é " + resultadoEsperado + "\nO resultado atual foi " + resultadoAtual);

        assertEquals(resultadoEsperado, resultadoAtual);
    }
    @Test
    public void dividirDoisNumeros(){
        // 1 - Prepara - Configurar - Given
        int num1 = 10;
        int num2 = 2;
        int resultadoEsperado = 5;

        // 2 - Executar - When
        int resultadoAtual = Calc.dividirDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado é " + resultadoEsperado + "\nO resultado atual foi " + resultadoAtual);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

}
