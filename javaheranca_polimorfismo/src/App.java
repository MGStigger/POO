public class App {
    public static void main(String[] args) throws Exception {

        /*Carro onix = new Carro("chevrolet");
        Carro camaro = new Carro("chevrolet");
        Carro uno = new Carro("chevrolet");
        Moto moto = new Moto("chevrolet");
        
        moto.ligar();
        onix.ligar();
        camaro.ligar();
        uno.ligar();

        System.out.println(moto);
        System.out.println(onix);

        System.out.println("Hello, World!");*/



        Veiculo veiculo1 = new Carro("Plutus");
        Veiculo veiculo2 = new Moto("Panigale");
        Pessoa marcos = new Pessoa("Marcos");
        marcos.locomover(veiculo1);
        marcos.locomover(veiculo2);

    }
}