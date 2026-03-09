☕ Sistema de Classificação Indicativa em Java

Este projeto foi desenvolvido como parte dos meus estudos na disciplina de Linguagem Orientada a Objetos no curso de ADS (Anhanguera). O objetivo é aplicar a lógica de decisão para validar o acesso de usuários a conteúdos baseados na idade.

🔍 O que este código exercita?

O programa recebe a idade do usuário e a classificação do filme (ex: "Livre", "14+", "18+"). Ele então processa essas informações para permitir ou negar o acesso.

Principais Conceitos Aplicados:

Estruturas Condicionais: Uso de if, else if e else para criar múltiplas camadas de verificação.

Método .equals(): Diferente de outras linguagens, em Java usamos .equals() para comparar o conteúdo de Strings (objetos), o que é uma base fundamental de POO.

Operadores Lógicos (&&): Utilizados para garantir que o acesso só seja permitido se a classificação bater e a idade for suficiente ao mesmo tempo.

🚀 Exemplo de Funcionamento

O sistema verifica se a classificação é "16+".

Se o usuário tiver 17 anos, a condição (idadeUsuario >= 16) é verdadeira.

O console exibe: Acesso permitido.

Se o usuário tiver 15 anos, ele cai no else final: Acesso negado. Idade insuficiente.

🛠️ Como Executar

Tenha o JDK instalado na sua máquina.

Compile o arquivo:

javac Decisao.java


Execute o programa:

java Decisao


Desenvolvedor: Igor M. Santos
Curso: ADS - Anhanguera