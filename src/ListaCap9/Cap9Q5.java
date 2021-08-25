package ListaCap9;

public class Cap9Q5 {

    /*
    Desenhe uma hierarquia de herança para os alunos em uma universidade semelhante a hierarquia mostrada na Figura 9.2.
    Utilize 'Student' como a superclasse da hierarquia, então estenda Student com as classes UndergraduateStudent e
    'GraduateStudent'. Continue a estender a hierarquia o mais profundo (isto é, com muitos níveis) possivel. Por exemplo,
    Freshman, Sophomore, Junior e Senior [primeiranista, segundanista, terceiranista e quartanista, respectivamente]
    poderiam estender UndergraduateStudent, e DoctorsStudent e MastersStudent poderiam ser subclasses de GraduateStudent.
    Depois de desenhar a hierarquia, discuta os relacionamentos entre as classes. [Nota: voce não precisa escrever
    nenhum codigo para este exercicio.]
     */

    public static void main(String []args) {
        /*
                                            Student
                                          /         \
                         UndergraduateStudent        GraduateStudent
                                  |                         |
                                  ^                         ^
                                Senior                MastersStudent
                                  |                         |
                                  ^                         ^
                              Sophomore               DoctorsStudent
                                  |
                                  ^
                               Junior
                             (Freshman)
         */

        /*
        Entao, a logica por detras do meu esquema eh:

        1 - UndergraduateStudent (Estudantes em Graduacao): Primeiramente, ele deve ter concluido o Ens. Medio; e no caso,
        os 'Seniors' são os Formandos, seguidos pelos 'Sophomore'(2° ano), e por fim, os 'Juniors'(1° ano/calouros).

        2 - GraduateStudent (Graduados): Sua hierarquia eh invertida, uma vez que eles são tem menor grau de
        escolaridade do que os MastersStudent (Mestrandos), e esses por sua vez tem menos escolaridade do que os
        DoctorsStudent (Doutorandos).
         */
    }
}
