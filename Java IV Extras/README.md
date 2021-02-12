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

- Motivação: à 15 anos atrás, as classes java, para serem configuradas, utilizavam-se de diversos xmls.
- Por exemplo:

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<entity-mappings xmlns="http://java.sun.com/xml/ns/persistence/orm"
                 version="2.0">
    <description>financas</description>
    <entity class="br.com.bank.financas.modelo.Conta" name="Conta">
        <table name="TBL_CONTA"/>
        <attributes>
            <id name="id">
                <generated-value strategy="IDENTITY"/>
            </id>
            <basic name="titular">
                <column name="ctitular" length="100"/>
            </basic>
            <basic name="banco"></basic>
            <basic name="agencia"></basic>
            <basic name="numero"></basic>
        </attributes>
    </entity>

</entity-mappings>
```

- Agora vejamos quando utilizando as anotações, e o quanto o código fica mais enxuto e sem a necessidade de um arquivo
  extra:

```java

@Entity
@Table(name = "TBL_CONTA")
public class conta {

    @Id
    @GeneratedValue(strategy = GEnerationType.IDENTITY)
    private Integer id;

    @Colum(name = "ctitular", length = 100)
    private String titular;
    private String banco;
    private String agencia;
    private String numero;
    //...
}
```

- Normalmente apenas usamos a configuração enquanto outra biblioteca(no caso hibernate) lê o código com as anotações e
  sabe, por exemplo, no nosso código que teremos uma entidade mapeada a partir das anotações. _Quem verifica estas
  anotações é a máquina virtual_ ;
- Temos também as anotações como o `@Override` que será verificado pelo compilador. Há também a possibilidade de criar
  uma anotação própria (`@interface`: não possuí implementação).
- Sendo assim temos alguns tipos de anotações: Para o compilador como o hibernate ou para o compilador, como o
  @Override.
- **Aprofundaremos mais quanto ao assunto ao estudarmos** `reflection`!!!