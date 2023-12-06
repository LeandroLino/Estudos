;true, false, truthy, falsey

;Exemplo
(if (condição)
(expressao para caso true)
(expressao para caso false))

;E se for feito dessa maneira?
(if 1
  (expressao para caso true) ; Retorna True
  (expressao para caso false)) 

(if nil
  (expressao para caso true) 
  (expressao para caso false)) ; Retorna False


(if "False"
  (expressao para caso true) ; Retorna True
  (expressao para caso false))

(= 1 true) ; False

;Em Clojure, temos os conceitos de true, false, truthy e falsey, que estão relacionados a valores booleanos e avaliação de expressões.

;TRUE: Em Clojure, true é um valor booleano que representa a verdade. 
;É usado para expressar que uma condição é verdadeira ou que um valor é verdadeiro.

;Exemplo:
(true? true)   ; Retorna true
(true? false)  ; Retorna false

;FALSE: Em Clojure, false é um valor booleano que representa a falsidade.
;É usado para expressar que uma condição é falsa ou que um valor é falso.

;Exemplo:
(false? false) ; Retorna true
(false? true)  ; Retorna false

;TRUTHY: Em Clojure, um valor é considerado "truthy" se ele é avaliado
;como verdadeiro em um contexto booleano. Isso significa que, mesmo que 
;o valor não seja estritamente true, ele é tratado como verdadeiro em expressões condicionais.

;Exemplo:
(if "hello" "truthy" "falsey") ; Retorna "truthy"
(if 0 "truthy" "falsey")       ; Retorna "truthy"
(if [] "truthy" "falsey")      ; Retorna "truthy"

;FALSEY: Em Clojure, um valor é considerado "falsey" se ele é avaliado 
;como falso em um contexto booleano. Isso significa que, mesmo que o valor 
;não seja estritamente false, ele é tratado como falso em expressões condicionais.

;Exemplo:
(if nil "truthy" "falsey")    ; Retorna "falsey"
(if false "truthy" "falsey")  ; Retorna "falsey"
(if (empty? ".") "truthy" "falsey")  ; Retorna "falsey"
;Esses conceitos são importantes para avaliar condições em expressões condicionais, 
;como if e when, onde valores truthy são executados e valores falsey são ignorados.
;Compreender essas distinções ajuda a escrever código mais claro e expressivo em Clojure.

;Vantagens e desvantagens de se ter Truthy e Falsey

;Desvantagem:
;permite passar um valor qualquer

;Vantagens:
;permite passar um valor qualquer
;permite mais dinamismo no cédigo
;simplifica bastante o cédigo

;Exemplos com and
(defn parametros-preenchidos
  [nome idade]
  (if (and nome idade)
    (println "Estao preenchidos")
    (println "Nao estao preenchidos")))
