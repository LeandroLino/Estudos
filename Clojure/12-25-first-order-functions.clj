;Funções de primeira ordem

;Permitem:
;Passar fungdes como argumentos de outras fun¢des
;Retornar uma fungao como resultado da execugao de uma fungao.

;Ou seja: Fungées também sao Valores.

;Em linguagens que suportam funções de primeira ordem, como Clojure, as 
;funções são tratadas como cidadãos de primeira classe. Isso permite uma 
;programação mais flexível e expressiva, pois você pode manipular funções 
;de forma dinâmica e usá-las como blocos de construção fundamentais para resolver 
;problemas complexos.

;Aqui estão alguns conceitos importantes relacionados a funções de primeira ordem:

;Atribuição de funções a variáveis:
(defn soma [a b]
  (+ a b))
(def minha-funcao soma) ; atribui a função soma à variável minha-funcao

;Passagem de funções como argumentos:
(defn aplicar-funcao [funcao x]
  (funcao x))
(aplicar-funcao inc 5) ; passa a função inc como argumento e retorna 6

;Retorno de funções como resultados:
(defn criar-funcao [x]
  (fn [y] (+ x y)))
(def soma-5 (criar-funcao 5)) ; retorna uma função que soma 5 a um número
(soma-5 3) ; chama a função retornada, resultando em 8

;Funções anônimas:
((fn [x] (* x x)) 5) ; define e chama uma função anônima que calcula o quadrado do número 5

;As funções de primeira ordem são uma parte fundamental da programação funcional e permitem a 
;criação de código modular, reutilizável e altamente flexível. Elas facilitam a aplicação de conceitos 
;como composição de funções, passagem de comportamento como argumento e abstração de algoritmos e padrões de código.

;Ao aproveitar o poder das funções de primeira ordem, você pode escrever código mais conciso, legível e 
;elegante, tornando seu programa mais modular e extensível.

;Vamos criar uma pequena regra de negócio que envolve cálculos de preços com desconto em uma loja.
(defn aplicar-desconto [preco desconto]
  (- preco (* preco (/ desconto 100.0))))

(defn calcular-preco-final [preco desconto-fn]
  (let [preco-desconto (desconto-fn preco)]
    (str "Preço final com desconto: R$ " preco-desconto)))

(defn desconto-10 [preco]
  (aplicar-desconto preco 10))

(defn desconto-20 [preco]
  (aplicar-desconto preco 20))

(def preco-produto 100.0)

(println (calcular-preco-final preco-produto desconto-10))
(println (calcular-preco-final preco-produto desconto-20))

;Neste exemplo, temos a função aplicar-desconto, que recebe um preço e um valor de 
;desconto e retorna o preço com o desconto aplicado. Em seguida, temos a função 
;calcular-preco-final, que recebe um preço e uma função de desconto como argumentos. 
;Essa função aplica o desconto fornecido pela função recebida e retorna uma string com o preço final.

;Em seguida, temos as funções desconto-10 e desconto-20, que são exemplos de funções de 
;primeira ordem. Elas recebem um preço como argumento e retornam uma função de desconto que 
;aplica um desconto de 10% e 20%, respectivamente.

;Ao chamar calcular-preco-final com preco-produto e desconto-10 ou desconto-20, obtemos o preço final com o desconto aplicado.

;Os possíveis problemas de não utilizar uma função de primeira ordem nessa situação podem incluir:

;Repetição de código: Sem o uso de funções de primeira ordem, pode ser necessário duplicar o código 
;para aplicar descontos diferentes. Isso pode levar a código redundante e difícil de manter.

;Falta de flexibilidade: Sem funções de primeira ordem, pode ser difícil estender ou modificar a 
;lógica de desconto. Se houver a necessidade de adicionar novos tipos de desconto ou alterar a forma 
;como os descontos são calculados, o código existente teria que ser modificado manualmente em vários lugares.

;Dificuldade de reutilização: Sem funções de primeira ordem, a reutilização de lógica de desconto se torna 
;mais complicada. Cada vez que um novo desconto for necessário, uma nova função teria que ser criada, levando 
;a um código mais complexo e menos modular.

;Utilizando funções de primeira ordem, como mostrado no exemplo, podemos encapsular a lógica de desconto em 
;funções independentes e reutilizáveis. Isso torna o código mais modular, flexível e fácil de manter. 
;Além disso, permite a adição de novos descontos sem a necessidade de modificar o código existente.