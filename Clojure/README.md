# Clojure

Lingaguem compilada

## Imutabilidade

Em Clojure, a memória é tratada de maneira imutável. Isso significa que, uma vez que um valor é criado, ele não pode ser alterado. Em vez disso, quando você faz uma alteração em um dado, uma nova versão imutável desse dado é criada.

Por exemplo, vamos considerar uma lista em Clojure:

`(def minha-lista [1 2 3])`
Se quisermos adicionar um elemento à lista, em vez de modificar a lista original, criamos uma nova lista com o elemento adicionado:

`(def minha-nova-lista (conj minha-lista 4))`
Aqui, minha-nova-lista é uma nova lista que contém [1 2 3 4], enquanto minha-lista continua sendo [1 2 3]. A lista original não foi modificada.

Na criação da minha-nova-lista, a estrutura de dados compartilha as partes inalteradas com a minha-lista. Apenas a parte modificada é duplicada para criar a nova versão.

Em termos de memória, temos duas estruturas de dados, mas o compartilhamento de partes comuns minimiza o impacto. Isso é possível porque as estruturas de dados imutáveis não podem ser modificadas após a criação, o que garante que as versões anteriores permaneçam consistentes.

## Linguagem Homoicônica

### Clojure é uma Linguagem Homoicônica

"Código Clojure parece dados de Clojure porque os <br>
códigos Clojure são dados. Clojure usa a mesma sintaxe <br>
e estruturas de dados para representar código e dados. <br>
Assim, as chamadas de funções Clojure não se parecem <br>
apenas com listas; são listas."<br> - Livro Getting Clojure <br>

Seguindo esse principio lembramos que clojure é uma linguagem baseada em Lisp (List Processing), o que significa que em clojure tudo é lista.
