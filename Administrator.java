public class Admnistrator extends Employee {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus();
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.2; 
    }

    @Override
    public void promover() {
        System.out.println(nome + " foi promovido a um cargo de Gerente Sênior!");
    }
}