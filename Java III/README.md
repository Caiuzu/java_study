# Java Polimorfismo: Entenda herança e interfaces

### Aula 1 - Introdução a herança:

- **Quais problemas a herança pode resolver:**
  - Muitos ifs que nunca param de crescer
  - Código pouco expressivo:
    - Qual tipo de funcionário representa o valor 0?
  - Repetição de código:
    - **Obs**: Esses problemas no código ou design também são chamados de `Code Smells` (mau cheiro no código). Existe um livro famoso **Clean Code**, do autor Robert C Martin, que ficou famoso pois mostra os Code Smells e como resolvê-los. O livro já é um pouco antigo, mas vale a leitura.
- **Construtores em Java**:
  - O construtor padrão (default) é aquele que não recebe nenhum parâmetro.
  - Um construtor é chamado na inicialização/criação do objeto.
- **Como usar herança no Java através de palavra chave extends**
  - Classe Mãe ou SuperClass: `class Funcionario {...}`
  - Classe que herda ou filha: `class Gerente extends Funcionario {...}`
- **Ao herdar, a classe filha ganha todas as características (atributos) e todas as funcionalidades (métodos) da classe mãe**
- **Conhecemos o primeiro benefício da herança: Reutilização do código**

---
### Aula 2 - Super e reescrita de métodos:

- A **classe mãe** é chamada de **super** ou **base class:**
  - Pode-se invocar qualquer método da classe mãe;
  - Uma classe pode ter diversas "filhas e netas" (que herdam umas das outras) mas não podemos escolher o que será herdado.
- A **classe filha** também é chamada de **sub class**
- **Como aumentar a visibilidade de um membro (atributo, método) através do `protected`**:
  - A palavra chave com a menor visibilidade é **private**, depois vem o **protected** e depois **public**:
    - `private` - apenas visível dentro da classe;
    - `protected` - visível dentro da classe e também para as filhas;
    - `public` - visível em todo lugar;
- **Como acessar ou chamar um membro (atributo, método) através do `super`**
- **Como redefinir um método através da `sobrescrita`**
- **Sobrecarga**:
  ```java
    public boolean autentica(int senha) {...}
    public boolean autentica(String login, int senha) {...}
  ```

---
### Aula 3 - Entendendo Polimorfismo:

- Objetos não mudam de tipo;
- A referência pode mudar, e aí entra o polimorfismo;
- O polimorfismo permite usar referências mais genéricas para a comunicação com um objeto;
  - Observar exemplo em `veiculo-polimorfismo` e `bytebank-herdados`
    - `public class Veiculo {...}`
    - `class Carro extends Veiculo {...}`
    - `Veiculo m = new Moto();`
  - Ao utilizar o polimorfismo, sempre será chamado o método mais específico. No exemplo de veículo acima, invocando um método que existe na classe mãe e na filha, o da filha (mais específica), será chamada prioritariamente. Por exemplo: `veiculo.liga();`
- O uso de referências mais genéricas permite desacoplar sistemas.
-  Quem define o que podemos chamar é a referência é a classe mãe.
   - Por exemplo Funcionario no projeto `bytebank-herdados`, não conseguiriamos fazer a chamada autentica como abaixo:
      ```java
        Funcionario f = new Gerente();
        f.autentica(1234); // f é do tipo Funcionario e a classe Funcionario não tem o método autentica
      ```
- o polimorfismo permite que referências de tipos de classes mais genéricas referenciam objetos mais específicos.

---
### Aula 4 - Herança e o uso de construtores:

- **Conceitos de herança, construtores e polimorfismo:**
    - Quando uma classe herda de outra ela recebe apenas seus atributos e métodos;
    - Construtores não são herdados;
- **A utilização da anotação `@Override`:**
    - É usada para sobrescrever o método da classe mãe, indicando que o método original foi alterado;
    - Serve como uma segurança/lembrete de que o método é uma sobrescrita e não um novo método.
- **Um construtor da classe mãe pode ser chamado através do `super()`**
- **A construção de um objeto é baseada em seu(s) construtor(es)** 
  - Assim que criarmos o nosso próprio construtor, o construtor default (sem parâmetros) deixa de existir, No entanto, nada impede adicionar o construtor default explicitamente.

---
### Aula 5 - Classes e métodos abstratos:

- O que são classes abstratas e para que servem: **Uma classe abstrata representa um conceito, algo abstrato, e o compilador não permite instanciar um objeto dessa classe. Para instanciar é preciso criar primeiro uma classe filha não abstrata.**
    - Por exemplo: Em uma empresa o `Funcionário` sempre possuí uma função/cargo. Logo, não faria sentido instanciar um funcionário, mas sim um cargo como `Gerente` que herda a abstração de um `Funcionario`.
    - Classes abstratas são úteis quando queremos utilizar comportamentos e atributos base em classes com comportamentos em comum.
    - Podem ter atributos, métodos concretos (com implementação), métodos abstratos (sem implementação) e não podem ser instanciadas
    - Exemplo: `public abstract class Funcionario {...}`
  

- O que são métodos abstratos e para que servem: **Abstract:**
  - Informa que o método não tem corpo, não há implementação. A implementação será por conta dos filhos.
  - Um método abstrato define apenas a assinatura (visibilidade, retorno, nome do método e parâmetros).
    - Exemplo: `public abstract double getBonificacao();`
  - Classes e métodos abstratos não tem relação direta com consumo de memória.
  - Usamos métodos abstratos quando queremos "forçar" que um filho concreto (classe concreta) implemente um método.