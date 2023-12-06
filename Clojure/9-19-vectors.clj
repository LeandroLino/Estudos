;Vectores

;Acessando elementos de um vetor:
(def vetor [1 2 3 4 5])
(nth vetor 0)  ; Acessa o primeiro elemento do vetor (retorna 1)
(nth vetor 2)  ; Acessa o terceiro elemento do vetor (retorna 3)

;Adicionando elementos a um vetor:
(def vetor [1 2 3])
(conj vetor 4)  ; Adiciona o elemento 4 ao vetor (retorna [1 2 3 4])

;Removendo elementos de um vetor:
(def vetor [1 2 3 4 5])
(subvec vetor 1 4)  ; Remove os elementos de índice 1 a 3 do vetor (retorna [2 3 4])

;Aplicando uma função a cada elemento do vetor:
(def vetor [1 2 3])
(map inc vetor)  ; Aplica a função inc a cada elemento do vetor (retorna [2 3 4])

;Filtrando elementos de um vetor:
(def vetor [1 2 3 4 5])
(filter even? vetor)  ; Filtra os elementos pares do vetor (retorna [2 4])

;Reduzindo um vetor a um único valor:
(def vetor [1 2 3 4 5])
(reduce + vetor)  ; Soma todos os elementos do vetor (retorna 15)
;Esses são apenas alguns exemplos básicos de manipulações de vetores em Clojure. 
;Clojure possui uma ampla gama de funções e operações que podem ser aplicadas a 
;vetores e outras estruturas de dados, permitindo uma manipulação poderosa e expressiva dos dados.