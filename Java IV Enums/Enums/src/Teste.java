public class Teste {

    public static void main(String[] args) {
//        Thread t = new Thread(() -> System.out.println("rodando ..."));
//        t.setPriority(Thread.MIN_PRIORITY);
//        t.start();

        //Prioridade pMin = new Prioridade();// não tem como instanciar uma enumeração

        Prioridade pMin = Prioridade.MIN;
        Prioridade pMax = Prioridade.MAX;

        System.out.println(pMin.name());
        System.out.println(pMax.name());

        System.out.println(pMin.ordinal()); // automaticamente os enums já são criados em uma ordem de prioridade/valor
        System.out.println(pMax.ordinal());

        System.out.println(pMin.getValor());
        System.out.println(pMax.getValor());



    }

}
