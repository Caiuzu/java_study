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
- **Quando utilizar?**
  - Temos um exemplo na classe **Funcionario**, de quando tentamos fazer o getBonificacao específico para cada cargo. 
    A classe começou a crescer e haver muitas repetições. Sendo assim, pudemos ver a necessidade de aplicação do Polimorfismo. 
    Quando instanciamos um objeto com a classe genérica, conseguimos então atribuir para cada classe 
    específica(cada cargo), um comportamento da bonificação para cada um em sua devida classe, o devido valor.
 
    ```java
      public class Designer extends Funcionario {
      
        public double getBonificacao() {
            return 200;
        }
      }
    ```
    
---
### Aula 4 - Herança e o uso de construtores:

- **Conceitos de herança, construtores e polimorfismo:**
    - Quando uma classe herda de outra ela recebe apenas seus atributos e métodos;
    - Construtores não são herdados;
- **A utilização da anotação `@Override`:**
    - É usada para sobrescrever o método da classe mãe, indicando que o método original foi alterado;
    - Serve como uma segurança/lembrete de que o método é uma sobrescrita e não um novo método.
- **Um construtor da classe mãe pode ser chamado através do `super()`** -> `super(agencia, numero);`
- **A construção de um objeto é baseada em seu(s) construtor(es)** 
  - Assim que criarmos o nosso próprio construtor, o construtor default (sem parâmetros) deixa de existir, 
    No entanto, nada impede adicionar o construtor default explicitamente.

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
  - Usamos métodos abstratos quando queremos "forçar"/obrigar que um filho concreto (classe concreta) implemente um método.
  - Quando usamos? Um exemplo é quando não temos uma implementação na classe mãe mas queremos que os filhos dela tenham. 
    Ou seja, neste caso ela só existiria para dizer "quem quiser usar este método implemente-o". 
    Não esquecendo que ele será implementado pelos filhos e usado de forma polimorfica.

---
### Aula 6 - Interfaces:

- Não existe herança múltipla em Java.
    - Quando nos vemos em uma situação onde sentimos a necessidade de realizar heranças multiplas, então devemos aplicar o uso de interface.
- Conceitos de interface.
  - É uma classe abstrata, com todos os métodos abstratos. Dentro de uma interface, não há nada concreto.
  - Interfaces não possuem atributos dentro de seu corpo.
  - [ `interface` | `implements` ] Utilizaremos a analogia de um contrato. Este contrato precisa ser assinado. Quem o faz, está obrigado a implementar os métodos (por exemplo  os métodos `setSenha`, e o `autentica()` na classe `Autenticavel` em **bytebank-herdados** sendo implementado nas classes `Administrador` e `Gerente`).
  - Ela é um contrato onde quem assina se responsabiliza por implementar esses métodos (cumprir o contrato)
  - Podemos estender apenas uma classe abstrata, mas podemos implementar várias interfaces.
  - Se a utilização da interface começar a crescer com métodos semelhantes, podemos utilizar um método dafault ou retomar para a herança.
- Diferenças entre classes abstratas e interfaces. Um contrato que define obrigações
- Interfaces são uma alternativa a herança referente ao polimorfismo
  - Temos polimorfismo quando uma classe extende de outra ou também quando uma classe implementa uma interface.

---
### Aula 7 - Praticando herança e interfaces:

- Revisão:
   ```
    Em comparação com o conceito de herança, onde temos os pilares da reutilização de código e do polimorfismo, 
    quando falamos de interfaces, não há código concreto, assim, o objetivo não é a reutilização de código, ela é, sim, 
    uma alternativa ao polimorfismo.
    
    Se quisermos somente uma solução pura de polimorfismo, podemos utilizar a interface.
    
    Mas e se quisermos somente a reutilização de código, é recomendado utilizar a herança? 
    Não, a herança é recomendada quando há a combinação das necessidades de reutilização de código e polimorfismo.
  ```
  - E se a necessidade for somente a reutilização de código?
     - Anteriormente, havíamos observado que repetimos muitas vezes, em nosso programa, as linhas de código referentes aos
    métodos setSenha() e autentica(). A ideia é isolarmos estas linhas de código em uma classe e realizar a instanciação
    delas dentro do construtor e utilizarmos conforme podemos ver nas classes `Administrador`, `Gerente` e `Cliente`.
  
      ```Java
        public class AutenticacaoUtil {
            private int senha;
        
            public void setSenha(int senha) {
                this.senha = senha;
            }
        
            public boolean autentica(int senha) {
                return this.senha == senha;
            }
        }
      ```
      
    ```Java
        public class Cliente implements Autenticavel {
      
         private final AutenticacaoUtil util;
      
          public Cliente() {
              this.util = new AutenticacaoUtil();
          }
      
          @Override
          public void setSenha(int senha) {
              this.util.setSenha(senha);
          }
      
          @Override
          public boolean autentica(int senha) {
              return this.util.autentica(senha);
          }
        }
      ```

- Mais a fundo sobre o uso de interfaces:
    - Garante que todos os métodos de classes que implementam uma interface possam ser chamados com segurança.
    - Isso é a ideia do contrato, garantindo que a classe tenha um comportamento, basta assinar o contrato (implementar a inteface).
- Trabalhamos mais a fundo com herança:
    - A herança captura o que é comum e isola aquilo que é diferente entre classes.
- Vimos outras aplicações de heranças e interfaces ([bytebank-exercicio](./bytebank-exercicio))