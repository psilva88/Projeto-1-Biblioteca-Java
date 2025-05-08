System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.println("Digite sua idade: ");
		Integer idade = scan.nextInt();
		scan.nextLine();
		System.out.println("Digite sua cidade natal: ");
		String cidadeNatal = scan.nextLine();
		System.out.println("seu nome é: " + nome + " você tem " + idade + " anos de idade e sua cidade natal é " + cidadeNatal);
		System.out.println("Por favor digite três números inteiros e irei fazer a sua soma, média e produto");
		Integer primeiroNumero = scan.nextInt();
		Integer segundoNumero = scan.nextInt();
		Integer terceiroNumero = scan.nextInt();
		Integer soma = primeiroNumero + segundoNumero + terceiroNumero;
		Integer média = (primeiroNumero + segundoNumero + terceiroNumero)/3;
		Integer produto = primeiroNumero * segundoNumero * terceiroNumero;
		System.out.println("A soma dos números é: " + soma + " a média deles é: " + média + " e o produto deles é: " + produto);
		System.out.println("Digite sua altura e depois seu peso para calcularmos o IMC: ");
		float altura = scan.nextFloat();
		float peso = scan.nextFloat();
		scan.nextLine();
		scan.close();
		float imc = peso/(altura*altura);
		String imcArredondado = String.format("%.2f", imc);
		System.out.println("O seu IMC é igual a " + imcArredondado);
		
		JOptionPane.showMessageDialog(null, "let me knowwww let me knowww doyoulovethewayidoitwhenimlovingyourbodywhenimlovingyourbodylolovingyourbody");
		JOptionPane.showMessageDialog(null, "Bem-Vindo ao sistema de somar, calcular média e produto de três números inteiros!");
		String  numero1 = JOptionPane.showInputDialog("digite um número");
		String  numero2 = JOptionPane.showInputDialog("digite outro");
		String  numero3 = JOptionPane.showInputDialog("mais um pelas caridades");
	    float numero1Flotada = Float.valueOf(numero1);
	    Math.round(numero1Flotada);
	    float numero2Flotada = Float.valueOf(numero2);
	    Math.round(numero2Flotada);
	    float numero3Flotada = Float.valueOf(numero3);
	    Math.round(numero3Flotada);
		float somaCaridade = numero1Flotada + numero2Flotada + numero3Flotada;
		System.out.println("a soma do números é: " + somaCaridade);
		float mediaNumero = (numero1Flotada + numero2Flotada + numero3Flotada)/3;
		System.out.println("a média dos números é: " + mediaNumero);	
		float produtoNumero = numero1Flotada * numero2Flotada * numero3Flotada;
		System.out.println("o produto dos números é: " + produtoNumero);

		System.out.println("Digite um milharal e direi se ele é impar ou par");
	Integer milharal =scan.nextInt();
	if (milharal % 2 == 0) {
       System.out.println("Este milharal é pareia");
   }
   else {
       System.out.println("Este milharal é imparavel");
   }
	System.out.println("por favor eu estou morrendo e preciso saber qual dos dois números que você digitar é maior.");
	System.out.println("DIGITE O PRIMEIRO: ");
	Integer numero11 = scan.nextInt();
	System.out.println("DIGITE O SEGUNDO RAPIDAMENTE: ");
	Integer numero22 = scan.nextInt();
	if (numero11 > numero22) {
		System.out.println("O PRIMEIRO NUMERO " + numero11 + " É MAIOR NESSA PORRRAAAAAAA");
	}
	else if (numero22 > numero11) {
		System.out.println("O SEGUNDO NUMERO " + numero22 + " É MAIOR NESSA DESGRAÇAAA");
	}
	else {
		System.out.println("ESSA MIZERA É IGUAAAAAAAAAALLLLLLLLLLL");
		}
	System.out.println("Digite sua MÉDIA (0-10) em alguma disciplina, Para vovô checar se vc passou!:");
	Double mediafinal = scan.nextDouble();
		if (mediafinal >= 7 && mediafinal <= 10) {
			System.out.println("Vovô vai le dar 3 Clubes Fortnites e  Gta 6");}
		else if (mediafinal >= 0 && mediafinal <= 6) {
			System.out.println("Vovô vai le dar 30 lapadas!!!");}
		else {
			System.out.println("Vovô não entendeu, fale de novo!");}

	int[] numericos = {1,2,3,4,5};
	for(int i=0; i<numericos.length; i++){
		System.out.println(numericos[i]);
	}

	System.out.println("Os números de 1 a 10 par são: ");
	for(int i = 2; i <= 10;  i+=2 ) {
		System.out.println(i);
	}

	System.out.println ("O valor de 1 a 10 elevado a 2 é:");
	for(int i = 2; i <= 10;  i++ ) {
		int fatorial = i*i;
		System.out.println(fatorial);
	}
	String [] chupacabra = {"Carro", "Casa", "avião", "ônibus", "SS. Anne"};
	
	for (String carlinhos:chupacabra) {
		if (carlinhos.length() > 4) {
			System.out.println(carlinhos);
		}
	}
	Integer [] numerosIguais = {3, 7, 11, 18, 25};
	for (Integer numerosLegais:numerosIguais) {
		if (numerosLegais == 18) {
			System.out.println("18 ta bem");
		}
	}
	String [] linguagens = {"Java", "Python", "Ruby"};
	
	for (String linguado:linguagens) {
		System.out.println(linguado.toUpperCase());
		}
		for (String linguado:linguagens) {
		System.out.println(linguado.toUpperCase());
		}
		
	int contados = 0;
	while (contados <20) {
		contados+=2;
		System.out.println(contados);
	}
	
	int monsterLaranja = -1;
	int bababue = 0;
	while (monsterLaranja < 50) {
	monsterLaranja+=2;
	bababue += monsterLaranja;
	System.out.println("a soma dos catetos é: " + bababue);
	}
		
	String continuar;
	int multiplicacao = 0;
	int soma;
	do {
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		scan.nextLine();
		multiplicacao = numero * 2;
		soma = multiplicacao + multiplicacao;
		System.out.println("Deseja continuar? ");
		continuar = scan.nextLine();
				
	}while(continuar.equalsIgnoreCase("sim"));
	System.out.println("A multiplicão é: " + soma);

	int contados = 0;
	Integer numero = 0;
	System.out.println("Digite um número: ");
	numero = scan.nextInt();
	do {
		if (numero >= 1) {
		contados++;
		System.out.println(contados);}
		else {
			System.out.println("número inválido.");
		}

	} while (contados < numero);

	System.out.println("Selecione uma das opções abaixo:\n 1) 🔍 Listagem das Manifestações\n 2) 📂 Listagem das manifestações filtradas por tipo\n 3) ➕ Criar uma nova manifestação\n 4) 📊 Exibir a quantidade total de manifestações\n 5) 🔎 Pesquisar uma manifestação através do código\n 6) 🗑️  Excluir uma manifestação pelo código\n 7) 🚪 Sair do sistema\n");
		Integer opcao1 = 0;
		opcao1 = scan.nextInt();
		switch (opcao1) {
		case 1:
			int contados = 0;
			Integer numero = 0;
			System.out.println("Digite um número: ");
			numero = scan.nextInt();
			do {
				if (numero >= 1) {
				contados++;
				System.out.println(contados);}
				else {
					System.out.println("número inválido.");
				}

}
}

import java.util.Scanner;
import javax.swing.JOptionPane;
