import java.util.Scanner;

public class Merchant {
    private Node rootNode;

    public Merchant() {
        // Construção da árvore de decisão do mercador.
        // As folhas (Node decision"X") são os nós finais da árvore de decisão.
        // Question sendo igual a null por não ter mais perguntas a serem feitas, reward sendo igual a null por ainda não ter uma
        // Recompensa atribuída e não há a necessidade de yesNode ter nó filho porque não tem mais perguntas, por isso é null.
        Node decision1 = new Node(null, null, null, "Perde 1 moeda e ganha 1 de limiar na jóia.");
        Node decision2 = new Node(null, null, null, "Perde 1 moeda.");
        Node decision3 = new Node(null, null, null, "Pere 1 moeda e ganha 2 de limiar na jóia.");
        Node decision4 = new Node(null, null, null, "Ganha 2 moedas.");
        Node decision5 = new Node(null, null, null, "Perde 3 moedas e ganha 2 de limiar na jóia.");
        Node decision6 = new Node(null, null, null, "Perde 2 moedas.");
        Node decision7 = new Node(null, null, null, "Perde 1 moeda e ganha 3 de limiar na jóia.");
        Node decision8 = new Node(null, null, null, "Perde 3 moedas.");

        // "innerDecision"
        Node innerDecision1 = new Node("Disctância é menor que 3?", decision1, decision2, null);
        Node innerDecision2 = new Node("Distância é maior ou igual a 3?", decision3, decision4, null);
        Node innerDecision3 = new Node("Deseja trocar suas moedas por limiar na jóia?", decision5, decision6, null);
        Node innerDecision4 = new Node("Deseja trocar suas moedas por limiar na jóia?", leafNode7, leafNode8, null);

        rootNode = new Node("Quantas moedas de transporte você tem?", innerDecision1, innerDecision2, null);

        innerDecision1.yesNode = innerDecision3;
        innerDecision1.noNode = innerDecision4;
        innerDecision2.yesNode = innerDecision3;
        innerDecision2.noNode = innerDecision4;
        innerDecision3.yesNode = decision7;
        innerDecision3.noNode = decision8;
    }
}
