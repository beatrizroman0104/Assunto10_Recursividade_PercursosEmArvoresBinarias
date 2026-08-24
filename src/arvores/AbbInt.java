package arvores;

public class AbbInt {

    private class No{
        int dado;
        No esq, dir;
    }

    public No root = null;

    public No inserir(No p, int info){
        if (p == null){
            p = new No();
            p.dado = info;
            p.esq = null;
            p.dir = null;
        } else if (info < p.dado){
            p.esq = inserir(p.esq, info);
        } else {
            p.dir = inserir(p.dir, info);
        }
        return p;
    }

    public void mostrarEmOrdem(No p){
        if (p != null){
            mostrarEmOrdem(p.esq);
            System.out.print("\t"+ p.dado);
            mostrarEmOrdem(p.dir);
        }
    }
}
