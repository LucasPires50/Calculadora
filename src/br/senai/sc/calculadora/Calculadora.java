package br.senai.sc.calculadora;

import java.util.Scanner;
import operação.OperaçoesAvançadas;
import operação.OperaçoesBasicas;

public class Calculadora {

    public static void main(String[] args) {

        //instanciar a classe para poder criar o objeto
        OperaçoesBasicas op = new OperaçoesBasicas();
        OperaçoesAvançadas opA = new OperaçoesAvançadas();
        // OperaçoesBasicas op = intanciar a classe
        // new OperaçoesBasicas(); = cria o objeto 
        Scanner leia = new Scanner(System.in);
        String aux = "não";

        while (true) {
            System.out.println("Escolha uma operação:\n s - somar \n m - subitrair \n x - multiplicar \n d - dividir \n p - potência \n o - porcentagem "
                    + "\n a - Área² \n i - IMC \n r - raiz quadrada");
            System.out.println("----------------------------------");
            System.out.println("Informe a operação: ");
            char operação = leia.next().charAt(0);

            System.out.println("Informe Número 1: ");
            double num1 = leia.nextDouble();
            System.out.println("Informe Número 2: ");
            double num2 = leia.nextDouble();

            System.out.println("----------------------------------");

            switch (operação) {
                case 's':
                    System.out.println("Você escolheu a operação de soma.");
                    System.out.println(num1 + " + " + num2);
                    double resultado = op.somar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 'm':
                    System.out.println("Você escolheu a operação de subtrair.");
                    System.out.println(num1 + " - " + num2);
                    double resultado1 = op.subtrair(num1, num2);
                    System.out.println("Resultado: " + resultado1);
                    break;
                case 'x':
                    System.out.println("Você escolheu a operação de multiplicar.");
                    System.out.println(num1 + " x " + num2);
                    double resultado2 = op.multiplicar(num1, num2);
                    System.out.println("Resultado: " + resultado2);
                    break;
                case 'd':
                    System.out.println("Você escolheu a operação de dividir.");
                    System.out.println(num1 + " / " + num2);
                    double resultado3 = op.dividir(num1, num2);
                    System.out.println("Resultado: " + resultado3);
                    break;
                case 'p':
                    System.out.println("Operação de potenciação.");
                    System.out.println("Base: " + num1 + " Expoente: " + num2);
                    double resultado4 = opA.potencia(num1, num2);
                    System.out.println("Resultado: " + resultado4);
                    break;
                case 'o':
                    System.out.println("Operação de porcentagem.");
                    System.out.println("Valor Total: " + num1 + " Porgentagem: " + num2 + "%");
                    double resultado5 = opA.porcentagem(num1, num2);
                    System.out.println("Resultado: " + resultado5);
                    break;
                case 'a':
                    System.out.println("Área².");
                    System.out.println("Largura: " + num1 + " Centimetros: " + num2);
                    double resultado6 = opA.areaQuadrada(num1, num2);
                    System.out.println("Resultado: " + resultado6);
                    break;
                case 'i':
                    System.out.println("IMC.");
                    System.out.println("Peso: " + num1 + " Kg" + " Altura: " + num2);
                    double resultado7 = opA.imc(num1, num2);
                    System.out.println("Resultado: " + resultado7);
                    if (resultado7 < 18.5) {
                        System.out.println("Abaixo do peso!");
                    } else if (resultado7 >= 18.5 & resultado7 <= 24.9) {
                        System.out.println("Peso Normal!");
                    } else if (resultado7 >= 25 & resultado7 <= 29.9) {
                        System.out.println("Sobrepeso!");
                    } else if (resultado7 >= 30 & resultado7 <= 34.9) {
                        System.out.println("Obesidade Grau 1!");
                    } else if (resultado7 >= 35 & resultado7 <= 39.9) {
                        System.out.println("Obesidade Grau 2!");
                    } else {
                        System.out.println("Obesidade Grau 3!");
                    }
                    break;
                    case 'r':
                    System.out.println("Raiz Quadrada.");
                    System.out.println("Raiz quadrada de : " + num1);
                    double resultado8 = opA.raizQuadrada(num1);
                    System.out.println("Resultado: " + resultado8);
                    break;
            }
            System.out.println("----------------------------------");
            System.out.println("Deseja fazer um novo cálculo? ");
            System.out.println("S | N");
            aux = leia.next();
            if (aux.equals("n")) {
                break;
            }

        }

    }

}
