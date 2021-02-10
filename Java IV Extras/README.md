# Java Enums: O que são Enums no Java?

### Enums:

Qualquer aplicação um pouco mais sofisticada precisa usar alguns constantes. Exemplos clássicos são os dias da semana ou
os meses do ano, o estado de botão (on/off) ou algumas cores.

As **enums** são uma forma orientada a objetos de lidar com os constantes que a linguagem Java introduziu a partir da
versão 5.

- Alguma classes nativas do java utilizam enums como por exeplo a classe Thread:
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