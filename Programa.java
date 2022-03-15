public class Programa {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        Designer f = new Designer();
        EditorVideo ev = new EditorVideo();

        g.setSalario(5000);
        ev.setSalario(2500);
        f.setSalario(2000);
                    
        CalculoBonificacao c = new CalculoBonificacao();
        c.registra(g);
        c.registra(ev);
        c.registra(f);

        System.out.println(c.getSoma());
        System.out.println(g.bonificacao());
        System.out.println(ev.bonificacao());
        System.out.println(f.bonificacao());
        
    }
}