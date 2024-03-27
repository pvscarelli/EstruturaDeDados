package ed.ListaDupla;

public class NoListaDupla<T> {
    private T info;
    private NoListaDupla proximo;
    private NoListaDupla anterior;

    public T getInfo(){
        return this.info;
    }

    public void setInfo(T info){
        this.info = info;
    }

    public NoListaDupla<T>  getProximo(){
        return this.proximo;
    }

    public void setProximo(NoListaDupla<T> proximo){
        this.proximo = proximo;
    }

    public NoListaDupla<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoListaDupla<T> anterior) {
        this.anterior = anterior;
    }

    
}
