# Java IV - O que são Enums e Anotações no Java?

---

## [Java Enums: O que são Enums no Java?](./Enums/src)

Qualquer aplicação um pouco mais sofisticada precisa usar alguns constantes. Exemplos clássicos são os dias da semana ou
os meses do ano, o estado de botão (on/off) ou algumas cores.

As **enums** são uma forma orientada a objetos de lidar com os constantes que a linguagem Java introduziu a partir da
versão 5.

- Algumas classes nativas do Java utilizam enums, por exemplo, a classe Thread:

```java
public class Teste {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("rodando ..."));
        t.setPriority(Thread.MIN_PRIORITY); // Enum -> MIN_PRIORITY
        t.start();
    }
}
```

- [Código de exemplo](./Enums/src/Prioridade.java);
- Os objetos dentro da classe enum se comportam como se já tivessem sido instanciados (new)
- Onde poderiamos utilizar:
    - Mêses;
    - Status (de um pedido, de um thread);
    - Roles;
- Links:
    - [Documentação da classe Thread;](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)
    - [Tutorial oficial da Oracle sobre Enums.](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)

---

## [Java Anotações: O que são @Anotações no Java?](./Enums/src)

As anotações entraram na versão 5 do Java e revolucionaram como configuramos as aplicações Java. Através delas podemos
definir metadados dentro das classes, algo muito útil quando precisamos configurar uma biblioteca ou framework do
mercado.