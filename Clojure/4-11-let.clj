;Como usar let em funções?

;Exemplo com let:
(defn valor-multa
   [valor]
   (let [percentual-multa 0.1]
    (* valor percentual-multal))
;Valores definidos dentro de um let está limitado ao escopo do let
  
;Exemplo ignorando o escopo do let:
(defn valor-multa
  [valor]
   (let [percentual-multa 0.1])
    (* valor percentual-multal))
;Dessa maneira a função consegue retorna a multiplicação corretamente porque a constante "percentual-multal" não existe
;no escopo da execução da multiplicação.
;Usar o let nessas situações cria um código mais legivel, diferente deste exemplo:
(defn valor-multa
  [valor] (* valor 0.1))
;Você não faz ideia do que significa o "0.1", já no primeiro
;código isso deixa explicito que é a porcentagem do valor da multa.