;Funções puras:
;Para uma mesma entrada a saída será sempre igual
;Independente do momento
;Independente da quantidade de vezes

;Exemplo de função pura:
(defn soma
  [xy]
 (+ x y))
;Dessa forma a função soma não irá alterar nada em canto nenhum, 
;independente da situação, ela sempre terá o mesmo resultado.
  
(defn print [] (println "Sem efeitos colaterais!"))
;Função pura não muda nada, apenas retorna algo.
  
;Exemplo de função não pura:
(defn soma
  [xy]
  (if y >= 2 (+ x y) y))
;Uma função pura não pode depender de circunstâncias, 
;como um if datas, ou if valor igual no exemplo.
;E a função pura não pode depender de valores dinâmicos, como por exemplo o valor de uma moeda;
;O valor da moeda sofre alterações, e isso impacta na nossa função pura.
;Exemplo função não pura:
(defn dollar-to-real [item-value]
  (* item-value (get-real-value-dollar))) ; 1 dollar == 4,93 reais
;Esse valor pode ser diferente de acordo com o valor do dollar, o que significa que o retorno da função depende de uma outra função
;Exemplo função pura:
(defn dollar-to-real [item-value real-value-dollar]
  (* item-value real-value-dollar))
; Aqui o valor do real para dollar pode mudar, mas não é uma responsabilidade da nossa função, porque ela é pura.