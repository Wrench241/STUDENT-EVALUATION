import java.io.PrintStream;

import javax.naming.spi.DirStateFactory.Result;

public class AlunoDados extends Aluno {
    public String name;
    public double nota, nota2, nota3;
    public double result = nota + nota2 + nota3;

    public void calcule(){
         if (nota < 30 && nota2 < 35 && nota3 < 35){
            double rs = nota + nota2 + nota3;
        System.out.println("FINAL GRADE = "+somaResult(rs)+"\nFALIED");
        
        System.out.printf("MISSING %d POINTS",(int)returnResult());
      
        } else {
            double rs = nota + nota2 + nota3;
            System.out.print("FINAL GRADE = "+somaResult(rs)+"\nPASS");
        }
        
    }
    public double returnResult(){
        double rs = 0;
      if (resultAbsolut() < 60.00){
         rs += 60.00 - resultAbsolut();
     }
            return rs;
    }

    public String somaResult(double value){
        resultAbsolut();
        return String.format("%.2f",value);
        
    }
    public double resultAbsolut(){
        return nota + nota2 + nota3;
    }
    public double resultFINAL(double value){
        
       return value;
        
    }


    
}
