package estudos.pessoais.pkg2;
public class EstudosPessoais2 {

    public static void main(String[] args) {
        System.out.println(PersonTest.helloWorld());
        PersonTest Cassio = new PersonTest("Cassio", "seila");
        System.out.println(Cassio);
    }

}
class PersonTest{
    private Name PersonName;
    public PersonTest(Name PersonName, String Test){
        this.PersonName = PersonName;
    
}
    public static String helloWorld(){
        return "Hello World";
    }
}
