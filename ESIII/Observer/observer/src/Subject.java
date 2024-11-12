public interface Subject {

    public void adicionarObservador(Observer observador);
    public void removerObservador(Observer observador);
    public void notificarObservadores();
}
