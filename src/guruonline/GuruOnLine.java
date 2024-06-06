package guruonline;

import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;
//para passar sting para int é "Interger.parseInt(variavel);"

/**
 * Rafael Alegrazzi klein
 */
public class GuruOnLine {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        JOptionPane.showConfirmDialog(null, "Olá tudo bem somos a ASTRO CONSELHO LTDA");
        JOptionPane.showConfirmDialog(null, "E queremos que você responda nosso formulario");
        //sorte
        double sorte = 0;
        // Estado civil
        String nome;
        System.out.println("Informe seu nome completo");
        nome = ler.nextLine();
        if (nome.length() <= 8) {
            System.out.println("Legal se Você mostrar sua carteira de indentidada posso considerar.");
        } else {
        }
        System.out.println("Informe 1 para feminino e 2 para masculino se colocar qualquer outro numero sera definido como masculino");
        int sexo = ler.nextInt();
        // Estado civil
        int estadocivil;
        System.out.println("Informe seu Estado Civil");
        System.out.println("1 :solteiro");
        System.out.println("2 :casado");
        System.out.println("3 :divorciado");
        System.out.println("4 :viuvo");
        System.out.println("5 :separado");
        estadocivil = ler.nextInt();

//String solteiro, String casado, String divorciado, String viuvo ,String separado
//Idade
        System.out.println("Informe o Ano de nascimento");
        int ano = ler.nextInt();
        System.out.println("Informe o Mes de nascimento");
        int mes = ler.nextInt();
        System.out.println("Informe o DIA de nascimento");
        int dia = ler.nextInt();
        if (ano <= 1900 || mes <= 0 && mes > 12 || dia < 1 && dia > 31 || ano > 2024) {
            System.out.println("Informe um ano valido");
        } else if (mes == 1 && dia > 31) {
            System.out.println("Informe um ano valido");
        } else if (ano % 400 == 0 && ano % 4 == 0 && mes == 2 && dia == 29) {
            System.out.println("┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴");
            System.out.println(" Olá " + Genero(sexo) + " " + nome + " Seu signo é :" + Signo(dia, mes));
            System.out.println(" Sua idade é :" + Idade(dia, mes, ano) + " Anos");
            System.out.println(" Nascido no dia |" + dia + "-" + mes + "-" + ano + "|");
            System.out.println(" O seu numero da sortre é :" + sortear(sorte));
            System.out.println(" Seu Estado Civil Atualmente é :" + EstadoCivil(estadocivil));
            System.out.println("┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴");
        } else if (mes == 2 && dia > 28) {
            System.out.println("Informe um ano valido");
        } else if (mes == 3 && dia > 31) {
            System.out.println("Informe um ano valido");
        } else if (mes == 4 && dia > 30) {
            System.out.println("Informe um data valido");
        } else if (mes == 5 && dia > 31) {
            System.out.println("Informe um ano valido");
        } else if (mes == 6 && dia > 30) {
            System.out.println("Informe um ano valido");
        } else if (mes == 7 && dia > 31) {
            System.out.println("Informe um ano valido");
        } else if (mes == 8 && dia > 31) {
            System.out.println("Informe um ano valido");
        } else if (mes == 9 && dia > 30) {
            System.out.println("Informe um ano valido");
        } else if (mes == 10 && dia > 31) {
            System.out.println("Informe um ano valido");
        } else if (mes == 11 && dia > 30) {
            System.out.println("Informe um ano valido");
        } else if (mes == 12 && dia > 31) {
            System.out.println("Informe um ano valido");

        } else {
            System.out.println("┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴");
            System.out.println(" Olá " + Genero(sexo) + " " + nome + " Seu signo é :" + Signo(dia, mes));
            System.out.println(" Sua idade é :" + Idade(dia, mes, ano) + " Anos");
            System.out.println(" Nascido no dia |" + dia + "-" + mes + "-" + ano + "|");
            System.out.println(" O seu numero da sortre é :" + sortear(sorte));
            System.out.println(" Seu Estado Civil Atualmente é :" + EstadoCivil(estadocivil));
            System.out.println("┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴");
        }
    }

    public static String EstadoCivil(int estadocivil) {
        String z = null;
        if (estadocivil == 1) {
            z = "Solteiro";
        } else if (estadocivil == 2) {
            z = "casado";
        } else if (estadocivil == 3) {
            z = "divorciado";
        } else if (estadocivil == 4) {
            z = "viuvo";
        } else if (estadocivil == 5) {
            z = "separado";
        } else {
            z = "Estado civil Incorreto";
        }
        return z;
    }

    public static double sortear(double sorte) {
        sorte = (int) 1 + (int) (Math.random() * 100);
        return sorte;
    }

    public static int Idade(int dia, int mes, int ano) {
        Calendar hoje = Calendar.getInstance();
        int anoA = hoje.get(Calendar.YEAR);
        int mesA = hoje.get(Calendar.MONTH) + 1;
        int diaA = hoje.get(Calendar.DATE);
        int idade = ((anoA * 365 + mesA * 12 + diaA) - (ano * 365 + mes * 12 + dia)) / 365;
        return idade;
    }

    public static String Signo(int dia, int mes) {
        String x = null;
        String[] signo = {"Aquário", "Peixes", "Áries", "Touro", "Gémeos", "Cáncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio"};
        if (mes == 1 && dia >= 21 && dia <= 31 || mes == 2 && dia <= 19) {
            x = signo[0];//Aquário
        } else if (mes == 2 && dia >= 20 && dia <= 29 || mes == 3 && dia <= 20) {
            x = signo[1];//Peixes
        } else if (mes == 3 && dia >= 21 && dia <= 31 || mes == 4 && dia <= 20) {
            x = signo[2];//Áries
        } else if (mes == 4 && dia >= 21 && dia <= 30 || mes == 5 && dia <= 20) {
            x = signo[3];//Touro
        } else if (mes == 5 && dia >= 21 && dia <= 31 || mes == 6 && dia <= 20) {
            x = signo[4];//Gémeos
        } else if (mes == 6 && dia >= 21 && dia <= 30 || mes == 7 && dia <= 21) {
            x = signo[5];//Cáncer
        } else if (mes == 7 && dia >= 22 && dia <= 31 || mes == 8 && dia <= 22) {
            x = signo[6];//Leão
        } else if (mes == 8 && dia >= 23 && dia <= 29 || mes == 9 && dia <= 22) {
            x = signo[7];//Virgem
        } else if (mes == 9 && dia >= 23 && dia <= 31 || mes == 10 && dia <= 22) {
            x = signo[8];//Libra
        } else if (mes == 10 && dia >= 23 && dia <= 31 || mes == 11 && dia <= 21) {
            x = signo[9];//Escorpião
        } else if (mes == 11 && dia >= 22 && dia <= 30 || mes == 12 && dia <= 21) {
            x = signo[10];//Sagitário
        } else if (mes == 12 && dia >= 22 && dia <= 31 || mes == 1 && dia <= 20) {
            x = signo[11];//Capricórnio    
        }
        return x;

    }

    public static String Genero(int sexo) {
        String trata;
        if (sexo == 1) {
            trata = "Senhora";
        } else {
            trata = "Senhor";
        }
        return trata;
    }

}
