
package ec5Ultimate;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int quantidadeAlunos = 0;
        int quantidadeProfessores = 0;

        double totalPagamentos = 0;

        boolean continuar = true;

        // Loop principal
        while (continuar) {

            System.out.println("\nDigite A (Aluno), P (Professor) ou FIM:");
            String tipo = sc.nextLine().trim().toUpperCase();

            if (tipo.equals("FIM")) {
                continuar = false;
                continue;
            }

            if (!tipo.equals("A") && !tipo.equals("P")) {
                System.out.println("Tipo inválido!");
                continue;
            }

            // Dados comuns
            System.out.println("Digite o nome:");
            String nome = sc.nextLine();

            double cpf;

            do {
                System.out.println("Digite o CPF:");
                String cpfDigitado = sc.nextLine().trim();

                if (cpfDigitado.length() != 11) {
                    System.out.println("CPF inválido!");
                    cpf = -1;
                } else {
                    try {
                        cpf = Double.parseDouble(cpfDigitado);
                    } catch (NumberFormatException e) {
                        cpf = -1;
                        System.out.println("CPF inválido!");
                    }
                }

            } while (cpf == -1);

            // Cadastro de Aluno
            if (tipo.equals("A")) {

                double nota1;
                double nota2;

                do {
                    System.out.println("Digite a primeira nota:");
                    nota1 = Double.parseDouble(sc.nextLine().replace(",", "."));

                    if (nota1 < 0 || nota1 > 10) {
                        System.out.println("Nota inválida!");
                    }

                } while (nota1 < 0 || nota1 > 10);

                do {
                    System.out.println("Digite a segunda nota:");
                    nota2 = Double.parseDouble(sc.nextLine().replace(",", "."));

                    if (nota2 < 0 || nota2 > 10) {
                        System.out.println("Nota inválida!");
                    }

                } while (nota2 < 0 || nota2 > 10);

                Aluno aluno = new Aluno(nome, cpf, nota1, nota2);

                pessoas.add(aluno);

                quantidadeAlunos++;

            }

            // Cadastro de Professor
            else if (tipo.equals("P")) {

                System.out.println("Digite a quantidade de aulas:");
                double quantidadeAulas = Double.parseDouble(sc.nextLine());

                System.out.println("Digite o valor da hora-aula:");
                double valorHoraAula = Double.parseDouble(
                        sc.nextLine().replace(",", ".")
                );

                Professor professor = new Professor(
                        nome,
                        cpf,
                        quantidadeAulas,
                        valorHoraAula
                );

                pessoas.add(professor);

                quantidadeProfessores++;

                totalPagamentos += professor.calcularPagamento();
            }
        }

        // Relatório final
        if (pessoas.isEmpty()) {

            System.out.println("Nenhuma pessoa cadastrada.");

        } else {

            System.out.println("\n===== DADOS CADASTRADOS =====");

            for (Pessoa pessoa : pessoas) {

                pessoa.exibirDadosResumidos();

                // Exibe informações específicas do Aluno
                if (pessoa instanceof Aluno) {

                    Aluno aluno = (Aluno) pessoa;

                    System.out.println("Média: " + aluno.calcularMedia());
                    System.out.println("Situação: " + aluno.verificarSituacao());
                }

                System.out.println("-------------------------");
            }

            System.out.println("\n===== RELATÓRIO FINAL =====");

            System.out.println("Quantidade de alunos: " + quantidadeAlunos);

            System.out.println("Quantidade de professores: " + quantidadeProfessores);

            System.out.println("Total de pagamentos: R$ " + totalPagamentos);
        }

        sc.close();
    }
}
