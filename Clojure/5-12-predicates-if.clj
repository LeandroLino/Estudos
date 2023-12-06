;Predicatos
;Os predicados podem ser usados em conjunto com funções de ordem superior, como filter, para filtrar elementos com base em uma condição:

(filter number? [1 "two" 3 "four"])  ; Retorna (1 3)
;Também podem ser usados em estruturas de controle condicionais, como if, para tomar decisões com base em testes lógicos:

(defn positive? [x]
  (if (pos? x)
    true
    false))

(positive? 5)   ; Retorna true
(positive? -2)  ; Retorna false
;Esses exemplos ilustram como os predicados podem ser usados para verificar condições e 
;tomar decisões com base em testes lógicos em Clojure. Eles fornecem uma forma concisa e 
;expressiva de trabalhar com dados e controlar o fluxo do programa.

;Statements e expressions

;Statements:
;Abordagem imperativa
;Não tem retorno
;Exemplo:
(if (number? value)
  (deposit-value value))
;Se o x for positivo eu permito atualizações no usuário

;Exemplo com else:
(if (number? value)
  (deposit-value value)
  (deposit-value (Integer/parseInt value))) ;Está tentando converter algo que não é numero para um inteiro

;Expressions:
;Abordagem declarativa
;Sempre tem um reforno
;Exemplo:
(if (maior-idade? idade)
  "Entrada autorixada"
  "Entrada negada")

(let [(if (pos? value)
  (deposit-value)
  (get-error 403))])
;São ifs que você utilizara para retorna algo para uma constante ou função
;No ultimo exemplo queremos que caso o numero seja negativo ele não pode ser
;depositado e deve retorna um Forbidden para a requisição, o que torna isso uam expression.