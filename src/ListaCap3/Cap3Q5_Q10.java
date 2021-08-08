package ListaCap3;

import javax.swing.JOptionPane;

public class Cap3Q5_Q10 {

    public static void main(String []args){

        /*
        Perguntas:

        3.5 Qual eh o proposito da palavra-chave 'new' ? Explique o que acontece quando voce a utiliza.
        Resp.: Cria um novo objeto da classe que deve estar especificada ao lado da palavra-chave.
        Ao usar a palavra 'new' no programa, voce está inicializando um novo objeto que contera um metodo especifico.

        3.6 O que eh um construtor padrao? Como as variaveis de instancia de um objeto sao inicializadas se
        uma classe tiver somente 1 'construtor padrao' ?
        Resp.: O construtor padrao (default constructor) é aquele que o compilador da JVM cria para o programa. Se foi
        criado pelo desenvolvedor, ele nao é do tipo 'padrao'.

        3.7 Explique o proposito de uma 'variavel de instancia'.
        Resp.: Variaveis de instancia armazenam dados para instancias individuais de uma classe. Por exemplo, na
        classe "GradeBook", uma variavel de instancia poderia ser: private String Note1;

        3.8 A maioria de classes precisa ser importada antes de poder ser utilizada em um aplicativo. Por que cada
        aplicativo pode utilizar as classes 'System' e 'String' sem antes importar?
        Resp.: Classes 'System' e 'String' pertencem ao pacote 'java.lang' e elas não precisam ser importadas; pois
        sao nativas da propria linguagem Java.

        3.10 Explique: Por que uma classe deve fornecer um metodo 'set' e um metodo 'get' para uma 'variavel de instancia'.
        Resp.: O metodo 'set' armazena uma informacao do objeto da classe. O metodo 'get' obtem o nome da instancia.
        O metodo 'set' nao retorna qualquer dado quando ele completa sua tarefa, portanto, seu tipo de retorno: 'void'.
        O metodo 'get' devolve um objeto especifico da classe.

        */

        // Logo abaixo, essa linha vai emitir uma janela com a mensagem: "Welcome to Intellij IDEA"
        JOptionPane.showMessageDialog(null,"Welcome to \nIntellij IDEA");

    }
}

