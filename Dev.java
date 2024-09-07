public class Dev extends Employee {

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus();
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.1; 
    }

    @Override
    public void promover() {
        System.out.println(nome + " foi promovido a um cargo de Desenvolvedor Pleno!");
    }
}
