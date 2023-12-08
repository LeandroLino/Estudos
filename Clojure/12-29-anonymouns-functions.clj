;Funções anonimas

((fn [x] (* 2 x)) 2) ; Deve retornar 4

(#(* 2 %) 2) ; Deve retornar 4

(#(+ % % ) 5) ; Deve retornar 10

((fn [x y] (+ x y)) 6 4) ; Deve retornar 10

(#(+ %1 %2) 5 5) ; Deve retornar 10

;Definindo uma função anônima:

(fn [args] body)

;Exemplo:
((fn [x] (* x x)) 5) ; Retorna o quadrado de 5, ou seja, 25

;Chamando uma função anônima:
((fn [args] body) arg1 arg2 ...)

;Exemplo:
((fn [x] (+ x 1)) 5) ; Retorna 6

;Passando uma função anônima como argumento:
(funcao-de-ordem-superior #(funcao-anonima %))

;Exemplo:
(defn processar-elementos [funcao lista]
  (map #(funcao %) lista))
(processar-elementos #(str "Elemento: " %) [1 2 3]) ; Retorna ("Elemento: 1" "Elemento: 2" "Elemento: 3")

;Atribuindo uma função anônima a uma variável:
(def variavel (fn [args] body))

;Exemplo:
(def quadrado (fn [x] (* x x)))
(quadrado 5) ; Retorna 25

;Esses são apenas alguns exemplos básicos de como usar funções anônimas em Clojure.
;As funções anônimas são muito úteis para expressar lógica de forma concisa e podem ser 
;usadas em várias situações, como em funções de ordem superior, mapeamento de listas e filtragem de elementos.