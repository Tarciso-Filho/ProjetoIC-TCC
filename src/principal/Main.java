package principal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
	public static int lerNovoInteiro( int opcao ) throws InputMismatchException
    {
        Scanner ler = new Scanner(System.in);
        int resultado;
        
        switch (opcao)
        {
            case 1:
                System.out.println("Digite:");
                System.out.println("01-Para criar um TCC;");
                System.out.println("02-Para agendar um TCC;");
                System.out.println("03-Para pesquisar um TCC;");
                System.out.println("04-Para mostrar o agendamento de um TCC;");
                System.out.println("05-Para remover um TCC;");
                System.out.println("06-Para criar uma banca;");
                System.out.println("07-Para alocar uma banca a um TCC;");
                System.out.println("08-Para editar uma banca;");
                System.out.println("09-Para vizualizar uma banca;");
                System.out.println("10-Para imprimir os comprovantes de presença;");
                System.out.println("11-Para inserir um convidado;");
                System.out.println("12-Para editar um convidado;");
                System.out.println("13-Para mostrar o orçamento do convidado;");
                System.out.println("14-Para remover um convidado;");
                System.out.println("00-Para Sair\n");
                break;
            default:
                break;
        }
        resultado=ler.nextInt();
        ler.nextLine();
        return resultado;
    }

	public static void main(String[] args)
	{
		boolean cancelar, pronto;
        int opção = 42;
        do
        {
            cancelar = false;
            pronto = false;
            while(!pronto)
            {
                try
                {
                    opção = lerNovoInteiro(1);
                    pronto = true;
                }catch(InputMismatchException erro)
                {
                    System.out.println("Por favor, digite apenas números!!!\n");
                }
                
            }
            
            switch(opção)
            {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                case 11:
                    
                    break;
                case 12:
                    
                    break;
                case 13:
                    
                    break;
                case 14:
                    
                    break;
                case 0:
                    System.out.println("O programa foi encerrado com sucesso!"
                            + "\nManoela, Victor e Tarciso agradecem a preferência!!!");
                    break;
                default:
                    System.out.println("Você digitou uma opção incorreta,"
                            + " por favor, digite outra opção!\n");
            }
            
        }while(opção != 0);

	}

}
