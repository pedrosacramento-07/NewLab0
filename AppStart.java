
/**
 * Escreva a descrição da classe AppStart aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class AppStart
{
    public static void main(String[] args){
        Size size = Size.MEDIUM;
        
        System.out.println(" Name     : "+ size.name());
        System.out.println("toString()    : \""+ size.toString().trim());
        System.out.println("Ordem        : " + size.ordinal());
        System.out.println("Valor mínimo    : " + size.getMinValue());
        System.out.println("Valor máximo    : " + size.getMaxValue()); 
        System.out.println("Código     : "+ size.getCode()+"\''");
         
          
        
    }
}
