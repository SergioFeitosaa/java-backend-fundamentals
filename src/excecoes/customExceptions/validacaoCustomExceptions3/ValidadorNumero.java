package excecoes.customExceptions.validacaoCustomExceptions3;

public class ValidadorNumero {

    public void validar(int numero) {
        if (numero < 0) {
            throw new NumeroNegativoException("numero não pode ser negativo");
        }

        if (numero == 0) {
            throw new NumeroZeroException("Número não pode ser zero");
        }
    }

}
