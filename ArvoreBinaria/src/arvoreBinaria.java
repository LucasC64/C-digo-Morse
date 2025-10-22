public class arvoreBinaria {
    public node raiz;

    public arvoreBinaria() {
inicializar();    }

    public void inicializar() {
        raiz = new node("", null, null);
    }


    public void inserir(String codigo, String caractere) {
        node atual = raiz;

        for (int i = 0; i < codigo.length(); i++) {
            char simbolo = codigo.charAt(i);

            if (simbolo == '.') {
                if (atual.esquerda == null) {
                    atual.esquerda = new node("", null, null);
                }
                atual = atual.esquerda;
            }
            else if (simbolo == '-') {
                if (atual.direita == null) {
                    atual.direita = new node("", null, null);
                }
                atual = atual.direita;
            }
        }
        atual.info = caractere;
    }


    public void remover(String codigo) {
        node atual = raiz;

        for (int i = 0; i < codigo.length(); i++) {
            char simbolo = codigo.charAt(i);

            if (simbolo == '.') {

                atual = atual.esquerda;
            }
            else if (simbolo == '-') {
                atual = atual.direita;
            }
        }

        if(atual.info == null){
            System.out.println("Nenhum caractere encontrado");
        }
        atual.info = "";
    }

    public String buscar(String codigo) {
        node atual = raiz;

        for (int i = 0; i < codigo.length(); i++) {
            char simbolo = codigo.charAt(i);

            if (simbolo == '.') {
                atual = atual.esquerda;
            } else if (simbolo == '-') {
                atual = atual.direita;
            }

            if (atual == null) {
                return "";
            }
        }

        return atual.info;
    }

    public void exibir() {
        exibir(raiz);
    }

    private void exibir(node atual) {
        if (atual == null) {
            return;
        }

        if (!atual.info.equals("")) {
            System.out.println(atual.info);
        }

        exibir(atual.esquerda);
        exibir(atual.direita);
    }




}
