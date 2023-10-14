import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double[] notasAluno1 = new double[5];
        notasAluno1[0] = 6.3;
        notasAluno1[1] = 5;
        notasAluno1[2] = 9.3;
        notasAluno1[3] = 4.2;
        notasAluno1[4] = 7.3;

        System.out.println(Arrays.toString(notasAluno1));
        double totalAluno1 = 0;
        for (int i = 0; i < notasAluno1.length; i++) {
            totalAluno1 += notasAluno1[i];
        }

        double mediaAluno1 = totalAluno1/notasAluno1.length;

            if(mediaAluno1 <= 10){
                System.out.println("Aluno 1 Reprovado");

            }    else{
                System.out.println("Aluno 1 Aprovado");
            }
        System.out.println("Notas aluno 1: " + totalAluno1 / notasAluno1.length);


            //Declarando array de ua forma direta
        double[] notasAluno2 = {5.7, 9.4, 5.8, 3.5, 6.8} ;

        System.out.println(Arrays.toString(notasAluno2));
        double totalAluno2 = 0;

        for(int j = 0; j < notasAluno2.length; j++){
            totalAluno2 += notasAluno2[j];
            }
        double mediaAluno2 = totalAluno2/ notasAluno2.length;
                if(mediaAluno2 <10){
                    System.out.println("Aluno 2 Reprovado");
                } else{
                    System.out.println("Aluno2 Aprovado");
                }
        System.out.println("Notas aluno 2: " + totalAluno2/ notasAluno2.length);


    }

}