
/**
 * Enumeration class Size - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Size {
    SMALL(32, 36, "Pequeno",'S'),
    MEDIUM(37, 44, "Médio",'M'),
    LARGE(45, 52, "Grande",'L');
    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;
/**
 * Construtor da classe
 */
    private Size(int minValue, int maxValue, String description, char code){
        this.description=description;
        this.minValue=minValue;
        this.maxValue=maxValue;
        this.code=code;
    }
/**
 * Método toString 
 * return o toString
 */
    @Override
    public String toString() {
        return this.description;
    }
/**
 * Método que retorna o descrição
 * return description- Descrição
 */
    public String getDescription() {
        return description;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public char getCode() {
        return code;
}

}