public class ExemploForArray 
{
    public static void main(String[] args) 
    {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for (int x=0; x < alunos.length; x++) //indice inicia em 0 em arrays, por isso x=0;
        {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    
    }
}

/* OUTRO JEITO DE FAZER O MESMO É ASSIM DE MANEIRA ABREVIADA 

public class ExemploForEachArray 
{
    public static void main(String[] args) 
    {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
            //Forma abreviada
        for(String aluno : alunos) 
        {
          System.out.println(alunos);
        }
    
    }
}

*/