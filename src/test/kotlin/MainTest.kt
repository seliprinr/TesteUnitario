import org.junit.jupiter.api.*
import sun.jvm.hotspot.utilities.Assert
import java.lang.NullPointerException

class MainTest {

    @Test
    fun testeIfElse() {
        Assertions.assertTrue((maiorDeIdade(29)))
    }


    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO() {
        Assertions.assertTrue(countXO("xxoox"))
        Assertions.assertTrue(countXO("xxoo"))
        Assertions.assertTrue(countXO("xXoo"))
        Assertions.assertTrue(countXO("xxOo"))


        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoox"))},
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xXoo"))},
            {Assertions.assertTrue(countXO("xxOo"))}
        )
    }

    @Test
    @Disabled
    fun naoImplementar() {

    }

    @Test
    fun vaiFalhar() {
        fail("Não posso terminar os testes sem esse método")
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxoo"))
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { abc() }
    }

}