package listajunho;

public class Scanner {

	public static void main(String[] args) {	
	}
	public int nextInt() { // declaro minha condicao de variavel int

	}

}
class exerciciovetores
{
	public static void main (String[] args)
	{
        Scanner ler = new Scanner();
        
        int a[]={0,0,0,0,0}; // declaro as variaveis int igual a zero,pois o usuario ira informar os valores
        
        int b[]={0,0,0,0,0};
        
        int x=0;
        int c=0;
        
        do // declaro meu laco de repeticao
       
        {
            System.out.print ("\nDigite o valor de A:"); // imprimi ao usuario
            a[x] = ler.nextInt(); // guarda a informacao para a formacao da matriz
            
            System.out.print ("Digite o valor de B:");// imprimi ao usuario
            b[x] = ler.nextInt();// guarda a informacao para a formacao da matriz
          
            x++;// adicionando a cada informacao inserida do usuario 1+
            
        }
        
        while (x<5); // enquanto x for menor que 5 ele executara novamente o programa
        x=0;  
        c=0;
        
        do
        
        {
            c = c + (a[x] * b[x]); // c é igual a c + variavel[a]x * variavel b[x]
            x++;
           
        }
        while (x<5);// enquanto x for menor que 5 ele executara novamente o programa
       
        System.out.printf("\n\nO valor de c e igual a: "+c+"\n\n"); // c e igual a '' calculo ''
        
    }
   
}
}
}
